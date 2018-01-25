package cn.zt.ztest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import cn.zt.dialog.custom.TextDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener({
            TextDialogBuilder(this)
                    .message("TextDialogBuilder Test")
                    .show()
        })
    }
}