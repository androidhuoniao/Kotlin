package com.grass.kotlin

import android.app.Activity
import android.util.Log

/**
 *
 * Created by grassswwang
 * on 2020/5/19
 * Email: grassswwang@tencent.com
 */
object PlusFontChecker {
    fun check(context: Activity) {
        val fontScale = context.resources.configuration.fontScale
        Log.i("grass", "fontScale is " + fontScale)
        Log.i("grass", "fontScale is $fontScale")
        tryShowTextSizeAdjustDialog(context)
    }

    fun tryShowTextSizeAdjustDialog(context: Activity) {
        Log.i("grass","tryShowTextSizeAdjustDialog is working")
    }
}