package co.uk.tauraamui.TacusciSandbox.game.world

import co.uk.tauraamui.TacusciSandbox.TacusciSandbox
import co.uk.tauraamui.TacusciSandbox.game.entities.mobs.Player
import com.shc.silenceengine.graphics.cameras.PerspCam
import com.shc.silenceengine.scene.Scene3D

/**
 * Created by tauraaamui on 03/04/2017.
 */

class World(var tacusciSandbox: TacusciSandbox) {

    var perspCam: PerspCam? = null
    var player = Player()
    var scene = Scene3D()

    fun load() {
        perspCam = PerspCam()
        perspCam?.position = player.position
        scene.entities.add(player)
    }

    fun update(delta: Float) { scene.update(delta); perspCam?.position = player.position }
    fun render(delta: Float) {}
}