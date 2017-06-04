package vn.eazy.kotlin.example.extension

import android.graphics.drawable.Drawable
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target

/**
 * Created by harryle on 6/3/17.
 */
inline fun ImageView.loadImageFromUrl(url: String) {
    Glide.with(context).load(url).listener(object : RequestListener<Drawable> {
        override fun onResourceReady(resource: Drawable?, model: Any?, target: Target<Drawable>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
            Log.d("Load","Ready")
            return false
        }

        override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Drawable>?, isFirstResource: Boolean): Boolean {
            Log.d("Load","Failed")
            return false
        }

    }).into(this)
}