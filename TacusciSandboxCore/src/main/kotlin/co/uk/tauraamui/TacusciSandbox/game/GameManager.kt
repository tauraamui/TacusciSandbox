package co.uk.tauraamui.TacusciSandbox.game

import co.uk.tauraamui.TacusciSandbox.TacusciSandbox
import co.uk.tauraamui.TacusciSandbox.game.states.MainGameState
import co.uk.tauraamui.TacusciSandbox.game.world.World

/**
 * Created by alewis on 04/04/2017.
 */
class GameManager(val tacusciSandbox: TacusciSandbox) {

    val world = World(tacusciSandbox)
    val mainGameState = MainGameState(world)

    fun init() { tacusciSandbox.gameState = mainGameState }
}