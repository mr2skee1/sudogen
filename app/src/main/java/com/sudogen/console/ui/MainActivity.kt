package com.sudogen.console.ui

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = "SudoGen Console v0.1: Build successful!"
        setContentView(textView)
    }
}
