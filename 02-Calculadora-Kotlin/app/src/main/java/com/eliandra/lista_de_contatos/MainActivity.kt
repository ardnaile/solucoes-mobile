package com.eliandra.lista_de_contatos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
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
fun CriaLinhaCalculadora(simbolos: List<String>, modifier: Modifier = Modifier){
    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(3.dp)
    ) {
        for (simbolo in simbolos) {
            Column(
                modifier = Modifier.padding(3.dp)
            ){
                ElevatedButton(
                    onClick = {},
                    modifier = Modifier.size(72.dp),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(
                        "$simbolo",
                        fontSize = 24.sp
                    )
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calculator(modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        TextField(value = "0", onValueChange = {}, modifier = Modifier.padding(5.dp))
        CriaLinhaCalculadora(listOf("1", "2", "3", "/"))
        CriaLinhaCalculadora(listOf("4", "5", "6", "*"))
        CriaLinhaCalculadora(listOf("7", "8", "9", "-"))
        CriaLinhaCalculadora(listOf("C", "0", "=", "+"))
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListadecontatosTheme {
        Calculator()
    }
}