package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_IcePillarOn extends Entity {

    public OBJ_IcePillarOn(GamePanel gp) {
        super(gp);

        name = "Ice Pillar On";
        type = type_winterPillarOn;
        scallingX = 2;
        scallingY = 4;
        down1 = setup("/objects/others/icePillar_1");
        collision = true;
        setSolidArea(48, 0, 20, 100);
    }
}
