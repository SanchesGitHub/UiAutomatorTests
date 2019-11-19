package com.example.ozonuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.ozonuiautomatorproject.application.OzonMainPage
import com.example.ozonuiautomatorproject.application.OzonSearchPage
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SearchInOzonTest : AbstractApplicationTest<OzonMainPage>(OzonMainPage()) {

    private val ozonSearchPage = OzonSearchPage()

    @Test
    fun checkingProductSearchHintsTest() = with(app) {
        open()
        clickSearch()
        ozonSearchPage.typeToSearch("философия java")
        assert(ozonSearchPage.getTitleProduct() == "Философия Java")
        assert(ozonSearchPage.getPriceProduct() == "1 499 \u20BD")
    }
}