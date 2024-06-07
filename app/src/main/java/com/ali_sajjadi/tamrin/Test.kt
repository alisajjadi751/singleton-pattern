package com.ali_sajjadi.tamrin

import android.util.Log
import java.text.DecimalFormat

class Test private constructor(){


    companion object {

        val instance: Test by lazy {
            Test()
        }

    }

    fun showLog(){

        val price = 1000000000L
        val df = DecimalFormat("0,000")

        Log.i("TESTING","${df.format(price)} ")
    }

}