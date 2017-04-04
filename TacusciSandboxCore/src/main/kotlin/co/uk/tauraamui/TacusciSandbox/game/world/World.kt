package co.uk.tauraamui.TacusciSandbox.game.world

import co.uk.tauraamui.TacusciSandbox.game.Player
import co.uk.tauraamui.TacusciSandbox.game.levels.Level

/**
 * Created by tauraaamui on 03/04/2017.
 */

class World() {

    var level = Level()

    fun update(delta: Float) {}
    fun render(delta: Float) {}
    fun loadLevel(level: Level) { this.level = level }
}