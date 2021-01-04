package xyz.ixidi.flaming.v1_12_2.gui

import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiScreen
import org.lwjgl.opengl.GL11
import java.awt.Color

class InGameGUI (
        private val minecraft: Minecraft
) : GuiScreen() {

    private fun renderMicButton() {
        GL11.glPushMatrix()


        GuiScreen.drawRect(0, 0, 50, 50, Color(255, 0, 0, 122))

        GL11.glPopMatrix()
    }

    fun renderScreen() {
        this.renderMicButton()
        minecraft.fontRenderer.drawStringWithShadow("Dziala", 60f, 60f, 0xff0000)
    }
}