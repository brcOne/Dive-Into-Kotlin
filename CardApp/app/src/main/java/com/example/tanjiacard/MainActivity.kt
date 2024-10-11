package com.example.tanjiacard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tanjiacard.ui.theme.TanjiaCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TanjiaCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TanjiaCard()
                }
            }
        }
    }
}

@Composable
fun TanjiaCard(modifier: Modifier = Modifier) {

    val backgroundImage = painterResource(R.drawable.blurtanj)

    Box(
        modifier = modifier
            .fillMaxSize()

    ) {

        Image(
            painter = backgroundImage,
            contentDescription = "Background Image of Tanjia",
            modifier = Modifier

                .fillMaxSize()
                .clip(RoundedCornerShape(0.dp)),
            contentScale = ContentScale.Crop
        )


        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()

                .clip(RoundedCornerShape(16.dp))
        ) {

            val image = painterResource(R.drawable.tanjia)
            Image(
                painter = image,
                contentDescription = "Image of Tanjia",
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .heightIn(max = 200.dp)
                    .border(width = 4.dp, color = Color.White, shape = RoundedCornerShape(16.dp)) // Add border here
                    .clip(RoundedCornerShape(16.dp))
            )

            Spacer(modifier = Modifier.height(16.dp))


            Text(
                text = "Tanjia",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFF3C623)
            )

            Spacer(modifier = Modifier.height(8.dp))


            Text(
                text = "Popular Region: Marrakech, Morocco",
                fontSize = 16.sp,
                color = Color(0xFFF3C623)
            )

            Spacer(modifier = Modifier.height(8.dp))


            Text(
                text = "Tanjia is a traditional slow-cooked Moroccan dish, made in a special clay pot over hot coals. It's prepared with a mixture of tender beef, spices, preserved lemon, and olive oil, creating a dish full of rich, deep flavors. It's particularly popular in Marrakech.",
                fontSize = 14.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(8.dp))


            Text(
                text = "Preparation Time: 6-8 hours",
                fontSize = 12.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(8.dp))


            Text(
                text = "Main Ingredients:",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFF3C623)
            )

            Spacer(modifier = Modifier.height(4.dp))


            Text(
                text = "• Beef\n• Preserved lemon\n• Garlic\n• Cumin\n• Olive oil\n• Saffron\n• Ras el Hanout",
                fontSize = 14.sp,
                color = Color.White
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TanjiaCardPreview() {
    TanjiaCardTheme {
        TanjiaCard()
    }
}
