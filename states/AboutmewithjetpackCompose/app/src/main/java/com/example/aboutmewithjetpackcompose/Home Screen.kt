package com.example.aboutmewithjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HomeScreen()
{
    var inpText by rememberSaveable {
        mutableStateOf("")
    }
    val scrol= rememberScrollState(0)
    var textfieldVisible by rememberSaveable {
        mutableStateOf(true)
    }
    var buutonVisble by rememberSaveable {
        mutableStateOf(true)
    }
    var show by rememberSaveable {
        mutableStateOf(false)
    }
    
    Box(modifier = Modifier.fillMaxSize()) {
        
        Column(modifier= Modifier
            .fillMaxSize()
            .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            
            
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = " Aman Singh", fontSize = 32.sp, fontWeight = FontWeight.SemiBold )

            Spacer(Modifier.height(20.dp))

            if(textfieldVisible)
            {
                TextField(value =inpText , onValueChange ={inpText= it},
                    label = { Text(text = "enter name")})
            }
            if(show)
            {
                Text(text = inpText, fontSize = 50.sp, fontFamily = FontFamily.Cursive, fontWeight = FontWeight.SemiBold)
            }


            Spacer(modifier = Modifier.height(24.dp))

            if(buutonVisble)
            {

                Button(onClick = {
                    textfieldVisible =false
                    buutonVisble = false
                    show= true

                },
                   // enabled = buutonVisble

                ) {
                    Text(text = "Submit")
                }
            }


            Spacer(modifier = Modifier.height(20.dp))

            Image(painter = painterResource(id = R.drawable.star), contentDescription ="star image", modifier= Modifier.size(100.dp) )

            Spacer(modifier =Modifier.height(20.dp))
            Text(text= " As I wandered through the forest, I could hear the rustling of leaves under my feet, the chirping of birds in the branches above, and the distant gurgling of a stream flowing nearby. The air was crisp and fragrant with the scent of pine, and the sunlight dappled through the thick canopy of trees, creating a mesmerizing pattern on the forest floor.\n" +
                    "\n" +
                    "As I continued my trek, I stumbled upon a clearing adorned with a carpet of wildflowers in various hues of pink, yellow, and purple. Bees buzzed around, busy collecting nectar, and butterflies danced gracefully among the blooms. The sight was a breathtaking display of nature's beauty, and I couldn't help but pause and take in the scene.\n" +
                    "\n" +
                    "As I sat on a mossy rock, I closed my eyes and listened to the soothing sounds of nature around me. The gentle breeze whispered secrets to the trees, and the leaves rustled in response. The sunlight filtered through the leaves, casting playful shadows on the forest floor.\n" +
                    "\n" +
                    "I decided to explore further and followed a narrow path that meandered through the trees. The path led me to a babbling brook, its crystal-clear water gushing over smooth stones. I cupped my hands and took a sip, savoring the cold, refreshing taste. The water was so pure that I could see tiny fish swimming in the shallows, darting in and out of the rocks.\n" +
                    "\n" +
                    "As I walked along the stream, I spotted a family of deer grazing in a clearing. They raised their heads and looked at me with curiosity before bounding gracefully into the depths of the forest. I watched them disappear into the foliage, feeling grateful for the opportunity to witness such natural wonder." ,
                modifier= Modifier
                    .verticalScroll(scrol)
                    .padding(start = 8.dp, end = 8.dp),fontSize = 28.sp,
            )
        }
    }
}