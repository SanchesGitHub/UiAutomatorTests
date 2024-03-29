package com.example.ozonuiautomatorproject.application

import android.content.Intent
import com.example.ozonuiautomatorproject.util.context
import com.example.ozonuiautomatorproject.util.device
import org.junit.Assert.assertNotNull

abstract class AbstractApplication(val packageName: String) {

    open fun open() {
        val intent = context.packageManager.getLaunchIntentForPackage(packageName)?.apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        device.pressHome()
        context.startActivity(intent)
    }

    fun assertInstalled() {
        assertNotNull(
                "App $packageName is not installed",
                context.packageManager.getLaunchIntentForPackage(packageName)
        )
    }
}
