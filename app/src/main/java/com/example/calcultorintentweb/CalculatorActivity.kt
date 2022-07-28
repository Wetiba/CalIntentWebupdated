package com.example.calcultorintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
     lateinit var buttonadd:Button
    lateinit  var buttonsub:Button
    lateinit  var buttonmult:Button
    lateinit  var buttondiv:Button
    lateinit  var edt_fnum:EditText
    lateinit var edt_snum:EditText
    lateinit var text_answer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        buttonadd=findViewById(R.id.Btn_Add)
        buttonsub=findViewById(R.id.Btn_Sub)
        buttonmult=findViewById(R.id.Btn_Multiply)
        buttondiv=findViewById(R.id.Btn_Division)


        buttonadd.setOnClickListener {
            var firstnum= edt_fnum.text.toString()
            var secondnum= edt_snum.text.toString()
            if (firstnum.isEmpty() && secondnum.isEmpty()){
                text_answer.text="Please fill in all inputs"
            }else{
                var Answer=firstnum.toDouble() + secondnum.toDouble()
                text_answer.text=Answer.toString()
            }


        }
    }
}