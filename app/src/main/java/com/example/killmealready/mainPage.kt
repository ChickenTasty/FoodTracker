package com.example.killmealready

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.ui.tooling.preview.Preview
import com.example.killmealready.ui.theme.KillMeAlreadyTheme
@Preview
@Composable
fun mainPage(){
    Box(modifier = Modifier.fillMaxSize()){
        Column{
            Row{
                Text(text = "Progress")
                Text(text = "Home")
                Text(text = "Archive")

            }
        }


    }
    fun Home(){

    }
}



@Preview(showSystemUi = true)
@Composable
fun mainprev(){
    mainPage()}

