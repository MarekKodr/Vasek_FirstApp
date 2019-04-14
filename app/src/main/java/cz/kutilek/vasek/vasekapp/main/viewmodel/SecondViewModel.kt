package cz.kutilek.vasek.vasekapp.main.viewmodel

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondViewModel : ViewModel(){

    val data : MutableLiveData<String> by lazy { MutableLiveData<String>() }

    fun loadData(){
            //Handler is here just to delay data post
            Handler().postDelayed({data.postValue("Marek je nejlepsi")}, 5000)
    }

}