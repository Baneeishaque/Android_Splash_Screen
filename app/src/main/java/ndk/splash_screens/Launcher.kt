package ndk.splash_screens

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Launcher : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Make sure this is before calling super.onCreate
        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        //Other Methods
    }
}
