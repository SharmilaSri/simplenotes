package com.eclipse.android.simplenotes.model

class Note (title:String,content:String,checkList: MutableList<CheckList>,tag:String,createdDate:String){
    var title: String=""
    var content : String=""
    var checkList=mutableListOf<CheckList>();
    var tag :String=""
    var createdDate:String="";

    init {
        this.title=title;
        this.content=content;
        this.checkList=checkList;
        this.tag=tag;
        this.createdDate=createdDate;

    }


}