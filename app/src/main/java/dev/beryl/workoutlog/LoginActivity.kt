package dev.beryl.workoutlog


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.beryl.workoutlog.databinding.ActivityLoginBinding
import java.net.PasswordAuthentication

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnlogin.setOnClickListener{validateLogin()}
        binding.btnlogin.setOnClickListener{
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        binding.tvSignup.setOnClickListener {
            val intent=Intent(this,signupActivity::class.java)
            startActivity(intent)
        }
//            val intent =Intent(this ,signupActivity::class.java)
//            startActivity(intent)
//
//        }
//        binding.btnlogin.setOnClickListener{
//
//            val intent=Intent(this ,HomeActivity::class.java)
//            startActivity(intent)
//            validateLogin()
//        }

    }
    fun validateLogin(){
        var email = binding.etemail.text.toString()
        var password = binding.etpassword.text.toString()

        if (email.isBlank()){
            binding.tilemail.error = "Email is required"
        }
        if (password.isBlank()){
            binding.tilpassword.error = "Password is required"
        }

    }
}