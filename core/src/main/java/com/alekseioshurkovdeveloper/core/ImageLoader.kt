package com.alekseioshurkovdeveloper.core

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

/**
 * Extensions for load image from server, is loading with [Context]
 */
fun ImageView.showImage(url:String, ctx: Context){
    Glide.with(ctx)
        .load(url)
        .into(this)
}

/**
 * Extensions for load image from server, is loading with [Activity]
 */
fun ImageView.showImage(url:String, activity: Activity){
    Glide.with(activity)
        .load(url)
        .into(this)
}

/**
 * Extensions for load image from server, is loading with [Fragment]
 */
fun ImageView.showImage(url:String, fragment: Fragment){
    Glide.with(fragment)
        .load(url)
        .into(this)
}
