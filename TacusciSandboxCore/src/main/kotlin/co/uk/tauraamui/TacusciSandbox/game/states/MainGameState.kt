package co.uk.tauraamui.TacusciSandbox.game.states

import co.uk.tauraamui.TacusciSandbox.game.world.World
import com.shc.silenceengine.core.GameState

/**
 * Created by tauraaamui on 03/04/2017.
 */
class MainGameState(private val world: World) : GameState() {

    override fun onEnter() {
        world.load()
    }

    override fun update(delta: Float) {
        world.update(delta)
    }

    override fun render(delta: Float) {
        world.render(delta)
    }

    override fun resized() {}
    override fun onLeave() {}
}