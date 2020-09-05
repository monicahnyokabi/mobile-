package Response


import com.google.gson.annotations.SerializedName

data class CoursesResponse(
    @SerializedName("course_id") var courseId: String,
@SerializedName("course_name") var courseName: String,
@SerializedName("course_code") var courseCode: String,
@SerializedName("instructor") var instructor: String,
@SerializedName("description") var description: String
)