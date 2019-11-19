package com.example.ozonuiautomatorproject.application

import androidx.test.uiautomator.By
import com.example.ozonuiautomatorproject.util.byStringRes
import com.example.ozonuiautomatorproject.util.ext.waitFindObject

class OzonLoginOrRegistrationPage: AbstractApplication("ru.ozon.app.android") {

    private val listItem = byStringRes("ru.ozon.app.android:id/listRv")

    fun clickSignInByMail(){
        //TODO не кликает на селектор
        listItem.waitFindObject().findObject(By.text("Войти по почте")).click()
    }
}