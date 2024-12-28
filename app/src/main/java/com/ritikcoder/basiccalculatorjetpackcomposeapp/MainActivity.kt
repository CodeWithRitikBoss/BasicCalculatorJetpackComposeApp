package com.ritikcoder.basiccalculatorjetpackcomposeapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var num1 by remember {
                mutableStateOf("")
            }
            var num2 by remember {
                mutableStateOf("")
            }

            Column (
                modifier = Modifier.padding(70.dp,100.dp,0.dp,0.dp)
            ) {
                TextField(value = num1, onValueChange = {
                    num1= it
                })
                Spacer(modifier = Modifier.height(15.dp))
                TextField(value = num2, onValueChange = {
                    num2= it
                })
                Spacer(modifier = Modifier.height(50.dp))

                Row {
                    Button(onClick = {
                        var result= num1.toInt() + num2.toInt()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Add")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(onClick = {
                        var result= num1.toInt() - num2.toInt()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Sub")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(onClick = {
                        var result= num1.toInt() * num2.toInt()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Multi")
                    }
                }
                Row {
                    Button(onClick = {
                        var result= num1.toInt() / num2.toInt()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Div")
                    }
                    Spacer(modifier = Modifier.width(15.dp))
                    Button(onClick = {
                        var result= num1.toInt() % num2.toInt()
                        Toast.makeText(applicationContext, "Result is $result", Toast.LENGTH_SHORT).show()
                    }) {
                        Text(text = "Rem")
                    }
                }
            }
        }
    }
}