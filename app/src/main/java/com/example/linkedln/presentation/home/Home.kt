package com.example.linkedln.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.linkedln.data.model.PostModel
import com.example.linkedln.presentation.components.TopAppBarSample


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    homeViewModel: HomeViewModel = viewModel()
) {

    val messages: List<PostModel> by homeViewModel.messages.observeAsState(
        initial = emptyList<PostModel>().toMutableList()
    )
    var pesquisa by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBarSample(onNameChange = { pesquisa = it })
        },

        content = { paddingValues ->

            ConstraintLayout(
                modifier = Modifier.fillMaxWidth()
                    .padding(paddingValues)

            ) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentPadding = PaddingValues(horizontal = 0.dp, vertical = 0.dp),
                    verticalArrangement = Arrangement.spacedBy(0.dp),
                    reverseLayout = true
                ) {
                    items(messages) { message ->
                        DetailsHome()
                    }
                }
            }
        },
        bottomBar = {
        }
    )
}


