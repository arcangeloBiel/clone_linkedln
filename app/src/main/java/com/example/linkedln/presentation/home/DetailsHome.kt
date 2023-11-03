package com.example.linkedln.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.PersonPin
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.linkedln.presentation.components.AppCard
import com.example.linkedln.ui.theme.LinkedlnTheme
import com.example.linkedln.ui.theme.Spacing_1
import com.example.linkedln.ui.theme.Spacing_2
import com.example.linkedln.R

@Composable
fun DetailsHome(modifier: Modifier = Modifier) {
return Column {
    AppCard(
        modifier = modifier
            .fillMaxWidth()

    ) {
        Column() {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(Spacing_2)
                ) {
                    Icon(
                        imageVector = Icons.Filled.PersonPin,
                        contentDescription = "PersonPin"
                    )
                    Text(
                        modifier = Modifier.fillMaxWidth().padding(start = Spacing_1),
                        text = "Descrição do usuario"
                    )
                }
                Icon(
                    imageVector = Icons.Filled.MoreHoriz,
                    contentDescription = "MoreHoriz"
                )
            }
            Box(
                Modifier.fillMaxWidth()
                    .clickable {
                       // showExpanded()
                    }) {
                Card {
                    Image(
                        painter = painterResource(id = R.drawable.ic_banner_foreground),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1.8f)
                    )

                }
            }
//            Text(
//                text = "balance.formatCurrency()",
//                style = TextStyle(
//                    fontSize = 32.sp,
//                    fontWeight = FontWeight.W700,
//                    color = Color.Black,
//                    letterSpacing = 0.32.sp
//                )
//            )
//            Text(
//                text = "Saldo + Limite:",
//                style = TextStyle(
//                    fontSize = 18.sp,
//                    fontWeight = FontWeight.W600,
//                    color = Color.Black,
//                    letterSpacing = 0.32.sp
//                )
//            )
//            Divider(
//                modifier = Modifier.padding(top = Spacing_4)
//            )
//            TextButton(
//                modifier = Modifier.align(Alignment.CenterHorizontally),
//                onClick = { /*TODO*/ }) {
//                Text(text = "Ver Extrato")
//            }
        }
    }
}
}
@Preview
@Composable
fun BalanceCardPreview() {
    LinkedlnTheme() {
        DetailsHome()
    }
}