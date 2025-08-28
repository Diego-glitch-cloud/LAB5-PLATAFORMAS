package com.example.laboratorio5


import android.net.Uri
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class GaleriaViewModel : ViewModel() {
    private val _imagesUris = MutableStateFlow<List<Uri>>(emptyList())

    val imagesUris: StateFlow<List<Uri>> = _imagesUris.asStateFlow()

    fun addImage(uri: Uri) {
        _imagesUris.update { currentList -> currentList + uri }
    }

}