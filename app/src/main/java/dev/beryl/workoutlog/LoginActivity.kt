package dev.beryl.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.net.PasswordAuthentication

class LoginActivity : AppCompatActivity() {
    lateinit var etemail: TextInputEditText
    lateinit var tvSignup: TextView
    lateinit var etpassword:TextInputEditText
    lateinit var btnlogin:Button
    lateinit var tilemail:TextInputLayout
    lateinit var tilpassword:TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this,LoginActivity::class.java)
        setContentView(R.layout.activity_login)
        tvSignup = findViewById(R.id.tvSignup)
        etemail =findViewById(R.id.etemail)
        btnlogin = findViewById(R.id.btnlogin)
        etpassword =findViewById(R.id.etpassword)
        tilemail = findViewById(R.id.tilemail)
        tvSignup.setOnClickListener{
            val intent =Intent(this ,signupActivity::class.java)
            startActivity(intent)

        }
        btnlogin.setOnClickListener{

            val intent=Intent(this ,HomeActivity::class.java)
            startActivity(intent)
            validateLogin()
        }


    }
    fun validateLogin(){
        var email = etemail.text.toString()
        var password = etpassword.text.toString()

        if (email.isBlank()){
            tilemail.error = "Email is required"
        }
        if (password.isBlank()){
            tilpassword.error = "Password is required"
        }

    }
}