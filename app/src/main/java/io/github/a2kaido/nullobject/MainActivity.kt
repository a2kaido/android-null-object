package io.github.a2kaido.nullobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_text.setOnClickListener {
            startActivity(SubActivity.buildIntent(this, NullParent.Null))
        }
    }
}
