package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_IcePillarOff extends Entity {

    GamePanel gp;

    public OBJ_IcePillarOff(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Ice Pillar Off";
        type = type_winterPillarOff;
        scallingX = 2;
        scallingY = 4;
        down1 = setup("/objects/others/icePillar_2");
        collision = true;
        setSolidArea(30, 35, 30, 100);
    }

    public void interact(int i) {

        gp.obj[i] = null;
        gp.ui.showMessage("Pillar On!");
        gp.playSfx(8);
    }
}
