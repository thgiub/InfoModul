package ru.quantor.launcherkamaz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import ru.kamaz.itis.learnmodul.HelperMainFragment
import ru.kamaz.itis.learnmodul.R

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        val fragment: Fragment = HelperMainFragment()
        transaction.replace(R.id.fragment_help, fragment)
    }
}