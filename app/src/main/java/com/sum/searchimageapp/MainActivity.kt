package com.sum.searchimageapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.sum.searchimageapp.ui.components.MainContent
import com.sum.searchimageapp.ui.theme.SearchImageAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SearchImageAppTheme {
                MyApp {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable ()->Unit) {
    content()
}