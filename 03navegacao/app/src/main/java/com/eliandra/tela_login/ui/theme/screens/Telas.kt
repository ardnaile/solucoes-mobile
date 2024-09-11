package com.eliandra.tela_login.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun tela1(onNavigateToScreen2: () -> Unit, onNavigateToScreen3: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text("Tela 1")
        Button(onClick = { onNavigateToScreen2()}){
            Text(text = "Go tela 2")
        }
        Button(onClick = { onNavigateToScreen3()}){
            Text(text = "Go tela 3")
        }
    }
}

@Composable
fun tela2(onNavigateToScreen1: () -> Unit, onNavigateToScreen3: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text("Tela 2")
        Button(onClick = {onNavigateToScreen1()}){
            Text(text = "Go tela 1")
        }
        Button(onClick = {onNavigateToScreen3()}){
            Text(text = "Go tela 3")
        }
    }
}

@Composable
fun tela3(onNavigateToScreen1: () -> Unit, onNavigateToScreen2: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text("Tela 3")
        Button(onClick = {onNavigateToScreen1()}){
            Text(text = "Go tela 1")
        }
        Button(onClick = {onNavigateToScreen2()}){
            Text(text = "Go tela 2")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTelas(){
    tela1({}, {})
}