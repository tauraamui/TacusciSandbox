package co.uk.tauraamui.TacusciSandbox.desktop;

import co.uk.tauraamui.TacusciSandbox.TacusciSandbox;
import com.shc.silenceengine.backend.lwjgl.LwjglRuntime;

public class TacusciSandboxLauncher {
    public static void main(String[] args)
    {
        LwjglRuntime.start(new TacusciSandbox());
    }
}