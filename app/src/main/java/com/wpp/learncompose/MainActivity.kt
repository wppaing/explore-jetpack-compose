package com.wpp.learncompose

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wpp.learncompose.ui.theme.LearningJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearningJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Birthday card ui
//                    GreetingImage(
//                        message = stringResource(R.string.happy_birthday_text),
//                        from = stringResource(R.string.signature_text)
//                    )

                    // Compose Article ui
//                    ComposeArticle(
//                        title = stringResource(id = R.string.article_title),
//                        sectionOne = stringResource(
//                            id = R.string.article_section_one
//                        ),
//                        sectionTwo = stringResource(
//                            id = R.string.article_section_two
//                        )
//                    )

                    // Task Manager ui
//                    TaskManager(
//                        title = stringResource(id = R.string.task_manager_title),
//                        description = stringResource(id = R.string.task_manager_description)
//                    )

                    // Compose Quadrant app
//                    ComposeQuadrant()

                    // Business Card Ui
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .align(Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Composable
fun ComposeArticle(
    title: String,
    sectionOne: String,
    sectionTwo: String,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        val image = painterResource(id = R.drawable.bg_compose_background)
        Image(painter = image, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = sectionOne,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Text(
            text = sectionTwo,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun TaskManager(title: String, description: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        val image = painterResource(id = R.drawable.ic_task_completed)

        Image(painter = image, contentDescription = null)
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(top = 24.dp)
                .padding(bottom = 8.dp)
        )
        Text(text = description, fontSize = 16.sp)
    }
}

@Composable
fun QuadrantCard(title: String, description: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = description, textAlign = TextAlign.Justify)
    }
}

@Composable
fun ComposeQuadrant() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            QuadrantCard(
                title = "Text composable",
                description = stringResource(id = R.string.text_composable_desc),
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFEADDFF))
            )
            QuadrantCard(
                title = "Image composable",
                description = stringResource(id = R.string.image_composable_desc),
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFD0BCFF))
            )
        }
        Row(Modifier.weight(1f)) {
            QuadrantCard(
                title = "Row composable",
                description = stringResource(id = R.string.row_composable_desc),
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
            )
            QuadrantCard(
                title = "Column composable",
                description = stringResource(id = R.string.column_composable_desc),
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
            )
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4))
    ) {
        val color = Color(0xFF006D3A)

        Box(
            Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Box(
                    Modifier
                        .width(100.dp)
                        .background(Color(0xFF073042))
                        .padding(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.android_logo),
                        contentDescription = null
                    )
                }
                Text(
                    text = "Jennifer Doe",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = "Android developer Extraordinaire",
                    color = color,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 40.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp),
            ) {

                Row {
                    Icon(Icons.Rounded.Phone, contentDescription = null, tint = color)
                    Spacer(Modifier.width(20.dp))
                    Text(
                        text = "+11 (123) 444 555 666",
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Row {
                    Icon(Icons.Rounded.Share, contentDescription = null, tint = color)
                    Spacer(Modifier.width(20.dp))
                    Text(
                        text = "@AndroidDev",
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Row {
                    Icon(Icons.Rounded.Email, contentDescription = null, tint = color)
                    Spacer(Modifier.width(20.dp))
                    Text(
                        text = "jen.doe@android.com",
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    LearningJetpackComposeTheme {
        BusinessCard()
    }

}