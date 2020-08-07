package com.example.hello
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.helloo.Courses
import com.example.helloo.R

abstract class CoursesRecyclerViewAdapter (
    val courses:List<CoursesRecyclerViewAdapter>):
    RecyclerView.Adapter<CoursesRecyclerViewAdapter.CoursesViewHolder>(){
    abstract override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CoursesRecyclerViewAdapter.CoursesViewHolder (

    LayoutInflater.from(parent.context).inflate(R.layout.item_courses,parent,false)
    )
    override fun getItemCount() = courses.size

    override fun onBindViewHolder(
        holder: CoursesRecyclerViewAdapter.CoursesViewHolder,
        position: Int) {
        val courses = courses[position]
        holder.itemView.id.text = course.id
        holder.itemView.name.text = course.name
        holder.itemView.code = course.code
        holder.itemView.id.instructor = course.instructor
        holder.itemView.description = course.description
    }

    class CoursesViewHolder ( View: View) : RecyclerView.ViewHolder(view)

}

)
}

