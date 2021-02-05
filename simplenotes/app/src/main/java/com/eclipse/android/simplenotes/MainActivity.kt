package com.eclipse.android.simplenotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.eclipse.android.simplenotes.model.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val wordViewModel: CheckListViewModel by viewModels {
        CheckListViewModelFactory((application as CheckListApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkList = CheckList(2,1,"Interview")
        wordViewModel.insert(checkList)

    }
}