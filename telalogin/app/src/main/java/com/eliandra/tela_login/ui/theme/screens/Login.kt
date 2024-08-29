package com.eliandra.tela_login.ui.theme.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login() {
    val myModifier = Modifier.padding(top = 8.dp)
    var login by remember { // remember
        mutableStateOf("")
    }
    var senha by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        OutlinedTextField(value = login, onValueChange = {login = it}, myModifier)
        OutlinedTextField(value = senha, onValueChange = {senha = it}, myModifier)
        Button(onClick = {
                         if (login == "eli" && senha == "123"){
                             Log.d("login", "Login ok!")
                         }else{
                             Log.e("login", "Senha ou usuário incorretos.")
                         }
        }, myModifier) {
            Text(text = "LOGIN")
        }
        TextButton(onClick = {}, myModifier) {
            Text(text = "ESQUECI A SENHA")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLogin(){
    Login()
}