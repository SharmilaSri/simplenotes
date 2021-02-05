package com.eclipse.android.simplenotes.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class  CheckList (
@PrimaryKey(autoGenerate = true)
val id: Int? = null,
var status: Int?=0,
var description :String?="")

   /* @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "status") var status: Int=0//should change to enum
    @ColumnInfo(name = "description") var description: String=""

    init{
        this.description=description;
        this.status=status;
    }*/

