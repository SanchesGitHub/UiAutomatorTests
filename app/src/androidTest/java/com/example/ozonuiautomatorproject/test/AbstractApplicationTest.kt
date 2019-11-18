package com.example.ozonuiautomatorproject.test

import android.util.Log
import com.example.ozonuiautomatorproject.application.AbstractApplication
import com.example.ozonuiautomatorproject.util.device
import org.junit.Before

abstract class AbstractApplicationTest<T : AbstractApplication>(val app : T) {

    @Before
    fun assertPackageInstalled() {
        app.assertInstalled()
    }

    @Before
    fun clearCache() {
        device.executeShellCommand("pm clear ${app.packageName}")
        Log.d("Selector", "Cache clear")
    }
}
