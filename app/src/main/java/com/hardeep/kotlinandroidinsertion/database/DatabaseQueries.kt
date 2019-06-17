package com.hardeep.kotlinandroidinsertion.database

import android.content.ContentValues
import android.content.Context

class DatabaseQueries {

    var sql : DatabaseCreation?= null
    constructor(context: Context)
    {
        sql = DatabaseCreation(context)
    }

    fun addUser(name:String,email:String,password:String):Long
    {
        val db = sql!!.writableDatabase
        val cv = ContentValues()
        cv.put(DatabaseColumns.USER_NAME,name)
        cv.put(DatabaseColumns.USER_EMAIL,email)
        cv.put(DatabaseColumns.USER_PASS,password)
        return db.insert(DatabaseColumns.TABLE_NAME,null,cv)

    }
}