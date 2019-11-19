package com.example.ozonuiautomatorproject.application

import com.example.ozonuiautomatorproject.util.byStringRes
import com.example.ozonuiautomatorproject.util.ext.waitFindObject

open class OzonMainPage: AbstractApplication("ru.ozon.app.android") {

    private val searchSelector = byStringRes("ru.ozon.app.android:id/searchTv")
    private val menuFavorites = byStringRes("ru.ozon.app.android:id/menu_favorites")
    private val menuProfile = byStringRes("ru.ozon.app.android:id/menu_profile")

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }

    fun clickMenuFavorites() {
        menuFavorites.waitFindObject().click()
    }

    fun clickMenuProfile() {
        menuProfile.waitFindObject().click()
    }
}
