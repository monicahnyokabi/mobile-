package Response

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hello.R
import com.google.gson.annotations.SerializedName

class Student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student4)
        data class Student(
            @SerializedName("student_id") var studentId: String,
            @SerializedName("first_name") var firstName: String,
            @SerializedName("last_name") var lastName: String,
            @SerializedName("email") var email: String,
            @SerializedName("phone_number") var phoneNumber: String,
            @SerializedName("image_url") var imageUrl: String
        )

    }
}