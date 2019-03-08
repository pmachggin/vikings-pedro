package br.edu.ifpr.pedro.vikingsactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rollo.*

class RolloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rollo)

        idMensagem.text = intent.extras.getString("mensagem")
        btBjorn.setOnClickListener { activityBjorn() }
    }

    private fun activityBjorn() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através do personagem Rollo")
        val intent = Intent(this, BjornActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
