package com.danp.laboratorio04

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.danp.laboratorio04.ui.theme.Laboratorio04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio04Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "REGISTRO DE CURSO",
        modifier = Modifier.fillMaxSize(),
    )
    Formulario()
    Opciones()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Laboratorio04Theme {
        Greeting("Android")
    }
}

@Composable
fun Formulario() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
            .wrapContentSize(Alignment.Center),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        ItemForm(name = "Perido Académico")
        ItemForm(name = "Escuela Profesional")
        ItemForm(name = "Código de la asignatura")
        ItemForm(name = "Nombre de la asignatura")
        ItemForm(name = "Semestre")
        ItemForm(name = "Duración")


    }
}
@Composable
fun ItemForm(name: String){
    var text by remember { mutableStateOf( "") }
    TextField(
        value = text,
        onValueChange = {text = it},
        label = {Text(text = name)},
        modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp)
    )
}

@Composable
fun Opciones(){
    Text(text = "Personalizar",
        modifier = Modifier.fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.secondary
    ) {
        Column(

        ){

        }
    }
}
