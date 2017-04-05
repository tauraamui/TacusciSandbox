package co.uk.tauraamui.TacusciSandbox.game.entities

import com.shc.silenceengine.input.Keyboard
import com.shc.silenceengine.math.Vector3

/**
 * Created by alewis on 04/04/2017.
 */
open class Entity {

    val position = Vector3(0f, 0f, 0f)
    val direction = Vector3(0f, 0f, 0f)

    val velocity = 1

    var heightAngle = 0.toDouble()
    var planeAngle = 0.toDouble()

    fun update(delta: Float) {

        if (Keyboard.isKeyDown(Keyboard.KEY_A)) planeAngle -= 1
        if (Keyboard.isKeyDown(Keyboard.KEY_D)) planeAngle += 1

        direction.x = (Math.cos(planeAngle)*Math.cos(heightAngle)).toFloat()
        direction.z = (Math.sin(planeAngle)*Math.cos(heightAngle)).toFloat()
        direction.y = Math.sin(heightAngle).toFloat()

        direction.normalize()

        direction.x *= velocity
        direction.y *= velocity
        direction.z *= velocity

        if (Keyboard.isKeyDown(Keyboard.KEY_W)) position.add(direction)
        if (Keyboard.isKeyDown(Keyboard.KEY_S)) position.subtract(direction)

        println(position)
    }
}