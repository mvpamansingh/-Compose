package com.example.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.list.ui.theme.ListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //appme()
            //ScrollableColumn()



        }
    }
}



@Composable
fun mygrid()
{
    LazyRow()
    {
        items(5000)
        {number->
            mygridCell(number)

        }
    }
//    LazyHorizontalGrid(rows = GridCells.Adaptive(150.dp))
//    {
//        items(5000)
//        {number->
//            mygridCell(number)
//
//        }
//    }
}
@Composable
fun mygridCell(number: Int) {

    Card(modifier = Modifier.padding(8.dp), elevation = 20.dp) {

        Box(modifier= Modifier.aspectRatio(1f),
        contentAlignment = Alignment.Center) {
            Text(text = "item"+number)

        }
    }
}


//@Composable
//fun MyCard(number:Int) {
//    Card(
//        elevation = 16.dp,
//        modifier = Modifier.padding(16.dp)
//    ) {
//        Text(
//            text = number.toString(),
//            fontSize = 22.sp,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier
//                .padding(16.dp)
//                .fillMaxWidth()
//        )
//    }
//}
//@Composable
//fun ScrollableColumn() {
//    Column(
//        modifier = Modifier.verticalScroll(rememberScrollState())
//    ) {
//       ScrollableRow()
//        repeat(20) {
//            MyCard(number = it)
//        }
//    }
//}
//
//@Composable
//fun ScrollableRow() {
//    Row(
//        modifier = Modifier.horizontalScroll(rememberScrollState())
//    ) {
//        repeat(20) {
//            MyCard(number = it)
//        }
//    }
//}





//val category= listOf<String>("pizza","chicken rolls","luxary dish","elon musk","ratan tata")
//@Composable
//fun appme()
//{
//    val scrollstate= rememberScrollState()
//
//    Row(modifier = Modifier.padding(10.dp).horizontalScroll(scrollstate)) {
//        category.forEach { categoryItem ->
//            listlayout(categoryItem)
//        }
//    }
//}
//
//
//
//@Composable
//fun listlayout(category:String)
//{
//    Button(onClick = { },
//        colors = ButtonDefaults.buttonColors(Color(0XFFF7CA30)),
//        shape = RoundedCornerShape(32.dp),
//        modifier = Modifier.padding(5.dp)
//    ) {
//
//        Text(text = category)
//    }
//}

