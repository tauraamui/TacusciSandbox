package co.uk.tauraamui.TacusciSandbox.game.entities

import com.shc.silenceengine.math.Vector3

/**
 * Created by alewis on 04/04/2017.
 */
open class Entity {

    val position: Vector3 = Vector3()

    fun update(delta: Float) { println(position) }
}