package com.gary.composemp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import composemultiplatformhelloworld.composeapp.generated.resources.Res
import composemultiplatformhelloworld.composeapp.generated.resources.battery_usage_hint
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(
    batteryManager: MyBatteryManager
) {
    MaterialTheme {
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//            Image(painterResource(Res.drawable.logo), contentDescription = null)
//        }

        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                val batteryUsageHint = stringResource( Res.string.battery_usage_hint)
                Text(
                    text = "$batteryUsageHint ${batteryManager.getBatteryLevel()}%"
                )
            }
        }

    }
}