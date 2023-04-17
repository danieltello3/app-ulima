package pe.edu.ulima.ui.login.uis

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.ulima.R
import pe.edu.ulima.ui.theme.orange
import pe.edu.ulima.ui.theme.white

@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}
@Composable
fun LoginScreen(){
    var userText by remember { mutableStateOf(TextFieldValue("")) }
    var passwordText by remember { mutableStateOf(TextFieldValue("")) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
        ){
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_ulima),
                contentDescription = "Logo Ulima",
                modifier = Modifier
                    .size(100.dp)
                    .padding(bottom = 10.dp),
                colorFilter = ColorFilter.tint(
                    color = orange
                ))
            TextField(
                value = userText,
                onValueChange = {
                    userText = it
                },
                label = {
                    Text(text = "Usuario")
                },
                placeholder = {Text(text = "")},
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedLabelColor = orange,
                    focusedIndicatorColor = orange,
                )
            )
            TextField(
                value = passwordText,
                onValueChange = {
                    passwordText = it
                },
                label = {
                    Text(text = "Contraseña")
                },
                placeholder = {Text(text = "")},
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    focusedLabelColor = orange,
                    focusedIndicatorColor = orange,
                ),
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                modifier = Modifier.size(300.dp,50.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = orange,
                    contentColor = white
                ),
                onClick = {
                    println("+++++++++++++++++++++++++++++++++")

                    println("usuario: ${userText.text}")
                    println("password: $passwordText.text")
                    println("+++++++++++++++++++++++++++++++++")
                }) {
                Text(text = "Ingresar", fontSize = 20.sp)
            }
        }
    }

}