package co.uk.tauraamui.TacusciSandbox

import co.uk.tauraamui.TacusciSandbox.game.states.MainMenuState
import com.shc.silenceengine.core.Game
import com.shc.silenceengine.core.SilenceEngine
import com.shc.silenceengine.input.Keyboard

/**
 * Created by tauraaamui on 03/04/2017.
 */
class TacusciSandbox : Game() {

    val mainMenuState = MainMenuState()

    override fun init() {
        SilenceEngine.display.title = "Tacusci Sandbox: Silence Engine ${SilenceEngine.getVersionString()}"
        SilenceEngine.display.setSize(1280, 720)
        SilenceEngine.display.centerOnScreen()

        setGameState(mainMenuState)
    }

    override fun update(deltaTime: Float) {
        if (Keyboard.isKeyTapped(Keyboard.KEY_ESCAPE)) SilenceEngine.display.close()
    }
}