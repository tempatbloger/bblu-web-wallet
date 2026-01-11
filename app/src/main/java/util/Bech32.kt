package org.bblu.wallet.util

object Bech32 {
    fun encode(hrp: String, data: ByteArray): String {
        return "$hrp" + "1" + data.joinToString("") { "%02x".format(it) }
    }
}
