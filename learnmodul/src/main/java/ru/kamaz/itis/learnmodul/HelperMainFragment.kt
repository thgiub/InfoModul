package ru.kamaz.itis.learnmodul

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import ru.quantor.launcherkamaz.HelperMainInterface



class HelperMainFragment : Fragment(), HelperMainInterface.View {
    var presenter: HelperMainInterface.Presenter? = null
    private lateinit var textViewWebSite: TextView
    private lateinit var imageViewPhone: ImageView
    private lateinit var lin: ConstraintLayout

    val bundle: Bundle? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val popa = inflater.inflate(R.layout.fragment_helper_main, container, false)
        imageViewPhone = popa.findViewById(R.id.imageViewPhone)
        textViewWebSite = popa.findViewById(R.id.textViewWebSite)
        lin = popa.findViewById(R.id.lin)

        lin.setOnClickListener {
            activity?.let {
                val intent = Intent()
                intent.putExtra(Constants.PHONE, Constants.HELP_NUMBER)
                it.setResult(Activity.RESULT_OK, intent)
                it.finish()
            }
        }

        textViewWebSite.setOnClickListener {
            val browserIntent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kamaz.ru"))
            startActivity(browserIntent)
        }
        return popa

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners()

    }

    override fun setListeners() {


    }

    override fun initVars() {

    }

    override fun initContent() {
        TODO("Not yet implemented")
    }
}

private operator fun Bundle?.invoke(bundle: Bundle?) {
    TODO("Not yet implemented")
}




