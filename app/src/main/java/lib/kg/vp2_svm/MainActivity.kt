package lib.kg.vp2_svm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import lib.kg.vp2_svm.vpadapter.ViewPagerAdapter
import lib.kg.vp2_svm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewPager = binding.viewPager
        val viewPagerAdapter = ViewPagerAdapter(this)
        viewPager.adapter = viewPagerAdapter
    }
}