package net.simplifiedcoding.ui.projects

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.simplifiedcoding.R
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





