package com.example.linkedln.presentation.components

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.linkedln.ui.theme.LinkedlnTheme

@Composable
fun AppCard(
    modifier: Modifier = Modifier,
    containerColor: Color = Color.White,
    content: @Composable (ColumnScope.() -> Unit),
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = containerColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp),
        content = content,
    )
}

@Preview
@Composable
fun AppCardPreview() {
    LinkedlnTheme() {
        AppCard {

        }
    }
}