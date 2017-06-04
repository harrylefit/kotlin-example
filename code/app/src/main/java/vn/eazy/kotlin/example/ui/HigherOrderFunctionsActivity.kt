package vn.eazy.kotlin.example.ui

import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_operator_overloading.*
import vn.eazy.kotlin.example.R

/**
 * Created by harryle on 6/4/17.
 */
class HigherOrderFunctionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operator_overloading)
        runOnLollipopOrAbove {
            Log.d("Higher order function","Yeah")
            tvContent.text = "Higher order function"
        }
    }

    fun runOnLollipopOrAbove(func: () -> Unit) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            func()
        }
    }
}