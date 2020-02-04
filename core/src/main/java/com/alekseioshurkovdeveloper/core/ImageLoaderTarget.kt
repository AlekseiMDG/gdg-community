package com.alekseioshurkovdeveloper.core

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition

class ImageLoaderTarget {

    companion object {

        fun loadRoundedImageIntoTarget(context: Context, url: String, load: (Drawable) -> Unit) {
            val options: RequestOptions = RequestOptions.circleCropTransform()
            val target = object : CustomTarget<Drawable>() {

                override fun onLoadCleared(placeholder: Drawable?) {
                }

                override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
                    load(resource)
                }
            }
            loadImageIntoTarget(context, url, target, options)
        }

        fun loadRoundedImageIntoTarget(context: Fragment, url: String, load: (Drawable) -> Unit) {
            val options: RequestOptions = RequestOptions.circleCropTransform()
            val target = object : CustomTarget<Drawable>() {

                override fun onLoadCleared(placeholder: Drawable?) {

                }

                override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
                    load(resource)
                }
            }
            loadImageIntoTarget(context, url, target, options)

        }

        fun loadImageIntoTarget(ctx: Context, url: String,target: CustomTarget<Drawable>, options: RequestOptions = RequestOptions.noTransformation()){
            Glide
                .with(ctx)
                .applyDefaultRequestOptions(options)
                .load(url)
                .into(target)
        }

        fun loadImageIntoTarget(ctx: Fragment, url: String,target: CustomTarget<Drawable>, options: RequestOptions = RequestOptions.noTransformation()){
            Glide
                .with(ctx)
                .applyDefaultRequestOptions(options)
                .load(url)
                .into(target)
        }
    }
}