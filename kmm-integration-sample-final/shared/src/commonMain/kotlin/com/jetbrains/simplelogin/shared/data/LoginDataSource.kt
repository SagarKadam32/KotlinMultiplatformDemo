package com.jetbrains.simplelogin.shared.data

import com.jetbrains.simplelogin.shared.data.model.LoggedInUser
import com.jetbrains.simplelogin.shared.randomUUID

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication

            return if (username == "sagar.kadam@gmail.com" && password == "123456") {
                val fakeUser = LoggedInUser(randomUUID(), username)
                Result.Success(fakeUser)
            }else {
                Result.Error(RuntimeException("Error logging in"))
            }
        } catch (e: Throwable) {
            return Result.Error(RuntimeException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}