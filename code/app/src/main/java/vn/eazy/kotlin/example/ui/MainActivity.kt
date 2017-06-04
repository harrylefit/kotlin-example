package vn.eazy.kotlin.example.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import vn.eazy.kotlin.example.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnExtension.setOnClickListener(this)
        btnOperatorOverloading.setOnClickListener(this)
        btnHigherOrder.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            btnExtension -> startActivity(Intent(this, ExtensionDemoActivity::class.java))
            btnOperatorOverloading -> startActivity(Intent(this, OperatorOverloadingActivity::class.java))
            btnHigherOrder -> startActivity(Intent(this, HigherOrderFunctionsActivity::class.java))
        }
    }
}
