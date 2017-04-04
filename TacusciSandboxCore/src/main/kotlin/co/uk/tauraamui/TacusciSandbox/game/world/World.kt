package co.uk.tauraamui.TacusciSandbox.game.world

import co.uk.tauraamui.TacusciSandbox.TacusciSandbox
import co.uk.tauraamui.TacusciSandbox.game.entities.Entity
import co.uk.tauraamui.TacusciSandbox.game.entities.mobs.Player

/**
 * Created by tauraaamui on 03/04/2017.
 */

class World(var tacusciSandbox: TacusciSandbox) {

    var player = Player()

    val entities = mutableListOf<Entity>()

    fun update(delta: Float) { player.update(delta); entities.forEach { entity -> entity.update(delta) } }
    fun render(delta: Float) {}
}