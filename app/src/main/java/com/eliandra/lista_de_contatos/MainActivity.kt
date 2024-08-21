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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun CriaLinhaCalculadora(numeros: List<Int>){
    Row {
        for (numero in numeros) {
            Button(onClick = {}) {
                Text("$numero")
            }
        }
    }
}

@Composable
fun Calculator(modifier: Modifier = Modifier) {
    Column {
        CriaLinhaCalculadora(listOf(1, 2, 3))
        CriaLinhaCalculadora(listOf(4, 5, 6))
        CriaLinhaCalculadora(listOf(7, 8, 9))
        Row (
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.background(androidx.compose.ui.graphics.Color.Blue).fillMaxWidth()

        ){
            Button(onClick = {}) {
                Text("0")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListadecontatosTheme {
        Calculator()
    }
}

//        Text(
//            text = "Hello $name!",
//            modifier = modifier
//        )