package com.example.laboratorio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio5.ui.theme.Laboratorio5Theme
import androidx.compose.material3.Icon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                Galeria()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Galeria() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Fotos")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(

                onClick = {  }
            ) {

                Icon(

                    imageVector = Icons.Default.Add,

                    contentDescription = "Añadir foto"
                )
            }
        }

    ) { innerPadding ->

        Text(
            modifier = Modifier.padding(innerPadding),
            text = ""
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Laboratorio5Theme {
        Galeria()
    }
}