package com.dimas.dimasweather.fragments

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.canvas.CanvasCompat

fun Fragment.isPermissionGranted(p: String): Boolean {

    return ContextCompat.checkSelfPermission(activity as AppCompatActivity, p) ==
            PackageManager.PERMISSION_GRANTED
}