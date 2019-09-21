package br.com.caelum.runfreeapp.view

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("from")
fun load(view: ImageView, url: String) {
    Picasso.get().load(url).into(view)
}