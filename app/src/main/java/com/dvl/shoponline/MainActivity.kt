package com.dvl.shoponline

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.constraintlayout.compose.ConstraintLayout


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeMainScreen()
        }
    }
}
@Composable
fun HomeMainScreen() {
    ConstraintLayout(modifier = Modifier.background(Color.White)) {
val(scrollist,BottomMenu)=createRefs()

        LazyColumn(
            modifier =Modifier.fillMaxSize()
        ){

        }
    }
    }
