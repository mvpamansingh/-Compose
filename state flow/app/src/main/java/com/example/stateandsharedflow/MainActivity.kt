package com.example.stateandsharedflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.stateandsharedflow.ui.theme.StateAndSharedFlowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // this is the way to get referece to view model in compose
            val viewC = viewModel<myViewModel>()

            //here we collect the Flow State as state
            // To Access state value we eed to use . value 
            val a= viewC.ans.collectAsState(initial = 1)
            StateAndSharedFlowTheme {


                Box(Modifier.fillMaxSize()) {
                        
                    Button(onClick = { viewC.add() }) {
                        Text(text = "+ ${a.value}")
                    }
                }

            }
        }
    }}

