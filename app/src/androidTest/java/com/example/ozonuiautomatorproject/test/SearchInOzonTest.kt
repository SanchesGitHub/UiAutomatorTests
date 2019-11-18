package com.example.ozonuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.ozonuiautomatorproject.application.OzonApp
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SearchInOzonTest : AbstractApplicationTest<OzonApp>(OzonApp()) {

    @Test
    fun checkingProductSearchHints() = with(app) {
        open()
        clickSearch()
        typeToSearch("философия java")
        assert(getProductTitle() == "Философия Java")
        assert(getProductPrice() == "1 499 \u20BD")
    }
}