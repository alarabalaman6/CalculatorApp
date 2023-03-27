package com.alarabalaman.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// can we do it with a switch case?
// can we do it with one input box and multiple entries?

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById<TextView>(R.id.result)

        val editText_1 = findViewById<EditText>(R.id.editText_1)
        val editText_2 = findViewById<EditText>(R.id.editText_2)



        val add = findViewById<Button>(R.id.add)
        val subtract = findViewById<Button>(R.id.subtract)
        val multiply = findViewById<Button>(R.id.multiply)
        val divide = findViewById<Button>(R.id.divide)


        add.setOnClickListener() {
            val input_1 = editText_1.text.toString().toIntOrNull()
            val input_2 = editText_2.text.toString().toIntOrNull()
            result.text = add(input_1, input_2).toString()}
        subtract.setOnClickListener() {
            val input_1 = editText_1.text.toString().toIntOrNull()
            val input_2 = editText_2.text.toString().toIntOrNull()
            result.text = sub(input_1, input_2).toString()}
        multiply.setOnClickListener() {
            val input_1 = editText_1.text.toString().toIntOrNull()
            val input_2 = editText_2.text.toString().toIntOrNull()
            result.text = multiply(input_1, input_2).toString()}
        divide.setOnClickListener() {
            val input_1 = editText_1.text.toString().toIntOrNull()
            val input_2 = editText_2.text.toString().toIntOrNull()
            result.text = div(input_1, input_2).toString()}


    }

    //add.setOnClickListener() {
        //result.text = add(input_1, input_2).toString() }

    /*fun handleClick(buttonId : Int) {
        if(input_1 != null && input_2 != null) {
            when(buttonId) {
                R.id.add -> add.setOnClickListener() {result.text = add(input_1, input_2).toString()}
                R.id.subtract -> subtract.setOnClickListener() {result.text = sub(input_1, input_2).toString()}
                R.id.multiply -> multiply.setOnClickListener() {result.text = multiply(input_1, input_2).toString()}
                R.id.divide -> divide.setOnClickListener() {result.text = div(input_1, input_2).toString()}
            }} else {
            println("please enter a number")
        }
    }*/






    fun add(a: Int? , b: Int?) : Int? {

        if(a != null && b != null){
            return a+b}
        else
        {println("please enter a number")
        return null}
    }
    fun sub(a: Int? , b: Int?) : Int?{

        if(a != null && b != null){
        return a-b}else
            println("please enter a number")
        return null
    }
    fun multiply(a: Int? , b: Int?) : Int?{

    if(a != null && b != null){
        return a*b}else
     println("please enter a number")
        return null
    }
    fun div(a: Int? , b: Int?) : Int?{

        if(a != null && b != null){
        return a/b}else
            println("please enter a number")
        return null
    }
}