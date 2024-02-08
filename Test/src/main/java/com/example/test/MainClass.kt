package com.example.test

import android.content.Context
import android.util.Log
import android.widget.Toast

class MainClass {
    fun mainFun(context: Context) {
        Log.i("Library log", context.getString(R.string.test_text))
    }
}