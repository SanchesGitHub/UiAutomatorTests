package com.example.ozonuiautomatorproject.application

import com.example.ozonuiautomatorproject.util.byStringRes
import com.example.ozonuiautomatorproject.util.byText
import com.example.ozonuiautomatorproject.util.ext.*
import org.junit.Assert.assertTrue

class PlayMarket : AbstractApplication("com.android.vending") {

    private val searchSelector = byStringRes("com.android.vending:id/search_bar_hint")
    private val searchInputSelector = byStringRes("com.android.vending:id/search_bar_text_input")
    private val installButton = byText("Установить")
    private val openInstalledAppButton = byText("Открыть")

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }

    fun typeToSearch(text: String) {
        searchInputSelector.waitFindObject().text = text
    }

    fun clickResult(resultName: String) {
        byText(resultName).waitFindObject().click()
    }

    fun clickInstall() {
        installButton.waitFindObject().click()
    }

    fun waitForInstalled() {
        assertTrue(
                "Приложение не было установлено",
                openInstalledAppButton
                        .waitFindObject()
                        .waitIsClickable(true, 20.secondsToMillis())
        )
    }

    fun openInstalledApp() {
        openInstalledAppButton.findObject().clickAndWaitnewWindow()
    }
}
