package co.uk.tauraamui.TacusciSandbox.game.entities.mobs

import com.shc.silenceengine.input.Keyboard

/**
 * Created by tauraaamui on 03/04/2017.
 */
class Player : Mob() {

    init {
        position.x = 0F
        position.y = 0F
        position.z = 0F
    }

    override fun onUpdate(deltaTime: Float) {

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

        super.onUpdate(deltaTime)
    }
}