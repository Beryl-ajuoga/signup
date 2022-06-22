package dev.beryl.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.beryl.workoutlog.databinding.ActivitySignupBinding
import java.net.PasswordAuthentication

class signupActivity : AppCompatActivity(){
    lateinit var binding:ActivitySignupBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvlogin.setOnClickListener{ validateSignUp()}
        binding.tvlogin.setOnClickListener{
            val intent=Intent(this,LoginActivity::class.java)
validateSignUp()
        }
    }
    fun validateSignUp() {
//        var Password= binding.etpassword.text.toString()
        var confirmpassword = binding.etconfirm.text.toString()
        var firstName = binding.etfirstname.text.toString()
        var lastName = binding.etlastname.text.toString()
        var password = binding.tilpassword.textDirection.toString()
        var email = binding.etemail.text.toString()




        if (confirmpassword.isBlank()){
            binding.etconfirm.error = "confirmation is required"
        }
        if (firstName.isBlank()){
            binding.etfirstname.error = "First name is required"
        }
        if (lastName.isBlank()){
            binding.etlastname.error = "Last name is required"
        }
        if (password==confirmpassword){
            binding.tilconfirm.error ="confirm password"
        }
        if (password!=confirmpassword){
            binding.tilconfirm.error ="not correct"
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tilemaill.error="email is invalid"
        }

    }

}