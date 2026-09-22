package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // apply: cấu hình ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }

        // also: thực hiện thêm thao tác với binding
        binding.also {
            it.tvTitle.text = "Bài tập 2 - Android Scope"
        }

        // with: làm việc với nhiều View trong binding
        with(binding) {

            btnDisplay.setOnClickListener {

                // let: lấy dữ liệu từ EditText và xử lý
                val name = edtName.text.toString().trim().let {
                    if (it.isEmpty()) "Chưa nhập tên" else it
                }

                val mssv = edtMssv.text.toString().trim().let {
                    if (it.isEmpty()) "Chưa nhập MSSV" else it
                }

                // run: tạo kết quả từ dữ liệu
                val result = run {
                    "Họ tên: $name\nMSSV: $mssv"
                }

                tvResult.text = result
            }
        }
    }
}