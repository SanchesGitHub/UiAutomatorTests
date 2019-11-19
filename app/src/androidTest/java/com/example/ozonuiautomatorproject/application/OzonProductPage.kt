package com.example.ozonuiautomatorproject.application

import com.example.ozonuiautomatorproject.util.byStringRes
import com.example.ozonuiautomatorproject.util.ext.waitFindObject

class OzonProductPage {

    private val favoritesSelector = byStringRes("ru.ozon.app.android:id/favoritesIv")

    fun addToFavorites() {
        favoritesSelector.waitFindObject().click()
    }
}