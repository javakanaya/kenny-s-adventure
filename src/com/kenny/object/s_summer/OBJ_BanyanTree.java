package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_BanyanTree extends Entity {

    public OBJ_BanyanTree(GamePanel gp) {
        super(gp);

        name = "Banyan Tree";
        scallingX = 3;
        scallingY = 3;
        down1 = setup("/objects/trees/banyanTree");
    }

}
