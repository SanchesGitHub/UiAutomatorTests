package com.example.ozonuiautomatorproject.application

import com.example.ozonuiautomatorproject.util.byStringRes
import com.example.ozonuiautomatorproject.util.ext.waitFindObject

class OzonApp: AbstractApplication("ru.ozon.app.android") {

    private val searchSelector = byStringRes("ru.ozon.app.android:id/searchTv")
    private val searchInputSelector = byStringRes("ru.ozon.app.android:id/search_src_text")
    private val searchProductTitle = byStringRes("ru.ozon.app.android:id/titleTv")
    private val searchProductPrice = byStringRes("ru.ozon.app.android:id/priceTv")
    private val searchViewGroup = byStringRes("ru.ozon.app.android:id/listRv")

    fun clickSearch() {
        searchSelector.waitFindObject().click()
    }

    fun typeToSearch(text: String) {
        searchInputSelector.waitFindObject().text = text
    }

    fun getProductTitle(): String {
        return searchViewGroup.waitFindObject().children[2].findObject(searchProductTitle).text
    }

    fun getProductPrice(): String {
        return searchViewGroup.waitFindObject().children[2].findObject(searchProductPrice).text
    }

}