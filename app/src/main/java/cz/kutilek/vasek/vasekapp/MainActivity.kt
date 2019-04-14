package cz.kutilek.vasek.vasekapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cz.kutilek.vasek.vasekapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Old code

//        lickMeButton.setOnClickListener {
//
//                titleTextView.text = when(editText.text.isNotEmpty()){
//                    true -> editText.text
//                    false -> getString(R.string.empty)
//                }
//
//                editText.setText("")
//                editText.hint = getString(R.string.empty)
//        }


    }

}
