package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class PineTree extends Entity {

    public PineTree(GamePanel gp) {
        super(gp);

        name = "Pine Tree";
        scallingX = 3;
        scallingY = 3;
        down1 = setup("/objects/trees/pineTree");
    }

}
