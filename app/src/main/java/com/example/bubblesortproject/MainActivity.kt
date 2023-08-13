package com.example.bubblesortproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.view.View
import android.widget.TextView
import com.example.bubblesortproject.databinding.ActivityMainBinding
import org.w3c.dom.Text
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {
    var count:Int=0
    private lateinit var binding: ActivityMainBinding
    var arr= IntArray(5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Al.setOnClickListener{
            val size=arr.size
            arr[count] = binding.editTextNumber.text.toString().toInt()
            count++
            bubbleSort(arr)
        }
        binding.Sirala.setOnClickListener {
            binding.textView.clearComposingText()
            for (i in arr){
                binding.textView2.append(" "+arr[i])
            }
        }
    }



    private fun bubbleSort(arr: IntArray): IntArray {
        val n = arr.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
        return arr
    }


}


