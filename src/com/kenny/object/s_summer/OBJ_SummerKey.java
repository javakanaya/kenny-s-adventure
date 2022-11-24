package com.kenny.object.s_summer;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SummerKey extends Entity {

    public OBJ_SummerKey(GamePanel gp) {

        super(gp);

        name = "Summer Key";
        down1 = setup("/objects/keys/summerKey");
        description = "[" + name + "]\nUnlock associated gate";
    }

}
