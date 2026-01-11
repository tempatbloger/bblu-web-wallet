package org.bblu.wallet.wallet

import org.bblu.wallet.crypto.Bip39
import java.security.MessageDigest

class HDWallet(mnemonic: String) {
    private val seed = Bip39.mnemonicToSeed(mnemonic)

    fun derivePrivateKey(path: String): ByteArray {
        val sha = MessageDigest.getInstance("SHA-256")
        return sha.digest(seed + path.toByteArray())
    }
}
