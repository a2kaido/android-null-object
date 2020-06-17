package io.github.a2kaido.nullobject

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {

    private enum class ExtraKey {
        NULL
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // I/System.out: io.github.a2kaido.nullobject.NullParent$Null
        println(intent.getParcelableExtra<NullParent.Null>(ExtraKey.NULL.name))

        NullParent.list.forEach {
            // I/System.out: null
            println(it)
        }
    }

    companion object {
        fun buildIntent(context: Context, `null`: NullParent.Null): Intent =
            Intent(context, SubActivity::class.java)
                .putExtra(ExtraKey.NULL.name, `null`)
    }
}
