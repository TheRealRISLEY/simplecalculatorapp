package com.example.simple_calculator_risley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txt_answer_display: TextView
    private lateinit var edtFirst: EditText
    private lateinit var edtSecond: EditText
    private lateinit var button_add: Button
    private lateinit var button_subtract: Button
    private lateinit var button_divide: Button
    private lateinit var button_multiply: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_answer_display = findViewById(R.id.txtdisplay)
        edtFirst = findViewById(R.id.edtfirstnumber)
        edtSecond = findViewById(R.id.edtsecondnumber)
        button_add = findViewById(R.id.btnadd)
        button_subtract = findViewById(R.id.btnsubtract)
        button_divide = findViewById(R.id.btndivide)
        button_multiply = findViewById(R.id.btnmultiply)


        button_add.setOnClickListener {

            var first_num = edtFirst.text.toString().trim()
            var second_num = edtSecond.text.toString().trim()

            //validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show()
            } else {
                //means user has entered some data
                var result = first_num.toDouble() + second_num.toDouble()
                txt_answer_display.text = result.toString()
            }
        }
        button_subtract.setOnClickListener {
            var first_num = edtFirst.text.toString().trim()
            var second_num = edtSecond.text.toString().trim()

            if (first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show()
            } else {
                //means user has entered some data
                var result = first_num.toDouble() - second_num.toDouble()
                txt_answer_display.text = result.toString()


            }
        }
   button_divide.setOnClickListener {
       var first_num = edtFirst.text.toString().trim()
       var second_num = edtSecond.text.toString().trim()

       if (first_num.isEmpty() || second_num.isEmpty()) {

           Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show()
       } else {
           //means user has entered some data
           var result = first_num.toDouble() / second_num.toDouble()
           txt_answer_display.text = result.toString()

       }

   }
  button_multiply.setOnClickListener {
      var first_num = edtFirst.text.toString().trim()
      var second_num = edtSecond.text.toString().trim()

      if (first_num.isEmpty() || second_num.isEmpty()) {

          Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_SHORT).show()
      } else {
          //means user has entered some data
          var result = first_num.toDouble() * second_num.toDouble()
          txt_answer_display.text = result.toString()

      }
  }


    }
}