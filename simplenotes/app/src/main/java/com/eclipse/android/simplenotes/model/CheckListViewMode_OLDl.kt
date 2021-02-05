package com.eclipse.android.simplenotes.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CheckListViewModel_OLD(private val repository: ChecklistRepository) : ViewModel() {


    /**
     * Launching a new coroutine to insert the data in a non-blocking way
     */
    fun insert(checkList: CheckList) = viewModelScope.launch {
        repository.insert(checkList)
    }
}

class CheckListViewModelFactory_OLD(private val repository: ChecklistRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CheckListViewModel_OLD::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CheckListViewModel_OLD(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}