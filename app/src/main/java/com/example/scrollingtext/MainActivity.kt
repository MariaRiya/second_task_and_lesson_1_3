package com.example.scrollingtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try{
            setContentView(R.layout.activity_main)
        }catch (e : Exception){
            Log.e("TAG", "onCreateView", e);
            throw e;
        }
    }
}