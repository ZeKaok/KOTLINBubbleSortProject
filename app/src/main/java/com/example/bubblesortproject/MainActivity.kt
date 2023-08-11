package com.example.bubblesortproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bubblesortproject.databinding.ActivityMainBinding
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {
    var count=0
    private lateinit var binding: ActivityMainBinding
    var arr=IntArray(5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun Al(view: View){
       arr.set(count,binding.editTextNumber.text.toString().toInt())
    }
    fun Goster(view: View){

    }
    fun Sort(){

    }

    fun Swap( num1:Int,num2: Int){

        var tmp:Int=0
        tmp=num1
        num1=num2
        num2=tmp
    }


}


