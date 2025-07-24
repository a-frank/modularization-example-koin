package com.photoroom.dataprovider.user.model

import java.util.Date

sealed interface UserPlan {
    data object Free : UserPlan
    data class Pro(val expirationDate: Date) : UserPlan
    data class Max(val expirationDate: Date) : UserPlan
}