package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class MapleTree extends Entity {

    public MapleTree(GamePanel gp) {
        super(gp);

        name = "Maple Tree";
        scallingX = 3;
        scallingY = 3;
        down1 = setup("/objects/trees/mapleTree");
    }

}
