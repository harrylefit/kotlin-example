package vn.eazy.kotlin.example.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_extension_demo.*
import vn.eazy.kotlin.example.R
import vn.eazy.kotlin.example.extension.loadImageFromUrl
import vn.eazy.kotlin.example.model.User

/**
 * Created by harryle on 6/3/17.
 */
class ExtensionDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extension_demo)
        ivExtension.loadImageFromUrl("https://scontent.fsgn4-1.fna.fbcdn.net/v/t31.0-8/16422952_540278646181253_7862103094487950638_o.jpg?oh=cc3c37bae119e293a0ec0c2cef7d7c75&oe=59AB5EA2")

        val user1 = User("Harry", 10)
        val user2 = User("Harry", 10)
        if (user1 == user2) {
            Log.d("Test", "equal")
        }


        if (user1 === user2) {
            Log.d("Test", "not")
        }

        val user3 = user1.copy(age = 24)

        Log.d("Data", user1.toString())

        Log.d("Data", user3.toString())
    }
}


