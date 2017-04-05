package co.uk.tauraamui.TacusciSandbox.game.entities

import com.shc.silenceengine.core.SilenceEngine
import com.shc.silenceengine.input.Keyboard
import com.shc.silenceengine.math.Vector3

/**
 * Created by alewis on 04/04/2017.
 */
open class Entity {

    val position = Vector3()
    var maxSpeed = 1.0F
    var acceleration = 0.2F
    var velocity = Vector3()

    fun update(delta: Float) {
        if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            velocity.x += acceleration
            if (velocity.x > maxSpeed) { velocity.x = maxSpeed }
        }
        position.
    }
}