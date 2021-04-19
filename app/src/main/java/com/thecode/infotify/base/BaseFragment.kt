package com.thecode.infotify.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.thecode.aestheticdialogs.AestheticDialog
import com.thecode.infotify.R

open class BaseFragment: Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    fun showErrorDialog(title: String, description: String){
        AestheticDialog.showRainbow(
            activity,
            title,
            description,
            AestheticDialog.ERROR)
    }

    fun showSuccessDialog(title: String, description: String){
        AestheticDialog.showRainbow(
            activity,
            title,
            description,
            AestheticDialog.SUCCESS)
    }
}