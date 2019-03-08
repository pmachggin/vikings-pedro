package br.edu.ifpr.pedro.vikingsactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btAthelstan.setOnClickListener { activityAthelstan() }
        btBjorn.setOnClickListener { activityBjorn() }
        btFloki.setOnClickListener { activityFloki() }
        btLagertha.setOnClickListener { activityLagertha() }
        btRagnar.setOnClickListener { activityRagnar() }
        btRollo.setOnClickListener { activityRollo() }

    }

    private fun activityAthelstan() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através da home")
        val intent = Intent(this, AthelstanActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityBjorn() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através da home")
        val intent = Intent(this, BjornActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityFloki() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através da home")
        val intent = Intent(this, FlokiActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityLagertha() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através da home")
        val intent = Intent(this, LagerthaActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityRagnar() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através da home")
        val intent = Intent(this, RagnarActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }

    private fun activityRollo() {
        val bundle = Bundle()
        bundle.putString("mensagem", "Você chegou neste personagem através da home")
        val intent = Intent(this, RolloActivity::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}
