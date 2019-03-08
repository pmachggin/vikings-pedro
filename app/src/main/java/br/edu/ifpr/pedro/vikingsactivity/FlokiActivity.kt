package br.edu.ifpr.pedro.vikingsactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_floki.*

class FlokiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)

        idMensagem.text = intent.extras.getString("mensagem")
        btRagnar.setOnClickListener { activityRagnar() }
    }

    private fun activityRagnar() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Floki")
        val intent = Intent(this, RagnarActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
