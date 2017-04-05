package co.uk.tauraamui.TacusciSandbox.game.entities.mobs

import com.shc.silenceengine.math.Vector3
import com.shc.silenceengine.scene.entity.Entity3D

/**
 * Created by alewis on 04/04/2017.
 */
open class Mob : Entity3D() {

    var planeAngle = 0.toDouble()
    var heightAngle = 0.toDouble()

    var direction = Vector3()
    var velocity = 1

    override fun onUpdate(deltaTime: Float) {
        super.onUpdate(deltaTime)
    }
}