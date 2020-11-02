package ru.kamaz.itis.infomodul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.quantor.launcherkamaz.HelpActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textt.setOnClickListener {
            val randomIntent = Intent(this, HelpActivity::class.java)
            startActivity(randomIntent)
        }

    }


}