package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class SpruceTree extends Entity {

    public SpruceTree(GamePanel gp) {
        super(gp);

        name = "Spruce Tree";
        scallingX = 3;
        scallingY = 3;
        down1 = setup("/objects/trees/spruceTree");
    }

}
