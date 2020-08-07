package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
        Var courses listOf{
            courses("6677888888888","Python","5647","Best course")
            courses("6643568888","BootStrap","5453","Medium course")
            courses("6677548968","PHp","5667","Worst course")
            courses("665467778888","Java","5677","Best course")
            courses("6677888888888","Python","5547","Best course")
            courses("6677888888888","Python","5647","Best course")
            courses("6677888888888","","5687","Best course")
            courses("667787778888","C++","5697","Best course")
            courses("6677888332211","Enterprenuership","5327","Best course")
            courses("667788666688","Javascript","907","Best course")

    }
}rvCourses.adpter=coursesRecyclerViewAdapterView