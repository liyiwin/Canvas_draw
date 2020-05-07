package com.example.draw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   lateinit var  Listener : RadioGroup.OnCheckedChangeListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }



    fun setListener(){

        Listener = object:RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {

                when(checkedId) {

                    R.id.drawArc_rb -> Log.d("shap","Arc")

                    R.id.drawCircle_rb -> Log.d("shap","Circle")

                    R.id.drawLine_rb -> Log.d("shap","Line")
                    R.id.drawOval_rb -> Log.d("shap","Oval")

                    R.id.drawPoint_rb-> Log.d("shap","Poin")

                    R.id.drawPath_rb-> Log.d("shap","Path")

                    R.id.drawRoundRect_rb->Log.d("shap","oundRect")

                    R.id.drawRect_rb->Log.d("shap","Rect")


                }

            }

        }


    }
}
