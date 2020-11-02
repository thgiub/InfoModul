package ru.quantor.launcherkamaz

import java.io.IOException

interface HelperMainInterface {
    interface View {
        fun setListeners()
        fun initVars()
        fun initContent()
    }

    interface Presenter {
        fun setView(view: View?)
        fun init()
        fun onResume()
        fun onPause()
        fun enableEditMode(enable: Boolean)
        fun onVideoCheckedChanged(itemID: Int, isChecked: Boolean)
        fun removeListener()
        fun addListener()
    }
}