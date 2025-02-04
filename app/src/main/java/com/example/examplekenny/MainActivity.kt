package com.example.examplekenny

import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.examplekenny.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    var score = 0
    private lateinit var binding: ActivityMainBinding
    var imageArray = ArrayList<ImageView>()
    var handler = Handler(Looper.getMainLooper())
    var runnable = Runnable {  }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        imageArray.add(binding.imageView)
        imageArray.add(binding.imageView2)
        imageArray.add(binding.imageView3)
        imageArray.add(binding.imageView4)
        imageArray.add(binding.imageView5)
        imageArray.add(binding.imageView6)
        imageArray.add(binding.imageView7)
        imageArray.add(binding.imageView8)
        imageArray.add(binding.imageView9)
    }
    fun hideImages(view: View) {
        for (image in imageArray) {
            image.visibility = View.INVISIBLE
        }
        val random = Random()
        val randomIndex = random.nextInt(9)
        imageArray[randomIndex].visibility = View.VISIBLE
    }
    fun increaseScore(view: View) {
        score = score + 1
        binding.scoreText.text = "Score:${score} "
    }
}