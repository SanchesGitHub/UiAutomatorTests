package com.example.ozonuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.ozonuiautomatorproject.application.OzonLoginOrRegistrationPage
import com.example.ozonuiautomatorproject.application.OzonMainPage
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ValidationEMailTest: AbstractApplicationTest<OzonMainPage>(OzonMainPage()) {

    private val ozonLoginOrRegistrationPage = OzonLoginOrRegistrationPage()

    @Test
    fun validationOfEMailValidationDuringAuthorization() = with(app) {
        open()
        clickMenuProfile()
        ozonLoginOrRegistrationPage.clickSignInByMail()
    }
}