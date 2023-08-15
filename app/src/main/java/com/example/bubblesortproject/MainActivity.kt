package com.example.bubblesortproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.view.View
import android.widget.TextView
import classes.Bubblesort
import com.example.bubblesortproject.databinding.ActivityMainBinding
import org.w3c.dom.Text
import java.lang.reflect.Array
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var arr= IntArray(5)
    var count:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val call =Bubblesort(arr)

        binding.Al.setOnClickListener {
          arr.set(count,binding.editTextNumber.text.toString().toInt())
            count++
            call.BubbleSort(arr)
        }
        binding.Sirala.setOnClickListener {
            binding.textView2.setText(null)
            binding.textView2.append(arr.contentToString())
            count=0
        }

    }


}


