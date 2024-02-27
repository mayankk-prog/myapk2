package com.example.myapk2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.GsonBuilder
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import com.example.myapk2.myInterface
import retrofit2.create

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Quotesapi= RetrofitBuilder.getInstance().create(myInterface::class.java)

        val myInterface=RetrofitBuilder.getInstance()
//        val call= myInterface.getQuotes()


        GlobalScope.launch {
            val result= Quotesapi.getQuotes()
//            if(result!= null){
//                Log.d("Result", result.body().toString())
//            }



//            val call = Quotesapi.getQuotes()
//
//            val response= call.execute()
//            if(response.isSuccessful){
//                val text= response.body()
//                println(text)
//            }else{
//                println("failed to execute")
//            }
//


        }

    }
}
