package br.edu.ifpr.pedro.vikingsactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ragnar.*

class RagnarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar)

        idMensagem.text = intent.extras.getString("mensagem")
        btLagertha.setOnClickListener { activityLagertha() }
        btBjorn.setOnClickListener { activityBjorn() }
        btFloki.setOnClickListener { activityFloki() }
    }

    private fun activityLagertha() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Ragnar")
        val intent = Intent(this, LagerthaActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityBjorn() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Ragnar")
        val intent = Intent(this, BjornActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityFloki() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Ragnar")
        val intent = Intent(this, FlokiActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
