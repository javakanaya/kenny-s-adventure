package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class WinterPineTree extends Entity {

    public WinterPineTree(GamePanel gp) {
        super(gp);

        name = "Pine Tree";
        scallingX = 4;
        scallingY = 4;
        down1 = setup("/objects/trees/winterPine");
    }

}
