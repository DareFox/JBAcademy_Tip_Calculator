package io.darefox.jbacademy.tip_calucaltor

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.slider.Slider
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    val TAG = "TipCalc"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initSliderCheck()
    }

    fun initSliderCheck() {
        val slider = findViewById<Slider>(R.id.slider)
        var toast: Toast? = null;
        var valueRate = 0.0f;
        val number = findViewById<EditText>(R.id.edit_text)
        val tipRate = findViewById<TextView>(R.id.tipRate)
        val tip = findViewById<TextView>(R.id.text_view)
        slider.addOnChangeListener(object : Slider.OnChangeListener{
            override fun onValueChange(slider: Slider, value: Float, fromUser: Boolean) {
                valueRate = value
                if(number.text.isEmpty()) {
                    if(toast == null) {
                        toast = Toast.makeText(applicationContext, "First, set amount of money and then set tip rate", Toast.LENGTH_SHORT)
                    }
                    try {
                        if(toast?.view?.isShown() != true) {
                            toast?.show()
                            Log.d(TAG, "Toast shown")
                        } else {
                            Log.d(TAG, "Toast is already shown, dont show it again")
                        }
                    } catch(ex: Exception) {}
                } else {
                    changeTipValue(valueRate)
                }
            }
        })
        number.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if(!number.text.toString().isEmpty())
                    changeTipValue(valueRate)
                else {
                    tip.text = "None"
                }
            }

        })

    }

    fun changeTipValue(value: Float) {
        val number = findViewById<EditText>(R.id.edit_text)
        val tipRate = findViewById<TextView>(R.id.tipRate)
        val tip = findViewById<TextView>(R.id.text_view)
        val numberInt = number.text.toString().toFloat()
        var tipMoney = numberInt * (value * 0.01)
        tip.visibility = View.VISIBLE
        tipRate.text = "Tip rate: $value%"
        tip.text = String.format("%.2f", tipMoney)
        Log.d(TAG, "tipMoney=${tipMoney}")
    }
}
