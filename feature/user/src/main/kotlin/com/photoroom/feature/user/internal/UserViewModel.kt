package com.photoroom.feature.user.internal

import android.graphics.Bitmap
import androidx.core.graphics.createBitmap
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.photoroom.aggregator.aibackground.GenerateAiBackgroundPlanUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class UserViewModel(
    generateAiBackgroundPlanUseCase: GenerateAiBackgroundPlanUseCase,
) : ViewModel() {

    private val promptState = MutableStateFlow("")
    private val sourceState = MutableStateFlow(createBitmap(100, 100))

    private val generatedImageState = MutableStateFlow<Bitmap?>(null)

    val state = generatedImageState.map {
        UserViewState(it)
    }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = UserViewState(generatedImage = null)
        )

    init {
        // normally done on a user interaction
        viewModelScope.launch {
            generateAiBackgroundPlanUseCase(sourceState.value, promptState.value)
                .onSuccess { generatedImage ->
                    generatedImageState.update { generatedImage }
                }
        }
    }

}