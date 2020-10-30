package com.padcx.happy_food_delivery.data.models

import com.padcx.happy_food_delivery.network.auth.AuthManager
import com.padcx.happy_food_delivery.network.auth.FirebaseAuthManagerImpl

object AuthenticationModelImpl: AuthenticationModel {

    override var mAuthManager: AuthManager = FirebaseAuthManagerImpl

    override fun login(
        email: String,
        password: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        mAuthManager.login(email, password, onSuccess, onFailure)
    }

    override fun register(
        email: String,
        password: String,
        useName: String,
        userPhone: String,
        onSuccess: () -> Unit,
        onFailure: (String) -> Unit
    ) {
        mAuthManager.register(email, password, useName, userPhone, onSuccess, onFailure)
    }
}