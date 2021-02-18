package com.katepatty.katesshop

import android.graphics.drawable.Drawable
import androidx.core.graphics.drawable.toDrawable

fun converter(st: String): Int {

    var imgSetter = R.drawable.a.toInt()
    when (st) {
        "sparkling model" -> imgSetter = R.drawable.a
        "venus model"-> imgSetter = R.drawable.b
        "free styles model"-> imgSetter = R.drawable.c
        "fancy model" -> imgSetter = R.drawable.d
        "lucky model" -> imgSetter = R.drawable.e
        "chic dark model" -> imgSetter = R.drawable.f
    }
    return imgSetter.toInt()
}

fun pricer(st: String): String {

    var price = "890"

    when (st) {
        "sparkling model" -> price = "1000"
        "venus model"-> price = "990"
        "free styles model"->  price = "2000"
        "fancy model" ->  price = "750"
        "lucky model" ->  price = "2400"
        "chic dark model" -> price ="980"
    }
    return price
}


fun stocker(st: String): String {

    var inventory = "10 pairs"

    when (st) {
        "sparkling model" -> inventory = "30 pairs"
        "venus model"-> inventory = "3 pairs"
        "free styles model"->  inventory = "8 pairs"
        "fancy model" ->  inventory = "7 pairs"
        "lucky model" ->  inventory = "21 pairs"
        "chic dark model" -> inventory ="9 pairs"
    }
    return inventory
}