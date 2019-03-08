package br.edu.ifpr.pedro.vikingsactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_athelstan.*

class AthelstanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athelstan)

        idMensagem.text = intent.extras.getString("mensagem")
        btRagnar.setOnClickListener { activityRagnar() }
        btBjorn.setOnClickListener { activityBjorn() }
    }

    private fun activityRagnar() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Athelstan")
        val intent = Intent(this, RagnarActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityBjorn() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Athelstan")
        val intent = Intent(this, BjornActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }


}
