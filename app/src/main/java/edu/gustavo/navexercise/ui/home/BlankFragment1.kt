package edu.gustavo.navexercise.ui.home

import android.os.Bundle
import android.os.Parcel
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import edu.gustavo.navexercise.R

class BlankFragment1() : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank1, container, false)
        val button = view.findViewById<Button>(R.id.button_fragment_blank1)
        button.setOnClickListener{Navigation.findNavController(it).navigate(R.id.action_blankFragment1_to_blankFragment2)}
        return view
    }

}