package com.anonym.tinyaes

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testResult = testAES()
        textView.text = if (testResult == 0) "Tests passed (successful)" else "Tests failed"
    }

    private external fun testAES(): Int

    companion object {
        init {
            System.loadLibrary("test-aes")
        }
    }
}
