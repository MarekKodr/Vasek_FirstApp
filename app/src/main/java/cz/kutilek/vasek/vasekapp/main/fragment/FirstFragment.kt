package cz.kutilek.vasek.vasekapp.main.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import cz.kutilek.vasek.vasekapp.R
import cz.kutilek.vasek.vasekapp.main.viewmodel.FirstViewModel
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {

    //just a variable to hold viewModel
    private lateinit var viewModel: FirstViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //registration of viewModel for this fragment
        viewModel = ViewModelProviders.of(this).get(FirstViewModel::class.java)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        goToSecond.setOnClickListener {
            findNavController().navigate(R.id.secondFragment)
        }

        setView()

    }

    /*
    * init my View by some data
    * */
    private fun setView() {
        //observe method from viewModel. after value is changed, observer receives updated data
        viewModel.getData().observe(this, Observer {data ->
            titleTextView.text = data
        })
    }

}
