package com.hakanerdogmus.kotlincauntdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.hakanerdogmus.kotlincauntdown.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        //sayma işlemini kaçıncı saniyeden başlatıp kaç kaç saydıracağımızı belirlediğimiz kısım.
       object : CountDownTimer(10000, 1000){

           //sayma işlemi sırasında ne yapacağını yazdığımız komut.
           override fun onTick(p0: Long) {
               binding.textView.text ="Left: ${p0/1000}"


           }
            //sayma işlemi bitince ne olacağını yazdığımız komut.
           override fun onFinish() {
                binding.textView.text = "The End"
           }

       //sayma işlemini başlatıyoruz.
       }.start()


    }
}