package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class BonzaiTree extends Entity {

    public BonzaiTree(GamePanel gp) {
        super(gp);

        name = "Bonzai Tree";
        scallingX = 3;
        scallingY = 3;
        down1 = setup("/objects/trees/bonzaiTree");
    }

}
