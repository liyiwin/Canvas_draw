package com.example.draw

import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val extra = intent.getStringExtra("shap")

        setView(extra!!)


    }


    fun setView(shap:String){


        when (shap){


             "Arc" -> drawArc()

            "Circle" -> drawCircle()

            "Line" ->  drawLine()

             "Oval" -> drawOval()

             "Poin" -> drawPoint()

             "Path" -> drawPath()

             "oundRect" -> drawRoundRect()

             "Rect" -> drawRect()

        }



    }



    fun drawArc(){

        val p = Paint()
        p.strokeWidth = 2f
        p.color = Color.RED
        p.style = Paint.Style.STROKE
        val bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val oval1 = RectF(100f, 100f, 400f, 400f)
        canvas.drawArc(oval1, 30f, 300f, true, p)
        imageView2.setImageBitmap(bitmap)

    }

    fun drawCircle(){

        val p = Paint()
        p.strokeWidth = 3f
        p.color = Color.RED
        p.style = Paint.Style.STROKE
        val bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        canvas.drawCircle(240f, 240f, 150f, p)
        imageView2.setImageBitmap(bitmap)


    }

    fun drawOval(){

        val p = Paint()
        p.strokeWidth = 10f
        p.color = Color.RED
        p.style = Paint.Style.STROKE
        val bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val oval = RectF()
        oval.left = 100f
        oval.top = 100f
        oval.right = 400f
        oval.bottom = 300f
        canvas.drawOval(oval, p)
        imageView2.setImageBitmap(bitmap)


    }

    fun drawPoint(){
        val p = Paint()
        p.strokeWidth = 20f
        p.color = Color.RED
        p.style = Paint.Style.STROKE
        val bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        canvas.drawPoint(60f, 390f, p)
        canvas.drawPoints(floatArrayOf(60f, 300f, 100f, 300f, 200f, 300f), p)
        imageView2.setImageBitmap(bitmap)


    }

    fun drawRect(){
        val p = Paint()
        p.strokeWidth = 2f
        p.color = Color.RED
        p.style = Paint.Style.STROKE
        val bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val rect = RectF(100f, 100f, 400f, 400f)
        canvas.drawRect(rect, p)
        imageView2.setImageBitmap(bitmap)


    }


    fun drawRoundRect(){
        val p = Paint()
        p.strokeWidth = 2f
        p.color = Color.RED
        p.style = Paint.Style.FILL
        p.isAntiAlias = true
        val bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val rect = RectF(100f, 50f, 300f, 500f)
        canvas.drawRoundRect(rect, 20f, 20f, p)
        imageView2.setImageBitmap(bitmap)

    }


    fun drawLine(){
        val p = Paint()
        p.strokeWidth = 10f
        p.color = Color.RED
        p.style = Paint.Style.STROKE
        val bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        canvas.drawLine(60f, 40f, 200f, 400f, p)
        imageView2.setImageBitmap(bitmap)

    }

    fun drawPath(){
        val p = Paint()
        p.strokeWidth = 5f
        p.color = Color.RED
        p.style = Paint.Style.STROKE
        val bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        val path = Path()
        path.moveTo(200f, 200f)
        path.lineTo(400f, 200f)
        path.lineTo(400f, 400f)
        path.close()
        canvas.drawPath(path, p)
        imageView2.setImageBitmap(bitmap)

    }
}
