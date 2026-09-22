package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.utils.gone
import com.example.myapplication.utils.show
import com.example.myapplication.utils.toast
import com.example.myapplication.utils.textValue
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvResult.gone()

        binding.btnDisplay.setOnClickListener {

            val name = binding.edtName.textValue()
            val mssv = binding.edtMssv.textValue()

            if (name.isEmpty() || mssv.isEmpty()) {

                toast("Vui lòng nhập đầy đủ thông tin")

                binding.tvResult.gone()

            } else {

                binding.tvResult.text =
                    "Họ tên: $name\nMSSV: $mssv"

                binding.tvResult.show()

                toast("Hiển thị thông tin thành công")
            }
        }
    }
}