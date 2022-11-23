package com.pyratic.chatlink

import net.fabricmc.api.ModInitializer

@Suppress("UNUSED")
object Chatlink : ModInitializer {
    private const val MOD_ID = "chatlink-fabric"
    override fun onInitialize() {
        println("Example mod has been initialized.")
    }
}
