package com.eclipse.android.simplenotes.model

import androidx.lifecycle.*
import kotlinx.coroutines.launch

class CheckListViewModel(private val repository: ChecklistRepository) : ViewModel() {

    // Using LiveData and caching what allWords returns has several benefits:
    // - We can put an observer on the data (instead of polling for changes) and only update the
    //   the UI when the data actually changes.
    // - Repository is completely separated from the UI through the ViewModel.

    /**
     * Launching a new coroutine to insert the data in a non-blocking way
     */
    fun insert(checkList: CheckList) = viewModelScope.launch {
        repository.insert(checkList)
    }
}

class CheckListViewModelFactory(private val repository: ChecklistRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CheckListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CheckListViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
