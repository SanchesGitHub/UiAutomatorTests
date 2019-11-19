package com.example.ozonuiautomatorproject.application

import com.example.ozonuiautomatorproject.util.byStringRes
import com.example.ozonuiautomatorproject.util.ext.waitFindObject

open class OzonSearchPage {

    private val searchInputSelector = byStringRes("ru.ozon.app.android:id/search_src_text")
    private val searchProductTitle = byStringRes("ru.ozon.app.android:id/titleTv")
    private val searchProductPrice = byStringRes("ru.ozon.app.android:id/priceTv")
    private val searchViewGroup = byStringRes("ru.ozon.app.android:id/listRv")

    fun typeToSearch(text: String) {
        searchInputSelector.waitFindObject().text = text
    }

    fun getTitleProduct(): String {
        return searchViewGroup.waitFindObject().children[2].findObject(searchProductTitle).text
    }

    fun getPriceProduct(): String {
        return searchViewGroup.waitFindObject().children[2].findObject(searchProductPrice).text
    }

    fun openProduct() {
        searchViewGroup.waitFindObject().children[2].findObject(searchProductPrice).click()
    }

}