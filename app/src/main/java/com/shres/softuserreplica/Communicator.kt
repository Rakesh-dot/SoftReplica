package com.shres.softuserreplica

import com.shres.softuserreplica.model.Student

interface Communicator {
    fun passData(lstStd: ArrayList<Student>)
}