package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_PineTree extends Entity {

    public OBJ_PineTree(GamePanel gp) {
        super(gp);

        name = "Pine Tree";
        scallingX = 3;
        scallingY = 3;
        down1 = setup("/objects/trees/pineTree");
    }

}
