package tw.edu.pu.hello2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txv: TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello 丹尼爾"

       // TestMaster()
    }
    fun TestMaster(){
        var txv:TextView = findViewById<TextView>(R.id.txv)txv.text = "Master分支"
    }
}