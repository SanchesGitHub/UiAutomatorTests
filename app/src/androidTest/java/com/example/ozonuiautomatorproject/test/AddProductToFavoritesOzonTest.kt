package com.example.ozonuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.ozonuiautomatorproject.application.OzonFavoritesPage
import com.example.ozonuiautomatorproject.application.OzonMainPage
import com.example.ozonuiautomatorproject.application.OzonProductPage
import com.example.ozonuiautomatorproject.application.OzonSearchPage
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AddProductToFavoritesOzonTest : AbstractApplicationTest<OzonMainPage>(OzonMainPage()) {

    private val ozonFavoritesPage = OzonFavoritesPage()
    private val ozonProductPage = OzonProductPage()
    private val ozonSearchPage = OzonSearchPage()

    @Test
    fun addProductToFavoritesTest() = with(app) {
        open()
        clickSearch()
        ozonSearchPage.typeToSearch("философия java")
        ozonSearchPage.openProduct()
        ozonProductPage.addToFavorites()
        clickMenuFavorites()
        assert(ozonFavoritesPage.getTextToolbar() == "Избранное")
        assert(ozonFavoritesPage.getFavoriteProduct() == "Философия Java")
    }
}