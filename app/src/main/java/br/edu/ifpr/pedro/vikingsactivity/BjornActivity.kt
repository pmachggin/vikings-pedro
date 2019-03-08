package br.edu.ifpr.pedro.vikingsactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bjorn.*

class BjornActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)

        idMensagem.text = intent.extras.getString("mensagem")
        btLagertha.setOnClickListener { activityLagertha() }
        btRagnar.setOnClickListener { activityRangar() }
        btFloki.setOnClickListener { activityFloki() }
        btAthelstan.setOnClickListener { activityAthelstan() }
    }

    private fun activityLagertha() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Bjorn")
        val intent = Intent(this, LagerthaActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityRangar() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Bjorn")
        val intent = Intent(this, RagnarActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityFloki() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Bjorn")
        val intent = Intent(this, FlokiActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityAthelstan() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Bjorn")
        val intent = Intent(this, AthelstanActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
