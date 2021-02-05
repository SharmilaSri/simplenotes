package com.eclipse.android.simplenotes.model

import androidx.annotation.WorkerThread

class ChecklistRepository(private val checkListDao: CheckListDao) {
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(checkList: CheckList) {
        checkListDao.insert(checkList)
    }
}