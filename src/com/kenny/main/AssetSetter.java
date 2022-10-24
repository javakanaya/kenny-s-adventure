package com.kenny.main;

import com.kenny.object.tree.AppleTree;
import com.kenny.object.tree.BanyanTree;
import com.kenny.object.tree.BonzaiTree;
import com.kenny.object.tree.MapleTree;
import com.kenny.object.tree.PineTree;
import com.kenny.object.tree.SpruceTree;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		gp.tree[0] = new PineTree();
		gp.tree[0].worldX = ((34) - 1) *gp.tileSize;
		gp.tree[0].worldY = ((1) - 1) *gp.tileSize;

		gp.tree[0] = new SpruceTree();
		gp.tree[0].worldX = ((37) - 1) *gp.tileSize;
		gp.tree[0].worldY = ((3) - 1) *gp.tileSize;

		gp.tree[2] = new MapleTree();
		gp.tree[2].worldX = ((33) - 1) *gp.tileSize;
		gp.tree[2].worldY = ((4) - 1) *gp.tileSize;

		gp.tree[3] = new BonzaiTree();
		gp.tree[3].worldX = ((35) - 1) *gp.tileSize;
		gp.tree[3].worldY = ((5) - 1) *gp.tileSize;

		gp.tree[4] = new AppleTree();
		gp.tree[4].worldX = ((30) - 1) *gp.tileSize;
		gp.tree[4].worldY = ((5) - 1) *gp.tileSize;

		gp.tree[5] = new BanyanTree();
		gp.tree[5].worldX = ((28) - 1) *gp.tileSize;
		gp.tree[5].worldY = ((6) - 1) *gp.tileSize;

		gp.tree[6] = new PineTree();
		gp.tree[6].worldX = ((30) - 1) *gp.tileSize;
		gp.tree[6].worldY = ((7) - 1) *gp.tileSize;

		gp.tree[7] = new SpruceTree();
		gp.tree[7].worldX = ((33) - 1) *gp.tileSize;
		gp.tree[7].worldY = ((7) - 1) *gp.tileSize;

		gp.tree[8] = new MapleTree();
		gp.tree[8].worldX = ((36) - 1) *gp.tileSize;
		gp.tree[8].worldY = ((7) - 1) *gp.tileSize;

		gp.tree[9] = new BonzaiTree();
		gp.tree[9].worldX = ((28) - 1) *gp.tileSize;
		gp.tree[9].worldY = ((9) - 1) *gp.tileSize;

		gp.tree[10] = new AppleTree();
		gp.tree[10].worldX = ((31) - 1) *gp.tileSize;
		gp.tree[10].worldY = ((9) - 1) *gp.tileSize;
		
		gp.tree[11] = new BanyanTree();
		gp.tree[11].worldX = ((35) - 1) *gp.tileSize;
		gp.tree[11].worldY = ((9) - 1) *gp.tileSize;

		gp.tree[12] = new PineTree();
		gp.tree[12].worldX = ((29) - 1) *gp.tileSize;
		gp.tree[12].worldY = ((11) - 1) *gp.tileSize;

		gp.tree[13] = new SpruceTree();
		gp.tree[13].worldX = ((33) - 1) *gp.tileSize;
		gp.tree[13].worldY = ((11) - 1) *gp.tileSize;

		gp.tree[14] = new MapleTree();
		gp.tree[14].worldX = ((27) - 1) *gp.tileSize;
		gp.tree[14].worldY = ((12) - 1) *gp.tileSize;

		gp.tree[15] = new BonzaiTree();
		gp.tree[15].worldX = ((28) - 1) *gp.tileSize;
		gp.tree[15].worldY = ((14) - 1) *gp.tileSize;

		gp.tree[16] = new AppleTree();
		gp.tree[16].worldX = ((31) - 1) *gp.tileSize;
		gp.tree[16].worldY = ((14) - 1) *gp.tileSize;

		gp.tree[17] = new BanyanTree();
		gp.tree[17].worldX = ((36) - 1) *gp.tileSize;
		gp.tree[17].worldY = ((14) - 1) *gp.tileSize;

		gp.tree[18] = new SpruceTree();
		gp.tree[18].worldX = ((40) - 1) *gp.tileSize;
		gp.tree[18].worldY = ((14) - 1) *gp.tileSize;

		gp.tree[19] = new PineTree();
		gp.tree[19].worldX = ((33) - 1) *gp.tileSize;
		gp.tree[19].worldY = ((15) - 1) *gp.tileSize;

		gp.tree[20] = new SpruceTree();
		gp.tree[20].worldX = ((37) - 1) *gp.tileSize;
		gp.tree[20].worldY = ((15) - 1) *gp.tileSize;

		gp.tree[21] = new MapleTree();
		gp.tree[21].worldX = ((29) - 1) *gp.tileSize;
		gp.tree[21].worldY = ((15) - 1) *gp.tileSize;

		gp.tree[22] = new BonzaiTree();
		gp.tree[22].worldX = ((45) - 1) *gp.tileSize;
		gp.tree[22].worldY = ((15) - 1) *gp.tileSize;

		gp.tree[23] = new AppleTree();
		gp.tree[23].worldX = ((40) - 1) *gp.tileSize;
		gp.tree[23].worldY = ((14) - 1) *gp.tileSize;

		gp.tree[24] = new SpruceTree();
		gp.tree[24].worldX = ((48) - 1) *gp.tileSize;
		gp.tree[24].worldY = ((14) - 1) *gp.tileSize;

		gp.tree[25] = new PineTree();
		gp.tree[25].worldX = ((49) - 1) *gp.tileSize;
		gp.tree[25].worldY = ((15) - 1) *gp.tileSize;
		
		gp.tree[25] = new BanyanTree();
		gp.tree[25].worldX = ((25) - 1) *gp.tileSize;
		gp.tree[25].worldY = ((15) - 1) *gp.tileSize;
		
		gp.tree[26] = new SpruceTree();
		gp.tree[26].worldX = ((29) - 1) *gp.tileSize;
		gp.tree[26].worldY = ((16) - 1) *gp.tileSize;

		gp.tree[27] = new MapleTree();
		gp.tree[27].worldX = ((43) - 1) *gp.tileSize;
		gp.tree[27].worldY = ((16) - 1) *gp.tileSize;

		gp.tree[28] = new BonzaiTree();
		gp.tree[28].worldX = ((27) - 1) *gp.tileSize;
		gp.tree[28].worldY = ((17) - 1) *gp.tileSize;

		gp.tree[29] = new AppleTree();
		gp.tree[29].worldX = ((31) - 1) *gp.tileSize;
		gp.tree[29].worldY = ((17) - 1) *gp.tileSize;

		gp.tree[30] = new BanyanTree();
		gp.tree[30].worldX = ((35) - 1) *gp.tileSize;
		gp.tree[30].worldY = ((17) - 1) *gp.tileSize;

		gp.tree[31] = new PineTree();
		gp.tree[31].worldX = ((39) - 1) *gp.tileSize;
		gp.tree[31].worldY = ((17) - 1) *gp.tileSize;

		gp.tree[32] = new SpruceTree();
		gp.tree[32].worldX = ((47) - 1) *gp.tileSize;
		gp.tree[32].worldY = ((17) - 1) *gp.tileSize;

		gp.tree[33] = new MapleTree();
		gp.tree[33].worldX = ((28) - 1) *gp.tileSize;
		gp.tree[33].worldY = ((18) - 1) *gp.tileSize;

		gp.tree[34] = new BonzaiTree();
		gp.tree[34].worldX = ((37) - 1) *gp.tileSize;
		gp.tree[34].worldY = ((18) - 1) *gp.tileSize;

		gp.tree[35] = new AppleTree();
		gp.tree[35].worldX = ((48) - 1) *gp.tileSize;
		gp.tree[35].worldY = ((18) - 1) *gp.tileSize;

		gp.tree[36] = new BanyanTree();
		gp.tree[36].worldX = ((30) - 1) *gp.tileSize;
		gp.tree[36].worldY = ((19) - 1) *gp.tileSize;

		gp.tree[37] = new PineTree();
		gp.tree[37].worldX = ((34) - 1) *gp.tileSize;
		gp.tree[37].worldY = ((19) - 1) *gp.tileSize;

		gp.tree[38] = new SpruceTree();
		gp.tree[38].worldX = ((42) - 1) *gp.tileSize;
		gp.tree[38].worldY = ((19) - 1) *gp.tileSize;

		gp.tree[39] = new MapleTree();
		gp.tree[39].worldX = ((45) - 1) *gp.tileSize;
		gp.tree[39].worldY = ((19) - 1) *gp.tileSize;

		gp.tree[40] = new BonzaiTree();
		gp.tree[40].worldX = ((40) - 1) *gp.tileSize;
		gp.tree[40].worldY = ((20) - 1) *gp.tileSize;

		gp.tree[41] = new AppleTree();
		gp.tree[41].worldX = ((43) - 1) *gp.tileSize;
		gp.tree[41].worldY = ((20) - 1) *gp.tileSize;

		gp.tree[42] = new BanyanTree();
		gp.tree[42].worldX = ((32) - 1) *gp.tileSize;
		gp.tree[42].worldY = ((21) - 1) *gp.tileSize;

		gp.tree[43] = new PineTree();
		gp.tree[43].worldX = ((34) - 1) *gp.tileSize;
		gp.tree[43].worldY = ((21) - 1) *gp.tileSize;

		gp.tree[44] = new SpruceTree();
		gp.tree[44].worldX = ((45) - 1) *gp.tileSize;
		gp.tree[44].worldY = ((21) - 1) *gp.tileSize;

		gp.tree[45] = new MapleTree();
		gp.tree[45].worldX = ((41) - 1) *gp.tileSize;
		gp.tree[45].worldY = ((22) - 1) *gp.tileSize;

		gp.tree[46] = new BonzaiTree();
		gp.tree[46].worldX = ((44) - 1) *gp.tileSize;
		gp.tree[46].worldY = ((22) - 1) *gp.tileSize;

		gp.tree[47] = new AppleTree();
		gp.tree[47].worldX = ((31) - 1) *gp.tileSize;
		gp.tree[47].worldY = ((23) - 1) *gp.tileSize;

//		gp.tree[48] = new BanyanTree();
//		gp.tree[48].worldX = ((33) - 1) *gp.tileSize;
//		gp.tree[48].worldY = ((23) - 1) *gp.tileSize;

		gp.tree[49] = new PineTree();
		gp.tree[49].worldX = ((42) - 1) *gp.tileSize;
		gp.tree[49].worldY = ((24) - 1) *gp.tileSize;

		gp.tree[50] = new SpruceTree();
		gp.tree[50].worldX = ((45) - 1) *gp.tileSize;
		gp.tree[50].worldY = ((25) - 1) *gp.tileSize;

		gp.tree[51] = new MapleTree();
		gp.tree[51].worldX = ((43) - 1) *gp.tileSize;
		gp.tree[51].worldY = ((26) - 1) *gp.tileSize;

//		gp.tree[52] = new BonzaiTree();
//		gp.tree[52].worldX = (() - 1) *gp.tileSize;
//		gp.tree[52].worldY = (() - 1) *gp.tileSize;
//
//		gp.tree[53] = new AppleTree();
//		gp.tree[53].worldX = (() - 1) *gp.tileSize;
//		gp.tree[53].worldY = (() - 1) *gp.tileSize;
//
//		gp.tree[54] = new BanyanTree();
//		gp.tree[54].worldX = (() - 1) *gp.tileSize;
//		gp.tree[54].worldY = (() - 1) *gp.tileSize;
//
//		gp.tree[55] = new PineTree();
//		gp.tree[55].worldX = (() - 1) *gp.tileSize;
//		gp.tree[55].worldY = (() - 1) *gp.tileSize;
		
		
	}
}
