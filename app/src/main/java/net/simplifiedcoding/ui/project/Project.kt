package net.simplifiedcoding.ui.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.simplifiedcoding.ui.auth.AuthViewModel



@Composable
fun ProjectScreen(viewModel: AuthViewModel?, navController: NavHostController) {

    Column (
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize()
    ){
        Text(text = "Welcome back,please login", color = Color.Black, fontSize = 15.sp)

    }


}





