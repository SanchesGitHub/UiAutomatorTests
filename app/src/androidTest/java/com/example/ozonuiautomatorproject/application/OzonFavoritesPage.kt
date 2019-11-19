package com.example.ozonuiautomatorproject.application

import com.example.ozonuiautomatorproject.util.byStringRes
import com.example.ozonuiautomatorproject.util.ext.waitFindObject

class OzonFavoritesPage {

    private val toolbarSelector = byStringRes("ru.ozon.app.android:id/toolbarTb")
    private val productSelector = byStringRes("ru.ozon.app.android:id/rootCl")

    fun getTextToolbar(): String {
        return toolbarSelector.waitFindObject().children[0].text
    }

    fun getFavoriteProduct(): String {
        return productSelector.waitFindObject().findObjects(byStringRes("ru.ozon.app.android:id/titleTv"))[0].text
    }
}