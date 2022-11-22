package com.example.intentpratice_zeeeni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

//            입력한 새 닉네임이 뭔지? 변수로 저장
            val inputNewNickname = newNicknameEdt.text.toString()

//            입력한 닉네임을 가지고 메인으로 복귀

//            입력한 닉네임을 담아주기 위한 용도로만 사용하는 Intent, 비워두는이유는 이미 왕복티켓끊고들어옴
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNewNickname)
            setResult(RESULT_OK, resultIntent)
            finish()


        }

    }
}