package com.eliandra.tela_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.eliandra.tela_login.ui.theme.TelaloginTheme
import com.eliandra.tela_login.ui.theme.screens.Login
import com.eliandra.tela_login.ui.theme.screens.tela1
import com.eliandra.tela_login.ui.theme.screens.tela2
import com.eliandra.tela_login.ui.theme.screens.tela3


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaloginTheme {
                val navigationController = rememberNavController()
                NavHost(navController = navigationController, startDestination = "tela1"){
                    composable("tela1"){
                        tela1({navigationController.navigate("tela2")},
                            {navigationController.navigate("tela3")})
                    }
                    composable("tela2"){
                        tela1({navigationController.navigate("tela1")},
                            {navigationController.navigate("tela3")})
                    }
                    composable("tela3"){
                        tela1({navigationController.navigate("tela1")},
                            {navigationController.navigate("tela2")})
                    }
                }
//                val navController = rememberNavControler()
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
////                    Greeting("Android")
//                    Login()
//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TelaloginTheme {
//        Greeting("Android")
        Login()
    }
}