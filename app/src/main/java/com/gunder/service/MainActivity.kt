package com.gunder.service

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.service.services.BackgroundService
import com.gunder.service.ui.theme.ServiceTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ServiceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ButtonBackgroundServicePreview()
                }
            }
        }
    }
}

@Composable
fun ButtonBackgroundService(context: Context, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            val serviceIntent = Intent(context, BackgroundService::class.java)
            context.startService(serviceIntent)
        }, modifier = modifier.widthIn(min = ButtonDefaults.MinWidth)) {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = null,
                modifier = modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(modifier = modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Start Background Service")
        }
        Button(onClick = { /*TODO*/ }, modifier = modifier.widthIn(min = ButtonDefaults.MinWidth)) {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = null,
                modifier = modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(modifier = modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Stop Background Service")
        }
        Button(onClick = { /*TODO*/ }, modifier = modifier.widthIn(min = ButtonDefaults.MinWidth)) {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = null,
                modifier = modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(modifier = modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Start Foreground Service")
        }
        Button(onClick = { /*TODO*/ }, modifier = modifier.widthIn(min = ButtonDefaults.MinWidth)) {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = null,
                modifier = modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(modifier = modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Stop Foreground Service")
        }
        Button(onClick = { /*TODO*/ }, modifier = modifier.widthIn(min = ButtonDefaults.MinWidth)) {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = null,
                modifier = modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(modifier = modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Start Bound Service")
        }
        Button(onClick = { /*TODO*/ }, modifier = modifier.widthIn(min = ButtonDefaults.MinWidth)) {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = null,
                modifier = modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(modifier = modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Stop Bound Service")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonBackgroundServicePreview() {
    ServiceTheme {
        ButtonBackgroundService(LocalContext.current)
    }
}