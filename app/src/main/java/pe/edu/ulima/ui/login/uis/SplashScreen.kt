package pe.edu.ulima.ui.login.uis

import android.window.SplashScreen
import android.window.SplashScreenView
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.ulima.ui.theme.gray
import pe.edu.ulima.ui.theme.orange
import pe.edu.ulima.R

@Preview
@Composable
public fun SplashScreenPreview(){
    SplashScreen()
}

@Composable
public fun SplashScreen(){
    val caslonFont = FontFamily(Font(R.font.caslon_classico_sc_regular))
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,

        ){
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_ulima),
                contentDescription = "Logo Ulima",
                modifier = Modifier.size(100.dp).padding(bottom = 10.dp),
                colorFilter = ColorFilter.tint(
                    color = if(isSystemInDarkTheme()) orange else gray
                ))
            Text(
                text = "UNIVERSIDAD DE LIMA \nProgramación Móvil \n2023-1",
                textAlign = TextAlign.Center,
                fontFamily = caslonFont
            )
        }
    }
}