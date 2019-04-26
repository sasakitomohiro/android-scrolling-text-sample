package com.sasakisan.android_scrolling_text_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.robinhood.ticker.TickerUtils
import com.robinhood.ticker.TickerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val tickerView = findViewById<TickerView>(R.id.ticker_view)
//        tickerView.setCharacterLists(TickerUtils.provideNumberList())
//        tickerView.text = "1000"
    }
}
