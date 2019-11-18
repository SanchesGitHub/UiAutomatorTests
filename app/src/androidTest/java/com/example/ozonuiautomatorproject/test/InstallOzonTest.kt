package com.example.ozonuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.ozonuiautomatorproject.application.PlayMarket
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class InstallOzonTest: AbstractApplicationTest<PlayMarket>(PlayMarket()) {

    @Test
    fun installOzon() = with(app) {
        open()
        clickSearch()
        typeToSearch("ozon.ru")
        clickResult("ozon.ru – интернет-магазин")
        clickInstall()
        waitForInstalled()
        openInstalledApp()
    }
}
