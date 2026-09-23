package enumAndSealedClasses


import javax.annotation.processing.Messager

sealed class UiState{
 class Loading(): UiState()
data class success(val data: String): UiState()
data class Error(val message: String): UiState()
}

open class Human(): UiState()


