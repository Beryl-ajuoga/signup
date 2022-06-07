package dev.beryl.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.net.PasswordAuthentication

class signupActivity : AppCompatActivity() {
    lateinit var etpassword:TextInputEditText
    lateinit var etfirstname: TextInputEditText
    lateinit var etlastname: TextInputEditText
    lateinit var etconfirm:TextInputEditText
    lateinit var etemail:TextInputEditText
    lateinit var tilemaill:TextInputLayout
    lateinit var btnsignup:Button
    lateinit var tilpassword:TextInputLayout
    lateinit var tilconfirm: TextInputLayout
    lateinit var tvlogin:TextView
    lateinit var tilfirstname:TextInputLayout
    lateinit var tillastname:TextInputLayout




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        tvlogin =findViewById(R.id.tvlogin)
        etpassword =findViewById(R.id.etPassword2)
        etfirstname =findViewById(R.id.etfirstname)
        etlastname = findViewById(R.id.etlastname)
        etemail=findViewById(R.id.etemail)
        tilemaill=findViewById(R.id.tilemaill)
        etconfirm= findViewById(R.id.etconfirm)
        btnsignup = findViewById(R.id.btnsignup)
        tilpassword = findViewById(R.id.tilpassword)
        tilfirstname = findViewById(R.id.tilfirstname)
        tillastname = findViewById(R.id.tillastname)
        tilconfirm=findViewById(R.id.tilconfirm)
        tvlogin=findViewById(R.id.tvlogin)



        tvlogin.setOnClickListener{
            val intent = Intent( this , signupActivity::class.java)
            startActivity(intent)
        }
        btnsignup.setOnClickListener{
            validateSignUp()
        }
    }
    fun validateSignUp(){
        var Password = etpassword.text.toString()
        var confirmpassword =etconfirm.text.toString()
        var firstName = etfirstname.text.toString()
        var lastName = etlastname.text.toString()
        var password =etpassword.text.toString()
        var email =etemail.text.toString()



        if (confirmpassword.isBlank()){
            etconfirm.error = "confirmation is required"
        }
        if (firstName.isBlank()){
            etfirstname.error = "First name is required"
        }
        if (lastName.isBlank()){
            etlastname.error = "Last name is required"
        }
        if (password==confirmpassword){
            tilconfirm.error ="confirm password"
        }
        if (password!=confirmpassword){
            tilconfirm.error ="not correct"
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            tilemaill.error="email is invalid"
        }

    }

}