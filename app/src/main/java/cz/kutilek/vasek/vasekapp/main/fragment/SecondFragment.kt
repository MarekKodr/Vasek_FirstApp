package cz.kutilek.vasek.vasekapp.main.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import cz.kutilek.vasek.vasekapp.R
import cz.kutilek.vasek.vasekapp.main.viewmodel.FirstViewModel
import cz.kutilek.vasek.vasekapp.main.viewmodel.SecondViewModel
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment() {

    private lateinit var viewModel: SecondViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProviders.of(this).get(SecondViewModel::class.java)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setView()
    }

    private fun setView() {
        viewModel.data.observe(this, Observer {
            data.text = it
        })

        loadData.setOnClickListener {
            viewModel.loadData()
        }

    }


}
