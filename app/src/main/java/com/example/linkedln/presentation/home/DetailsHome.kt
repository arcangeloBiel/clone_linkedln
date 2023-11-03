package com.example.linkedln.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.PersonPin
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.linkedln.presentation.components.AppCard
import com.example.linkedln.ui.theme.LinkedlnTheme
import com.example.linkedln.ui.theme.Spacing_1
import com.example.linkedln.ui.theme.Spacing_2

@Composable
fun DetailsHome(modifier: Modifier = Modifier) {
return Column {
    AppCard(
        modifier = modifier
            .fillMaxWidth()

    ) {
        Column(modifier = Modifier.padding(Spacing_2)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(0.8f)
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