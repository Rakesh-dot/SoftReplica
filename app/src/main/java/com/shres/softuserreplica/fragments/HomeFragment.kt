package com.shres.softuserreplica.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shrest.softuserreplica.R
import com.shres.softuserreplica.StudentListData
import com.shres.softuserreplica.adapter.StudentAdapter
import com.shres.softuserreplica.model.Student


class HomeFragment : Fragment() {
    private val lstStudents = ArrayList<Student>()
    private lateinit var recyclerView: RecyclerView
    //private lateinit var recyclerView2: RecyclerView
    //private var newList = ArrayList<Student>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
//

        if (StudentListData.get().list().size == 0){
            loadStudents()
        }

        val adapter = StudentAdapter(StudentListData.get().list(),context!!)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter

//        newList = arguments?.getParcelableArrayList("list")!!
//        val adapter2 = StudentAdapter(newList,this@HomeFragment)
//        recyclerView2.layoutManager = LinearLayoutManager(activity)
//        recyclerView2.adapter = adapter2
        return view

    }

    private fun loadStudents() {
        StudentListData.get().list().add(Student(1,"Rakesh Shrestha","Narayantar",21,"Male"))
        StudentListData.get().list().add(Student(2,"Sita Kunwar","Chitwan",20,"Female"))
        StudentListData.get().list().add(Student(3,"Santosh BAsnet","Narayanghat",23,"Male"))
    }

}