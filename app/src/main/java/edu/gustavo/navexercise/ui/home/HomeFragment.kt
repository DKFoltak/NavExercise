package edu.gustavo.navexercise.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import edu.gustavo.navexercise.R

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        val buttonH = root.findViewById<Button>(R.id.button_fragment_home)
        buttonH.setOnClickListener{ Navigation.findNavController(it).navigate(R.id.action_navigation_home_to_blankFragment1)}
        val buttonC = root.findViewById<Button>(R.id.button_change_direction)
        buttonC.setOnClickListener{Navigation.findNavController(it).navigate(R.id.action_navigation_home_to_secondBlankFragment)}
        return root
    }
}