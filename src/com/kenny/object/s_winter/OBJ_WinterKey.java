package com.kenny.object.s_winter;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_WinterKey extends Entity {

    public OBJ_WinterKey(GamePanel gp) {
        super(gp);

        name = "Winter Key";
        down1 = setup("/objects/keys/winterKey");
        description = "[" + name + "]\nUnlock associated gate";
    }

}
