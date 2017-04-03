package co.uk.tauraamui.TacusciSandbox

import com.shc.silenceengine.core.Game
import com.shc.silenceengine.core.SilenceEngine
import com.shc.silenceengine.input.Keyboard

/**
 * Created by tauraaamui on 03/04/2017.
 */
class TacusciSandbox : Game() {

    override fun init() {
        SilenceEngine.display.title = "Tacusci Sandbox: Silence Engine ${SilenceEngine.getVersionString()}"
        SilenceEngine.display.setSize(1280, 720)
        SilenceEngine.display.centerOnScreen()
    }

    override fun update(deltaTime: Float) {
        if (Keyboard.isKeyTapped(Keyboard.KEY_ESCAPE)) SilenceEngine.display.close()
    }
}