package com.shres.softuserreplica

import com.shres.softuserreplica.model.Student

class StudentListData private constructor(){
    var mylist =ArrayList<Student>()

    fun list(): ArrayList<Student>{
        return mylist
    }

    companion object {
        private val data = StudentListData()
        fun get(): StudentListData {
            return data
        }
    }
}