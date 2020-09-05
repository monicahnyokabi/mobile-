package Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hello.R

class row_activity_item : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_row_item)
        data class courses()
        var id:"int"
        var courses:"String"
        var instructor:"String"
        var description:"String"

    }
}