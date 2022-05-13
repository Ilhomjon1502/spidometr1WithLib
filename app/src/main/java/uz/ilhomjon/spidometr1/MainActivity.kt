package uz.ilhomjon.spidometr1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.ilhomjon.spidometr1.databinding.ActivityMainBinding

//lib install android studio bumblebee: https://stackoverflow.com/questions/70937904/android-studio-bumblebee-maven

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.speedometer.setSpeed(50, 200L, {
            Toast.makeText(this, "End", Toast.LENGTH_SHORT).show()
        })
    }
}