package com.example.bubblesortproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.bubblesortproject.databinding.ActivityMainBinding
import org.w3c.dom.Text
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {
    var count:Int
    private lateinit var binding: ActivityMainBinding
    var arr= IntArray(5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun Al(view: View){
        arr[count] = binding.editTextNumber.text.toString().toInt()
        count++
    }
    fun Goster(view: View){
        binding.textView.clearComposingText()
        var temp:Int=0
        val size=arr.size
        for(i in 0 until  size-1){
            for (j in 0 until  size-i-1){
                if(arr[j]<arr[j+1]){
                    temp=arr[j]
                    arr[j]=arr[j+1]
                    arr[j+1]=temp
                }
            }
        }
        for (i in arr){
            binding.textView2.append(" "+arr[i])
        }

    }


}


