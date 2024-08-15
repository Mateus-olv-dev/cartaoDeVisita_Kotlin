package com.example.cartaodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisita.ui.theme.CartaoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CartaoDeVisitaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CartaoDeVisita(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CartaoDeVisita(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.myphoto)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.hsl(217f, 0.21f, 0.12f)),
        verticalArrangement = Arrangement.SpaceEvenly, // Espaçamento entre o conteúdo
        horizontalAlignment = Alignment.CenterHorizontally, // Centraliza horizontalmente

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(
                    height = 250.dp,
                    width = 150.dp
                )
            )

            Text(
                text = stringResource(id = R.string.full_name),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                color = Color.White
            )
            Text(
                text = stringResource(id = R.string.title),
                color = Color.hsl(267f, 0.68f, 0.63f)
            )
        }

        Contatos(
            modifier = Modifier.align(Alignment.End) // Alinha ao final horizontalmente
        )
    }
}

@Composable
fun Contatos(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth(),// Adiciona espaçamento vertical
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Rounded.Call, contentDescription = "Call", tint = Color.hsl(267f, 0.68f, 0.33f))
            Text(
                text = stringResource(id = R.string.tell),
                modifier = Modifier.padding(start = 8.dp),
                color = Color.White// Adiciona espaçamento entre ícone e texto
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Rounded.Email, contentDescription = "Email", tint = Color.hsl(267f, 0.68f, 0.33f))
            Text(
                text = stringResource(id = R.string.email),
                modifier = Modifier.padding(start = 8.dp),
                color = Color.White// Adiciona espaçamento entre ícone e texto
            )
        }
    }
}
