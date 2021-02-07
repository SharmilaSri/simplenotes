package com.eclipse.android.simplenotes.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface CheckListDao {

    @Query("SELECT * FROM checklist")
    fun getAll(): List<CheckList>

    @Insert
    fun insertAll( checkList: CheckList)

    @Delete
    fun delete(checkList: CheckList)

    @Insert
    fun insert( checkList: CheckList)
}