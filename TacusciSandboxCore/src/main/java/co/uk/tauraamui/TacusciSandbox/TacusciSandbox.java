package co.uk.tauraamui.TacusciSandbox;

import com.shc.silenceengine.core.Game;
import com.shc.silenceengine.core.SilenceEngine;
import com.shc.silenceengine.input.Keyboard;

public class TacusciSandbox extends Game {
    @Override
    public void init() {
        SilenceEngine.display.setTitle("TacusciSandbox: SilenceEngine " + SilenceEngine.getVersionString());
        SilenceEngine.display.setSize(1280, 720);
        SilenceEngine.display.centerOnScreen();
    }

    @Override
    public void update(float deltaTime) {
        if (Keyboard.isKeyTapped(Keyboard.KEY_ESCAPE))
            SilenceEngine.display.close();
    }
}