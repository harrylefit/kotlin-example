package vn.eazy.kotlin.example.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import vn.eazy.kotlin.example.R
import vn.eazy.kotlin.example.extension.combine
import vn.eazy.kotlin.example.model.User

/**
 * Created by harryle on 6/4/17.
 */
class OperatorOverloadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operator_overloading)
        val user = User(name = "Harry", age = 24)
        val user2 = User(name = "Long", age = 23)
        val user3 = user + user2
        Log.d("data",user3.toString())

        //Infix extension
        val user4 = user combine user2
        Log.d("Infix data",user4.toString())
    }
}