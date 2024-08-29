package com.eliandra.lista_de_contatos

import android.graphics.Color
import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eliandra.lista_de_contatos.ui.theme.ListadecontatosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListadecontatosTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Calculator()
                }
            }
        }
    }
}

@Composable
fun CriaLinhaCalculadora(numeros: List<Int>, modifier: Modifier = Modifier){
    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth().padding(3.dp)
    ) {
        for (numero in numeros) {
            Column(
                modifier = Modifier.padding(3.dp)
            ){
                ElevatedButton(
                    onClick = {},
                    modifier = Modifier.size(80.dp, 60.dp),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(
                        "$numero",
                        fontSize = 24.sp
                    )
                }
            }
        }
    }
}

@Composable
fun Calculator(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(){
            Row(){}
            Row(){}
            Row(){}
            Row(){}
        }
        Column(){
            Row(){}
            Row(){}
            Row(){}
            Row(){}
        }
        Column(){
            Row(){}
            Row(){}
            Row(){}
            Row(){}
        }
        Column(){
            Row(){}
            Row(){}
            Row(){}
            Row(){}
        }
    }
}
//@Composable
//fun Calculator(modifier: Modifier = Modifier) {
//    Column (
//        verticalArrangement = Arrangement.Center,
//        modifier = Modifier.fillMaxHeight()
//    ) {
//        CriaLinhaCalculadora(listOf(1, 2, 3))
//        CriaLinhaCalculadora(listOf(4, 5, 6))
//        CriaLinhaCalculadora(listOf(7, 8, 9))
//        Row (
//            horizontalArrangement = Arrangement.Center,
//            modifier = Modifier.fillMaxWidth()
//
//        ){
//            ElevatedButton(
//                onClick = {},
//                modifier = Modifier.size(80.dp, 60.dp),
//                shape = RoundedCornerShape(4.dp)) {
//                Text("0",
//                    fontSize = 24.sp)
//            }
//        }
//    }
//
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListadecontatosTheme {
        Calculator()
    }
}