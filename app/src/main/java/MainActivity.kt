package org.bblu.wallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.bblu.wallet.electrum.ElectrumClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val electrum = ElectrumClient()
        electrum.connect()
    }
}
