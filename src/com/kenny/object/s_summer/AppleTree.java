package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class AppleTree extends Entity {

    public AppleTree(GamePanel gp) {
        super(gp);

        name = "Apple Tree";
        scallingX = 3;
        scallingY = 3;
        down1 = setup("/objects/trees/appleTree");
    }

}
