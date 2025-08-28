package com.example.laboratorio5


import android.net.Uri
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class Foto(
    val uri: Uri,
    val titulo: String
)

class GaleriaViewModel : ViewModel() {
    private val _imagesUris = MutableStateFlow<List<Foto>>(emptyList())
    val imagesUris: StateFlow<List<Foto>> = _imagesUris.asStateFlow()

    fun addImage(uri: Uri) {
        val titulo = uri.lastPathSegment ?: "Sin título"

        val nuevaFoto = Foto(uri = uri, titulo = titulo)
        _imagesUris.update { currentList -> currentList + nuevaFoto }
    }

}