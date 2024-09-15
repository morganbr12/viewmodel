package org.ehealth.viewmodel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class CounterViewModel(
    var count: Int = 0,
)

@Composable
fun CounterApp() {
    // Remember and hold the state of the counter across recompositions
    var ct by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "Count: $ct")
        Spacer(modifier = Modifier.padding(10.dp))
        Row {
            Increment(ct.toString()) // Pass the counter state to Increment composable
            Spacer(modifier = Modifier.padding(20.dp))
            Decrement(ct.toString()) // Pass the counter state to Decrement composable
        }
    }
}

@Composable
fun Increment(ct: String) {
    var count = ct.toInt();
    Button(
        onClick = {
            count += 1;
            println(count);
            print(count);
            println("hello world")
        },
    ) {
        Text(text = "Increment")
    }
}

@Composable
fun Decrement(ct: String) {
    var count = ct.toInt()
    Button(
        onClick = {
            count -= 1; // Decrement the shared count
        },
    ) {
        Text(text = "Decrement")
    }
}
