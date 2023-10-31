package com.example.linkedln.presentation.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.linkedln.data.model.PostModel
import com.example.linkedln.presentation.Constants
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase


class HomeViewModel(): ViewModel() {

    init {
       getMessages()
    }


    private var _messages = MutableLiveData(emptyList<PostModel>().toMutableList())
    val messages: LiveData<MutableList<PostModel>> = _messages




    /**
     * Get the messages
     */
    private fun getMessages() {
        Firebase.firestore.collection(Constants.POST)
            //.orderBy(Constants.SENT_ON)
            .addSnapshotListener { value, e ->
                if (e != null) {
                    Log.w("data", "Listen failed.", e)
                    return@addSnapshotListener
                }

                val list = emptyList<PostModel>().toMutableList()

                if (value != null) {
                    for (doc in value) {
                       // val data = doc.data
                        val post = doc.toObject(PostModel::class.java)
                        // TODO: depois validar com o usuario logado
                        //data[Constants.IS_CURRENT_USER] = Firebase.auth.currentUser?.uid.toString() == data[Constants.SENT_BY].toString()

                        list.add(post)
                    }
                }

                updatepost(list)
            }
    }

    /**
     * Update the list after getting the details from firestore
     */
    private fun updatepost(list: MutableList<PostModel>) {
        _messages.value = list.asReversed()
    }
}