package ch.deletescape.ripmagisk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val time = measureTimeMillis {
            val magisk = Detector(this).checkForMagisk()
            result.text = if (magisk) "Magisk detected" else "No magisk detected"
        }
        duration.text = "Finished in $time ms"
    }
}
