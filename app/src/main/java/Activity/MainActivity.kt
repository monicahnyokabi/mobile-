package Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hello.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun onCreate(
        savedInstanceState: Bundle?,
        tvRegister: Any,
        btnLogin: Any
    ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tvRegister.setOnClickListener {
            val intent = Intent(baseContext, RegistrationActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            var userName = etUserName.text.toString()
            var password = etPassword.text.toString()
            Toast.makeText(baseContext, password, Toast.LENGTH_SHORT).show()
            startActivity(Intent(baseContext, CoursesActivity::class.java))

            btnReg.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub
                    if(etfirstname.getText().toString().length()==0){
                        etfirstname.setError("First name not entered");
                        etfirstname.requestFocus();
                    }
                    if(etlastname.getText().toString().length()==0){
                        etlastname.setError("Last name not entered");
                        etlastname.requestFocus();
                    }

                    if(etusername.getText().toString().length()==0){
                        etusername.setError("Username is Required");
                        etusername.requestFocus();
                    }
                    if(etPassword.getText().toString().length()==0){
                        etPassword.setError("Password not entered");
                        etPassword.requestFocus();
                    }
                    if(etConfirmPassword.getText().toString().length()==0){
                        etConfirmPassword.setError("Please confirm password");
                        etConfirmPassword.requestFocus();
                    }
                    if(!etPassword.getText().toString().equals(etConfirmPassword.getText().toString())){
                        etConfirmPassword.setError("Password Not matched");
                        etconfirmpassword.requestFocus();
                    }
                    if(etPassword.getText().toString().length()<8 span="">
                            etPassword.setError("Password should be atleast of 8 charactors");
                    etPassword.requestFocus();


                }

                else {
                Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
            }

            }
        });

    }
    }
}
