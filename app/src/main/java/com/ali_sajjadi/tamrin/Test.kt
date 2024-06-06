package com.ali_sajjadi.tamrin

class Test private constructor(){

    //singleton pattern
    companion object {

        val instance: Test by lazy {
            Test()
        }

    }

}