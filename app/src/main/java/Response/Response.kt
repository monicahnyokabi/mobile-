package Response

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hello.R
import com.google.gson.annotations.SerializedName

class Response : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_response)
        data class RegistrationResponse(
            @SerializedName("message") var message: String,
            @SerializedName("student") var student: Student
        )

    }
}