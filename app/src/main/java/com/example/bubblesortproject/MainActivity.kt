package com.example.bubblesortproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.bubblesortproject.databinding.ActivityMainBinding
import org.w3c.dom.Text
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
        var temp:Int=0
        for(i in arr ){
            for (j in arr){
                if(arr[j]<arr[j+1]){
                    temp=arr[j+1]
                    arr[j+1]=arr[j]
                    arr[j]=temp
                }
            }
        }
        for (i in arr){
            binding.textView2.append(" "+arr[i])
        }

    }


}


