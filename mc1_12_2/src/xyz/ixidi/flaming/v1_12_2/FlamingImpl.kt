package xyz.ixidi.flaming.v1_12_2

import net.minecraft.client.Minecraft
import xyz.ixidi.flaming.api.Flaming
import xyz.ixidi.flaming.v1_12_2.gui.InGameGUI

class FlamingImpl(
    private val minecraft: Minecraft

) : Flaming {

    val gui = InGameGUI(minecraft)

    fun start() {

    }

}