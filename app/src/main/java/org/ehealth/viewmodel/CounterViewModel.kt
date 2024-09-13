package org.ehealth.viewmodel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class  CounterViewModel(
    var _count: Int = 0,
)



@Composable
fun CounterApp() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Text(text = "Count: ")
    }
}

@Composable
fun increment() {
//    increment of the count
}


@Composable
fun decrement() {
//    decrease the count
}