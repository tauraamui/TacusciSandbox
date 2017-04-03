package co.uk.tauraamui.TacusciSandbox.desktop;

import com.shc.silenceengine.backend.lwjgl.LwjglRuntime;
import co.uk.tauraamui.TacusciSandbox.TacusciSandbox;

public class TacusciSandboxLauncher {
    public static void main(String[] args)
    {
        LwjglRuntime.start(new TacusciSandbox());
    }
}