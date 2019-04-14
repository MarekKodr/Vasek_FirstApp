package cz.kutilek.vasek.vasekapp.main.viewmodel

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel(){

    private val data : MutableLiveData<String> by lazy { MutableLiveData<String>() }

    fun getData() : LiveData<String>{

            data.postValue("Loading")
            //Handler is here just to delay data post
            Handler().postDelayed({data.postValue("Vasek je nejlepsi")}, 5000)

        return data
    }

}