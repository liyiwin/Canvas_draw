package com.example.draw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   lateinit var  Listener : RadioGroup.OnCheckedChangeListener

    var shap = "null"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()


    }

    fun setListener(){

        Listener = object:RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {

                when(checkedId) {

                    R.id.drawArc_rb -> shap = "Arc"

                    R.id.drawCircle_rb -> shap = "Circle"

                    R.id.drawLine_rb -> shap = "Line"

                    R.id.drawOval_rb ->shap = "Oval"

                    R.id.drawPoint_rb-> shap = "Poin"

                    R.id.drawPath_rb-> shap = "Path"

                    R.id.drawRoundRect_rb-> shap = "oundRect"

                    R.id.drawRect_rb->shap = "Rect"


                }

            }

        }

    }


    fun intent(extra:String){

        val intent = Intent(this,Main2Activity::class.java)

        intent.putExtra("shap",extra)

        startActivity(intent)

    }

}
