package pe.edu.ulima.ui.login.uis

import android.speech.tts.TextToSpeech
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import pe.edu.ulima.R
import pe.edu.ulima.ui.theme.orange

@Preview
@Composable
public fun PokemonScreenPreview(){

}

data class Pokemon(
    var nombre: String,
    var peso: Float,
    var talla: Float,
    var url: String
)

@Composable
public fun PokemonScreen(){
    var tmpPokemonList = listOf<Pokemon>(
        Pokemon("BULBASAUR",6.9f,12f,"https://pokefanaticos.com/pokedex/assets/images/pokemon_imagenes/1.png")
    )
    Column(){
        for(i in 1..4){
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = rememberImagePainter(data = "https://pokefanaticos.com/pokedex/assets/images/pokemon_imagenes/1.png"),
                    contentDescription = "imagen de internet",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(end = 5.dp),
                    )
                Column() {
                    Text(text = "Nombre: BULBASAUR")
                    Text(text = "Peso: 6.9 Kg")
                }
            }
        }

    }
}