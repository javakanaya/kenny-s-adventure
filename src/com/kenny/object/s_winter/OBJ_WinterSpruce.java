package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_WinterSpruce extends Entity {

    public OBJ_WinterSpruce(GamePanel gp) {
        super(gp);

        name = "Spruce Tree";
        scallingX = 4;
        scallingY = 4;
        down1 = setup("/objects/trees/winterSpruce");
    }

}
