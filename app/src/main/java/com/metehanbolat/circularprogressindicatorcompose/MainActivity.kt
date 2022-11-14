package com.metehanbolat.circularprogressindicatorcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.metehanbolat.circularprogressindicatorcompose.ui.theme.CircularProgressIndicatorComposeTheme
import com.metehanbolat.circularprogressindicatorcompose.ui.theme.darkGray
import com.metehanbolat.circularprogressindicatorcompose.ui.theme.gray
import com.metehanbolat.circularprogressindicatorcompose.ui.theme.orange

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CircularProgressIndicatorComposeTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(darkGray),
                    contentAlignment = Alignment.Center
                ) {
                    CustomCircularProgressIndicator(
                        modifier = Modifier
                            .size(250.dp)
                            .background(darkGray),
                        initialValue = 1,
                        primaryColor = orange,
                        secondaryColor = gray,
                        circleRadius = 230f,
                        onPositionChange = { position ->
                            // Do something with this position value
                        }
                    )
                }
            }
        }
    }
}
