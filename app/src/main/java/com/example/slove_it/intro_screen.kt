package com.example.slove_it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import java.text.FieldPosition

class intro_screen : AppCompatActivity() {

    private lateinit var onBordingItemAdapter: OnBordingItemAdapter
    private lateinit var IndicatorsContainer:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_screen)
        setOnBoardingItems()
        setUpIndicator()
        setCurrentIndicator(0)
    }

    private fun setOnBoardingItems(){
        onBordingItemAdapter= OnBordingItemAdapter(
            listOf(
                OnbordingItem(
                    onboardingimg = R.drawable.img_4,
                    title = "Look for Easy Opportunities First",
                    description = "Every Sudoku grid, when you start the game, comes with some numbers already placed into their correct spaces." +
                            "or example, in this puzzle, the square outlined in red already has 8 of the 9 numbers in place. This makes it easy to place the 9th remaining number"
                ),
                OnbordingItem(
                    onboardingimg = R.drawable.img_5,
                    title = "Look to Neighboring Rows",
                    description = "For example, in this grid below, the red column has two empty spaces (circled in orange). We know just by checking the other numbers in the red column that the only numbers remaining to be placed are 9 and 3. If we look to the left to see where other numbers might be, we can see a 9 in the center row of the left center square (circled in orange).\n" +
                            "\n"
                ),
                OnbordingItem(
                    onboardingimg = R.drawable.img_6,
                    title = "Follow Your Momentum",
                    description = "For example, in this grid, the central square only has three empty spaces remaining, and we know by checking the numbers that 4, 6 and 8 still need to be placed."

                )
            )
        )
        val onbordingviewpager=findViewById<ViewPager2>(R.id.onbordingviewpager)
        onbordingviewpager.adapter=onBordingItemAdapter
        onbordingviewpager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })
        (onbordingviewpager.getChildAt(0) as RecyclerView).overScrollMode=
            RecyclerView.OVER_SCROLL_NEVER
        findViewById<ImageView>(R.id.imageNext).setOnClickListener{
            if(onbordingviewpager.currentItem +1< onbordingviewpager.itemDecorationCount){
                onbordingviewpager.currentItem +=1
            }else{
                navigationToHOmeActivity()
            }
        }
        findViewById<TextView>(R.id.skip).setOnClickListener {
            navigationToHOmeActivity()
        }
        findViewById<Button>(R.id.start).setOnClickListener {
            navigationToHOmeActivity()
        }

    }
    private fun setUpIndicator(){
        IndicatorsContainer=findViewById(R.id.indicator)
        val indicators= arrayOfNulls<ImageView>(onBordingItemAdapter.itemCount)
        var layoutParams:LinearLayout.LayoutParams=
            LinearLayout.LayoutParams(WRAP_CONTENT,WRAP_CONTENT)
        layoutParams.setMargins(8,0,8,0)
        for (i in indicators.indices){
            indicators[i]= ImageView(applicationContext)
            indicators[i]?.let {
                it.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,R.drawable.indicator_i_background
                    )
                )
                it.layoutParams=layoutParams
                IndicatorsContainer.addView(it)
            }
        }
    }
    private fun setCurrentIndicator(position: Int){
        val childCount=IndicatorsContainer.childCount
        for(i in 0 until childCount){
            val imageView=IndicatorsContainer.getChildAt(i) as ImageView
            if(i == position){
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,R.drawable.indicator_bacground
                    )
                )
            }else{
                imageView.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,R.drawable.indicator_i_background
                    )
                )
            }
        }
    }
    private fun navigationToHOmeActivity(){
        startActivity(Intent(this,mainpage::class.java))
        finish()
    }
}