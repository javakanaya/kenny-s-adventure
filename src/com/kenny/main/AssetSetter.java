package com.kenny.main;

import com.kenny.object.gatekey.AutumnGate;
import com.kenny.object.gatekey.AutumnKey;
import com.kenny.object.gatekey.Bone;
import com.kenny.object.gatekey.SpringGate;
import com.kenny.object.gatekey.SpringKey;
import com.kenny.object.gatekey.SummerGate;
import com.kenny.object.gatekey.SummerKey;
import com.kenny.object.gatekey.WinterGate;
import com.kenny.object.gatekey.WinterKey;
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
		

		gp.tree[0] = new SpruceTree();
		gp.tree[0].worldX = (((7)-2) - 1) *gp.tileSize;
		gp.tree[0].worldY = (((29)-3) - 1) *gp.tileSize;
		
		gp.tree[1] = new MapleTree();
		gp.tree[1].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[1].worldY = (((29)-3) - 1) *gp.tileSize;
		
		gp.tree[2] = new BonzaiTree();
		gp.tree[2].worldX = (((9)-2) - 1) *gp.tileSize;
		gp.tree[2].worldY = (((30)-3) - 1) *gp.tileSize;
		
		gp.tree[3] = new AppleTree();
		gp.tree[3].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[3].worldY = (((30)-3) - 1) *gp.tileSize;
		
		gp.tree[4] = new BanyanTree();
		gp.tree[4].worldX = (((6)-2) - 1) *gp.tileSize;
		gp.tree[4].worldY = (((31)-3) - 1) *gp.tileSize;
		
		gp.tree[5] = new PineTree();
		gp.tree[5].worldX = (((8)-2) - 1) *gp.tileSize;
		gp.tree[5].worldY = (((31)-3) - 1) *gp.tileSize;
		
		gp.tree[6] = new SpruceTree();
		gp.tree[6].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[6].worldY = (((31)-3) - 1) *gp.tileSize;
		
		gp.tree[7] = new MapleTree();
		gp.tree[7].worldX = (((14)-2) - 1) *gp.tileSize;
		gp.tree[7].worldY = (((31)-3) - 1) *gp.tileSize;
		
		gp.tree[8] = new BonzaiTree();
		gp.tree[8].worldX = (((4)-2) - 1) *gp.tileSize;
		gp.tree[8].worldY = (((32)-3) - 1) *gp.tileSize;
		
		gp.tree[9] = new AppleTree();
		gp.tree[9].worldX = (((5)-2) - 1) *gp.tileSize;
		gp.tree[9].worldY = (((32)-3) - 1) *gp.tileSize;
		
		gp.tree[10] = new BanyanTree();
		gp.tree[10].worldX = (((7)-2) - 1) *gp.tileSize;
		gp.tree[10].worldY = (((32)-3) - 1) *gp.tileSize;
		
		gp.tree[11] = new PineTree();
		gp.tree[11].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[11].worldY = (((32)-3) - 1) *gp.tileSize;
		
		gp.tree[12] = new SpruceTree();
		gp.tree[12].worldX = (((3)-2) - 1) *gp.tileSize;
		gp.tree[12].worldY = (((33)-3) - 1) *gp.tileSize;
		
		gp.tree[13] = new MapleTree();
		gp.tree[13].worldX = (((8)-2) - 1) *gp.tileSize;
		gp.tree[13].worldY = (((33)-3) - 1) *gp.tileSize;
		
		gp.tree[14] = new BonzaiTree();
		gp.tree[14].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[14].worldY = (((33)-3) - 1) *gp.tileSize;
		
		gp.tree[15] = new AppleTree();
		gp.tree[15].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[15].worldY = (((33)-3) - 1) *gp.tileSize;
		
		gp.tree[16] = new BanyanTree();
		gp.tree[16].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[16].worldY = (((33)-3) - 1) *gp.tileSize;
		
		gp.tree[17] = new PineTree();
		gp.tree[17].worldX = (((4)-2) - 1) *gp.tileSize;
		gp.tree[17].worldY = (((34)-3) - 1) *gp.tileSize;
		
		gp.tree[18] = new SpruceTree();
		gp.tree[18].worldX = (((6)-2) - 1) *gp.tileSize;
		gp.tree[18].worldY = (((34)-3) - 1) *gp.tileSize;
		
		gp.tree[19] = new MapleTree();
		gp.tree[19].worldX = (((8)-2) - 1) *gp.tileSize;
		gp.tree[19].worldY = (((34)-3) - 1) *gp.tileSize;
		
		gp.tree[20] = new BonzaiTree();
		gp.tree[20].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[20].worldY = (((34)-3) - 1) *gp.tileSize;
		
		gp.tree[21] = new AppleTree();
		gp.tree[21].worldX = (((3)-2) - 1) *gp.tileSize;
		gp.tree[21].worldY = (((35)-3) - 1) *gp.tileSize;
		
		gp.tree[22] = new BanyanTree();
		gp.tree[22].worldX = (((9)-2) - 1) *gp.tileSize;
		gp.tree[22].worldY = (((35)-3) - 1) *gp.tileSize;
		
		gp.tree[23] = new PineTree();
		gp.tree[23].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[23].worldY = (((35)-3) - 1) *gp.tileSize;
		
		gp.tree[24] = new SpruceTree();
		gp.tree[24].worldX = (((1)-2) - 1) *gp.tileSize;
		gp.tree[24].worldY = (((36)-3) - 1) *gp.tileSize;
		
		gp.tree[25] = new MapleTree();
		gp.tree[25].worldX = (((5)-2) - 1) *gp.tileSize;
		gp.tree[25].worldY = (((36)-3) - 1) *gp.tileSize;
		
		gp.tree[26] = new BonzaiTree();
		gp.tree[26].worldX = (((7)-2) - 1) *gp.tileSize;
		gp.tree[26].worldY = (((36)-3) - 1) *gp.tileSize;
		
		gp.tree[27] = new AppleTree();
		gp.tree[27].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[27].worldY = (((36)-3) - 1) *gp.tileSize;
		
		gp.tree[28] = new BanyanTree();
		gp.tree[28].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[28].worldY = (((36)-3) - 1) *gp.tileSize;
		
		gp.tree[29] = new PineTree();
		gp.tree[29].worldX = (((3)-2) - 1) *gp.tileSize;
		gp.tree[29].worldY = (((37)-3) - 1) *gp.tileSize;
		
		gp.tree[30] = new SpruceTree();
		gp.tree[30].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[30].worldY = (((37)-3) - 1) *gp.tileSize;
		
		gp.tree[31] = new MapleTree();
		gp.tree[31].worldX = (((2)-2) - 1) *gp.tileSize;
		gp.tree[31].worldY = (((38)-3) - 1) *gp.tileSize;
		
		gp.tree[32] = new BonzaiTree();
		gp.tree[32].worldX = (((7)-2) - 1) *gp.tileSize;
		gp.tree[32].worldY = (((38)-3) - 1) *gp.tileSize;
		
		gp.tree[33] = new AppleTree();
		gp.tree[33].worldX = (((9)-2) - 1) *gp.tileSize;
		gp.tree[33].worldY = (((38)-3) - 1) *gp.tileSize;
		
		gp.tree[34] = new BanyanTree();
		gp.tree[34].worldX = (((1)-2) - 1) *gp.tileSize;
		gp.tree[34].worldY = (((39)-3) - 1) *gp.tileSize;
		
		gp.tree[35] = new PineTree();
		gp.tree[35].worldX = (((4)-2) - 1) *gp.tileSize;
		gp.tree[35].worldY = (((39)-3) - 1) *gp.tileSize;
		
		gp.tree[36] = new SpruceTree();
		gp.tree[36].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[36].worldY = (((39)-3) - 1) *gp.tileSize;
		
		gp.tree[37] = new MapleTree();
		gp.tree[37].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[37].worldY = (((39)-3) - 1) *gp.tileSize;
		
		gp.tree[38] = new BonzaiTree();
		gp.tree[38].worldX = (((6)-2) - 1) *gp.tileSize;
		gp.tree[38].worldY = (((40)-3) - 1) *gp.tileSize;
		
		gp.tree[39] = new AppleTree();
		gp.tree[39].worldX = (((2)-2) - 1) *gp.tileSize;
		gp.tree[39].worldY = (((41)-3) - 1) *gp.tileSize;
		
		gp.tree[40] = new BanyanTree();
		gp.tree[40].worldX = (((4)-2) - 1) *gp.tileSize;
		gp.tree[40].worldY = (((41)-3) - 1) *gp.tileSize;
		
		gp.tree[41] = new PineTree();
		gp.tree[41].worldX = (((17)-2) - 1) *gp.tileSize;
		gp.tree[41].worldY = (((41)-3) - 1) *gp.tileSize;
		
		gp.tree[42] = new SpruceTree();
		gp.tree[42].worldX = (((19)-2) - 1) *gp.tileSize;
		gp.tree[42].worldY = (((41)-3) - 1) *gp.tileSize;
		
		gp.tree[43] = new MapleTree();
		gp.tree[43].worldX = (((1)-2) - 1) *gp.tileSize;
		gp.tree[43].worldY = (((43)-3) - 1) *gp.tileSize;
		
		gp.tree[44] = new BonzaiTree();
		gp.tree[44].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[44].worldY = (((42)-3) - 1) *gp.tileSize;
		
		gp.tree[45] = new AppleTree();
		gp.tree[45].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[45].worldY = (((42)-3) - 1) *gp.tileSize;
		
		gp.tree[46] = new BanyanTree();
		gp.tree[46].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[46].worldY = (((42)-3) - 1) *gp.tileSize;
		
		gp.tree[47] = new PineTree();
		gp.tree[47].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[47].worldY = (((43)-3) - 1) *gp.tileSize;
		
		gp.tree[48] = new SpruceTree();
		gp.tree[48].worldX = (((16)-2) - 1) *gp.tileSize;
		gp.tree[48].worldY = (((43)-3) - 1) *gp.tileSize;
		
		gp.tree[49] = new MapleTree();
		gp.tree[49].worldX = (((18)-2) - 1) *gp.tileSize;
		gp.tree[49].worldY = (((43)-3) - 1) *gp.tileSize;
		
		gp.tree[50] = new BonzaiTree();
		gp.tree[50].worldX = (((20)-2) - 1) *gp.tileSize;
		gp.tree[50].worldY = (((42)-3) - 1) *gp.tileSize;
		
		gp.tree[51] = new AppleTree();
		gp.tree[51].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[51].worldY = (((44)-3) - 1) *gp.tileSize;
		
		gp.tree[52] = new BanyanTree();
		gp.tree[52].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[52].worldY = (((44)-3) - 1) *gp.tileSize;
		
		gp.tree[53] = new PineTree();
		gp.tree[53].worldX = (((20)-2) - 1) *gp.tileSize;
		gp.tree[53].worldY = (((45)-3) - 1) *gp.tileSize;
		
		//right down//
		
		gp.tree[54] = new MapleTree();
		gp.tree[54].worldX = (((38)-2) - 1) *gp.tileSize;
		gp.tree[54].worldY = (((26)-3) - 1) *gp.tileSize;
		
		gp.tree[55] = new SpruceTree();
		gp.tree[55].worldX = (((37)-2) - 1) *gp.tileSize;
		gp.tree[55].worldY = (((28)-3) - 1) *gp.tileSize;

		gp.tree[56] = new MapleTree();
		gp.tree[56].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[56].worldY = (((29)-3) - 1) *gp.tileSize;

		gp.tree[57] = new BonzaiTree();
		gp.tree[57].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[57].worldY = (((30)-3) - 1) *gp.tileSize;

		gp.tree[58] = new AppleTree();
		gp.tree[58].worldX = (((37)-2) - 1) *gp.tileSize;
		gp.tree[58].worldY = (((30)-3) - 1) *gp.tileSize;
//
		gp.tree[59] = new SpruceTree();
		gp.tree[59].worldX = (((39)-2) - 1) *gp.tileSize;
		gp.tree[59].worldY = (((30)-3) - 1) *gp.tileSize;

		gp.tree[60] = new MapleTree();
		gp.tree[60].worldX = (((32)-2) - 1) *gp.tileSize;
		gp.tree[60].worldY = (((32)-3) - 1) *gp.tileSize;

		gp.tree[61] = new BonzaiTree();
		gp.tree[61].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[61].worldY = (((32)-3) - 1) *gp.tileSize;

		gp.tree[62] = new AppleTree();
		gp.tree[62].worldX = (((39)-2) - 1) *gp.tileSize;
		gp.tree[62].worldY = (((32)-3) - 1) *gp.tileSize;

		gp.tree[63] = new BanyanTree();
		gp.tree[63].worldX = (((30)-2) - 1) *gp.tileSize;
		gp.tree[63].worldY = (((34)-3) - 1) *gp.tileSize;

		gp.tree[64] = new PineTree();
		gp.tree[64].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[64].worldY = (((34)-3) - 1) *gp.tileSize;

		gp.tree[65] = new SpruceTree();
		gp.tree[65].worldX = (((37)-2) - 1) *gp.tileSize;
		gp.tree[65].worldY = (((34)-3) - 1) *gp.tileSize;

		gp.tree[66] = new MapleTree();
		gp.tree[66].worldX = (((40)-2) - 1) *gp.tileSize;
		gp.tree[66].worldY = (((34)-3) - 1) *gp.tileSize;

		gp.tree[67] = new BonzaiTree();
		gp.tree[67].worldX = (((47)-2) - 1) *gp.tileSize;
		gp.tree[67].worldY = (((32)-3) - 1) *gp.tileSize;

		gp.tree[68] = new AppleTree();
		gp.tree[68].worldX = (((42)-2) - 1) *gp.tileSize;
		gp.tree[68].worldY = (((33)-3) - 1) *gp.tileSize;

		gp.tree[69] = new BanyanTree();
		gp.tree[69].worldX = (((46)-2) - 1) *gp.tileSize;
		gp.tree[69].worldY = (((33)-3) - 1) *gp.tileSize;

		gp.tree[70] = new PineTree();
		gp.tree[70].worldX = (((43)-2) - 1) *gp.tileSize;
		gp.tree[70].worldY = (((34)-3) - 1) *gp.tileSize;

		gp.tree[71] = new SpruceTree();
		gp.tree[71].worldX = (((45)-2) - 1) *gp.tileSize;
		gp.tree[71].worldY = (((34)-3) - 1) *gp.tileSize;

		gp.tree[72] = new MapleTree();
		gp.tree[72].worldX = (((28)-2) - 1) *gp.tileSize;
		gp.tree[72].worldY = (((35)-3) - 1) *gp.tileSize;

		gp.tree[73] = new BonzaiTree();
		gp.tree[73].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[73].worldY = (((35)-3) - 1) *gp.tileSize;

		gp.tree[74] = new AppleTree();
		gp.tree[74].worldX = (((38)-2) - 1) *gp.tileSize;
		gp.tree[74].worldY = (((35)-3) - 1) *gp.tileSize;

		gp.tree[75] = new BanyanTree();
		gp.tree[75].worldX = (((48)-2) - 1) *gp.tileSize;
		gp.tree[75].worldY = (((35)-3) - 1) *gp.tileSize;

		gp.tree[76] = new PineTree();
		gp.tree[76].worldX = (((25)-2) - 1) *gp.tileSize;
		gp.tree[76].worldY = (((36)-3) - 1) *gp.tileSize;

		gp.tree[77] = new SpruceTree();
		gp.tree[77].worldX = (((29)-2) - 1) *gp.tileSize;
		gp.tree[77].worldY = (((36)-3) - 1) *gp.tileSize;

		gp.tree[78] = new MapleTree();
		gp.tree[78].worldX = (((31)-2) - 1) *gp.tileSize;
		gp.tree[78].worldY = (((36)-3) - 1) *gp.tileSize;

		gp.tree[79] = new BonzaiTree();
		gp.tree[79].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[79].worldY = (((36)-3) - 1) *gp.tileSize;

		gp.tree[80] = new AppleTree();
		gp.tree[80].worldX = (((46)-2) - 1) *gp.tileSize;
		gp.tree[80].worldY = (((36)-3) - 1) *gp.tileSize;

		gp.tree[81] = new BanyanTree();
		gp.tree[81].worldX = (((34)-2) - 1) *gp.tileSize;
		gp.tree[81].worldY = (((37)-3) - 1) *gp.tileSize;

		gp.tree[82] = new PineTree();
		gp.tree[82].worldX = (((39)-2) - 1) *gp.tileSize;
		gp.tree[82].worldY = (((37)-3) - 1) *gp.tileSize;

		gp.tree[83] = new SpruceTree();
		gp.tree[83].worldX = (((41)-2) - 1) *gp.tileSize;
		gp.tree[83].worldY = (((37)-3) - 1) *gp.tileSize;

		gp.tree[84] = new MapleTree();
		gp.tree[84].worldX = (((44)-2) - 1) *gp.tileSize;
		gp.tree[84].worldY = (((37)-3) - 1) *gp.tileSize;

		gp.tree[85] = new BonzaiTree();
		gp.tree[85].worldX = (((47)-2) - 1) *gp.tileSize;
		gp.tree[85].worldY = (((37)-3) - 1) *gp.tileSize;

		gp.tree[86] = new AppleTree();
		gp.tree[86].worldX = (((49)-2) - 1) *gp.tileSize;
		gp.tree[86].worldY = (((37)-3) - 1) *gp.tileSize;

		gp.tree[87] = new BanyanTree();
		gp.tree[87].worldX = (((26)-2) - 1) *gp.tileSize;
		gp.tree[87].worldY = (((38)-3) - 1) *gp.tileSize;

		gp.tree[88] = new PineTree();
		gp.tree[88].worldX = (((28)-2) - 1) *gp.tileSize;
		gp.tree[88].worldY = (((38)-3) - 1) *gp.tileSize;

		gp.tree[89] = new SpruceTree();
		gp.tree[89].worldX = (((31)-2) - 1) *gp.tileSize;
		gp.tree[89].worldY = (((38)-3) - 1) *gp.tileSize;

		gp.tree[90] = new MapleTree();
		gp.tree[90].worldX = (((37)-2) - 1) *gp.tileSize;
		gp.tree[90].worldY = (((38)-3) - 1) *gp.tileSize;

		gp.tree[91] = new BonzaiTree();
		gp.tree[91].worldX = (((40)-2) - 1) *gp.tileSize;
		gp.tree[91].worldY = (((38)-3) - 1) *gp.tileSize;

		gp.tree[92] = new AppleTree();
		gp.tree[92].worldX = (((45)-2) - 1) *gp.tileSize;
		gp.tree[92].worldY = (((38)-3) - 1) *gp.tileSize;

		gp.tree[93] = new BanyanTree();
		gp.tree[93].worldX = (((26)-2) - 1) *gp.tileSize;
		gp.tree[93].worldY = (((41)-3) - 1) *gp.tileSize;

		gp.tree[94] = new PineTree();
		gp.tree[94].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[94].worldY = (((39)-3) - 1) *gp.tileSize;

		gp.tree[95] = new SpruceTree();
		gp.tree[95].worldX = (((34)-2) - 1) *gp.tileSize;
		gp.tree[95].worldY = (((39)-3) - 1) *gp.tileSize;

		gp.tree[96] = new MapleTree();
		gp.tree[96].worldX = (((46)-2) - 1) *gp.tileSize;
		gp.tree[96].worldY = (((39)-3) - 1) *gp.tileSize;

		gp.tree[97] = new BonzaiTree();
		gp.tree[97].worldX = (((48)-2) - 1) *gp.tileSize;
		gp.tree[97].worldY = (((39)-3) - 1) *gp.tileSize;

		gp.tree[98] = new AppleTree();
		gp.tree[98].worldX = (((30)-2) - 1) *gp.tileSize;
		gp.tree[98].worldY = (((40)-3) - 1) *gp.tileSize;

		gp.tree[99] = new BanyanTree();
		gp.tree[99].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[99].worldY = (((40)-3) - 1) *gp.tileSize;

		gp.tree[100] = new PineTree();
		gp.tree[100].worldX = (((38)-2) - 1) *gp.tileSize;
		gp.tree[100].worldY = (((40)-3) - 1) *gp.tileSize;
		
		gp.tree[101] = new SpruceTree();
		gp.tree[101].worldX = (((28)-2) - 1) *gp.tileSize;
		gp.tree[101].worldY = (((41)-3) - 1) *gp.tileSize;

		gp.tree[102] = new MapleTree();
		gp.tree[102].worldX = (((31)-2) - 1) *gp.tileSize;
		gp.tree[102].worldY = (((41)-3) - 1) *gp.tileSize;

		gp.tree[103] = new BonzaiTree();
		gp.tree[103].worldX = (((29)-2) - 1) *gp.tileSize;
		gp.tree[103].worldY = (((43)-3) - 1) *gp.tileSize;

		gp.tree[104] = new AppleTree();
		gp.tree[104].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[104].worldY = (((44)-3) - 1) *gp.tileSize;

		gp.tree[105] = new BanyanTree();
		gp.tree[105].worldX = (((31)-2) - 1) *gp.tileSize;
		gp.tree[105].worldY = (((45)-3) - 1) *gp.tileSize;

		gp.tree[106] = new PineTree();
		gp.tree[106].worldX = (((29)-2) - 1) *gp.tileSize;
		gp.tree[106].worldY = (((46)-3) - 1) *gp.tileSize;

		gp.tree[107] = new SpruceTree();
		gp.tree[107].worldX = (((32)-2) - 1) *gp.tileSize;
		gp.tree[107].worldY = (((47)-3) - 1) *gp.tileSize;

		gp.tree[108] = new MapleTree();
		gp.tree[108].worldX = (((27)-2) - 1) *gp.tileSize;
		gp.tree[108].worldY = (((48)-3) - 1) *gp.tileSize;

		gp.tree[109] = new BonzaiTree();
		gp.tree[109].worldX = (((30)-2) - 1) *gp.tileSize;
		gp.tree[109].worldY = (((48)-3) - 1) *gp.tileSize;

		gp.tree[110] = new AppleTree();
		gp.tree[110].worldX = (((34)-2) - 1) *gp.tileSize;
		gp.tree[110].worldY = (((42)-3) - 1) *gp.tileSize;

		gp.tree[111] = new BanyanTree();
		gp.tree[111].worldX = (((37)-2) - 1) *gp.tileSize;
		gp.tree[111].worldY = (((43)-3) - 1) *gp.tileSize;

		gp.tree[112] = new PineTree();
		gp.tree[112].worldX = (((36)-2) - 1) *gp.tileSize;
		gp.tree[112].worldY = (((44)-3) - 1) *gp.tileSize;

		gp.tree[113] = new SpruceTree();
		gp.tree[113].worldX = (((38)-2) - 1) *gp.tileSize;
		gp.tree[113].worldY = (((45)-3) - 1) *gp.tileSize;

		gp.tree[114] = new MapleTree();
		gp.tree[114].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[114].worldY = (((46)-3) - 1) *gp.tileSize;

		gp.tree[115] = new BonzaiTree();
		gp.tree[115].worldX = (((40)-2) - 1) *gp.tileSize;
		gp.tree[115].worldY = (((46)-3) - 1) *gp.tileSize;

		gp.tree[116] = new AppleTree();
		gp.tree[116].worldX = (((38)-2) - 1) *gp.tileSize;
		gp.tree[116].worldY = (((47)-3) - 1) *gp.tileSize;

		gp.tree[117] = new BanyanTree();
		gp.tree[117].worldX = (((34)-2) - 1) *gp.tileSize;
		gp.tree[117].worldY = (((48)-3) - 1) *gp.tileSize;

		gp.tree[118] = new PineTree();
		gp.tree[118].worldX = (((36)-2) - 1) *gp.tileSize;
		gp.tree[118].worldY = (((48)-3) - 1) *gp.tileSize;

		gp.tree[119] = new SpruceTree();
		gp.tree[119].worldX = (((40)-2) - 1) *gp.tileSize;
		gp.tree[119].worldY = (((48)-3) - 1) *gp.tileSize;

		gp.tree[120] = new MapleTree();
		gp.tree[120].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[120].worldY = (((50)-3) - 1) *gp.tileSize;

		gp.tree[121] = new BonzaiTree();
		gp.tree[121].worldX = (((37)-2) - 1) *gp.tileSize;
		gp.tree[121].worldY = (((50)-3) - 1) *gp.tileSize;

		gp.tree[122] = new AppleTree();
		gp.tree[122].worldX = (((39)-2) - 1) *gp.tileSize;
		gp.tree[122].worldY = (((50)-3) - 1) *gp.tileSize;

		gp.tree[123] = new BanyanTree();
		gp.tree[123].worldX = (((40)-2) - 1) *gp.tileSize;
		gp.tree[123].worldY = (((44)-3) - 1) *gp.tileSize;

		gp.tree[124] = new PineTree();
		gp.tree[124].worldX = (((42)-2) - 1) *gp.tileSize;
		gp.tree[124].worldY = (((46)-3) - 1) *gp.tileSize;

		gp.tree[125] = new SpruceTree();
		gp.tree[125].worldX = (((42)-2) - 1) *gp.tileSize;
		gp.tree[125].worldY = (((48)-3) - 1) *gp.tileSize;

		gp.tree[126] = new MapleTree();
		gp.tree[126].worldX = (((41)-2) - 1) *gp.tileSize;
		gp.tree[126].worldY = (((49)-3) - 1) *gp.tileSize;

		gp.tree[127] = new BonzaiTree();
		gp.tree[127].worldX = (((42)-2) - 1) *gp.tileSize;
		gp.tree[127].worldY = (((50)-3) - 1) *gp.tileSize;
		
		//right up//

		gp.tree[128] = new AppleTree();
		gp.tree[128].worldX = (((34)-2) - 1) *gp.tileSize;
		gp.tree[128].worldY = (((1)-3) - 1) *gp.tileSize;

		gp.tree[129] = new BanyanTree();
		gp.tree[129].worldX = (((40)-2) - 1) *gp.tileSize;
		gp.tree[129].worldY = (((1)-3) - 1) *gp.tileSize;

		gp.tree[130] = new PineTree();
		gp.tree[130].worldX = (((36)-2) - 1) *gp.tileSize;
		gp.tree[130].worldY = (((2)-3) - 1) *gp.tileSize;

		gp.tree[131] = new SpruceTree();
		gp.tree[131].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[131].worldY = (((3)-3) - 1) *gp.tileSize;

		gp.tree[132] = new MapleTree();
		gp.tree[132].worldX = (((38)-2) - 1) *gp.tileSize;
		gp.tree[132].worldY = (((3)-3) - 1) *gp.tileSize;

		gp.tree[133] = new BonzaiTree();
		gp.tree[133].worldX = (((27)-2) - 1) *gp.tileSize;
		gp.tree[133].worldY = (((4)-3) - 1) *gp.tileSize;

		gp.tree[134] = new AppleTree();
		gp.tree[134].worldX = (((30)-2) - 1) *gp.tileSize;
		gp.tree[134].worldY = (((4)-3) - 1) *gp.tileSize;

		gp.tree[135] = new BanyanTree();
		gp.tree[135].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[135].worldY = (((4)-3) - 1) *gp.tileSize;

		gp.tree[136] = new PineTree();
		gp.tree[136].worldX = (((40)-2) - 1) *gp.tileSize;
		gp.tree[136].worldY = (((4)-3) - 1) *gp.tileSize;

		gp.tree[137] = new SpruceTree();
		gp.tree[137].worldX = (((28)-2) - 1) *gp.tileSize;
		gp.tree[137].worldY = (((6)-3) - 1) *gp.tileSize;

		gp.tree[138] = new MapleTree();
		gp.tree[138].worldX = (((32)-2) - 1) *gp.tileSize;
		gp.tree[138].worldY = (((6)-3) - 1) *gp.tileSize;

		gp.tree[139] = new BonzaiTree();
		gp.tree[139].worldX = (((38)-2) - 1) *gp.tileSize;
		gp.tree[139].worldY = (((5)-3) - 1) *gp.tileSize;

		gp.tree[140] = new AppleTree();
		gp.tree[140].worldX = (((34)-2) - 1) *gp.tileSize;
		gp.tree[140].worldY = (((6)-3) - 1) *gp.tileSize;

		gp.tree[141] = new BanyanTree();
		gp.tree[141].worldX = (((30)-2) - 1) *gp.tileSize;
		gp.tree[141].worldY = (((7)-3) - 1) *gp.tileSize;

		gp.tree[142] = new PineTree();
		gp.tree[142].worldX = (((36)-2) - 1) *gp.tileSize;
		gp.tree[142].worldY = (((7)-3) - 1) *gp.tileSize;

		gp.tree[143] = new SpruceTree();
		gp.tree[143].worldX = (((39)-2) - 1) *gp.tileSize;
		gp.tree[143].worldY = (((7)-3) - 1) *gp.tileSize;

		gp.tree[144] = new MapleTree();
		gp.tree[144].worldX = (((27)-2) - 1) *gp.tileSize;
		gp.tree[144].worldY = (((8)-3) - 1) *gp.tileSize;

		gp.tree[145] = new BonzaiTree();
		gp.tree[145].worldX = (((29)-2) - 1) *gp.tileSize;
		gp.tree[145].worldY = (((9)-3) - 1) *gp.tileSize;

		gp.tree[146] = new AppleTree();
		gp.tree[146].worldX = (((32)-2) - 1) *gp.tileSize;
		gp.tree[146].worldY = (((9)-3) - 1) *gp.tileSize;

		gp.tree[147] = new BanyanTree();
		gp.tree[147].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[147].worldY = (((9)-3) - 1) *gp.tileSize;

		gp.tree[148] = new PineTree();
		gp.tree[148].worldX = (((38)-2) - 1) *gp.tileSize;
		gp.tree[148].worldY = (((9)-3) - 1) *gp.tileSize;

		gp.tree[149] = new SpruceTree();
		gp.tree[149].worldX = (((28)-2) - 1) *gp.tileSize;
		gp.tree[149].worldY = (((11)-3) - 1) *gp.tileSize;

		gp.tree[150] = new MapleTree();
		gp.tree[150].worldX = (((30)-2) - 1) *gp.tileSize;
		gp.tree[150].worldY = (((11)-3) - 1) *gp.tileSize;

		gp.tree[151] = new BonzaiTree();
		gp.tree[151].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[151].worldY = (((11)-3) - 1) *gp.tileSize;

		gp.tree[152] = new AppleTree();
		gp.tree[152].worldX = (((29)-2) - 1) *gp.tileSize;
		gp.tree[152].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[153] = new BanyanTree();
		gp.tree[153].worldX = (((31)-2) - 1) *gp.tileSize;
		gp.tree[153].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[154] = new PineTree();
		gp.tree[154].worldX = (((41)-2) - 1) *gp.tileSize;
		gp.tree[154].worldY = (((12)-3) - 1) *gp.tileSize;
		
		gp.tree[155] = new SpruceTree();
		gp.tree[155].worldX = (((36)-2) - 1) *gp.tileSize;
		gp.tree[155].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[156] = new MapleTree();
		gp.tree[156].worldX = (((39)-2) - 1) *gp.tileSize;
		gp.tree[156].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[157] = new BonzaiTree();
		gp.tree[157].worldX = (((27)-2) - 1) *gp.tileSize;
		gp.tree[157].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[158] = new AppleTree();
		gp.tree[158].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[158].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[159] = new BanyanTree();
		gp.tree[159].worldX = (((37)-2) - 1) *gp.tileSize;
		gp.tree[159].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[160] = new PineTree();
		gp.tree[160].worldX = (((42)-2) - 1) *gp.tileSize;
		gp.tree[160].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[161] = new SpruceTree();
		gp.tree[161].worldX = (((45)-2) - 1) *gp.tileSize;
		gp.tree[161].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[162] = new MapleTree();
		gp.tree[162].worldX = (((50)-2) - 1) *gp.tileSize;
		gp.tree[162].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[163] = new BonzaiTree();
		gp.tree[163].worldX = (((49)-2) - 1) *gp.tileSize;
		gp.tree[163].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[164] = new AppleTree();
		gp.tree[164].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[164].worldY = (((15)-3) - 1) *gp.tileSize;

		gp.tree[165] = new BanyanTree();
		gp.tree[165].worldX = (((40)-2) - 1) *gp.tileSize;
		gp.tree[165].worldY = (((15)-3) - 1) *gp.tileSize;

		gp.tree[166] = new PineTree();
		gp.tree[166].worldX = (((47)-2) - 1) *gp.tileSize;
		gp.tree[166].worldY = (((15)-3) - 1) *gp.tileSize;

		gp.tree[167] = new SpruceTree();
		gp.tree[167].worldX = (((26)-2) - 1) *gp.tileSize;
		gp.tree[167].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[168] = new MapleTree();
		gp.tree[168].worldX = (((28)-2) - 1) *gp.tileSize;
		gp.tree[168].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[169] = new BonzaiTree();
		gp.tree[169].worldX = (((30)-2) - 1) *gp.tileSize;
		gp.tree[169].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[170] = new AppleTree();
		gp.tree[170].worldX = (((38)-2) - 1) *gp.tileSize;
		gp.tree[170].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[171] = new BanyanTree();
		gp.tree[171].worldX = (((43)-2) - 1) *gp.tileSize;
		gp.tree[171].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[172] = new PineTree();
		gp.tree[172].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[172].worldY = (((17)-3) - 1) *gp.tileSize;

		gp.tree[173] = new SpruceTree();
		gp.tree[173].worldX = (((36)-2) - 1) *gp.tileSize;
		gp.tree[173].worldY = (((17)-3) - 1) *gp.tileSize;

		gp.tree[174] = new MapleTree();
		gp.tree[174].worldX = (((50)-2) - 1) *gp.tileSize;
		gp.tree[174].worldY = (((17)-3) - 1) *gp.tileSize;

		gp.tree[175] = new BonzaiTree();
		gp.tree[175].worldX = (((28)-2) - 1) *gp.tileSize;
		gp.tree[175].worldY = (((18)-3) - 1) *gp.tileSize;

		gp.tree[176] = new AppleTree();
		gp.tree[176].worldX = (((30)-2) - 1) *gp.tileSize;
		gp.tree[176].worldY = (((18)-3) - 1) *gp.tileSize;

		gp.tree[177] = new BanyanTree();
		gp.tree[177].worldX = (((38)-2) - 1) *gp.tileSize;
		gp.tree[177].worldY = (((18)-3) - 1) *gp.tileSize;

		gp.tree[178] = new PineTree();
		gp.tree[178].worldX = (((40)-2) - 1) *gp.tileSize;
		gp.tree[178].worldY = (((18)-3) - 1) *gp.tileSize;

		gp.tree[179] = new SpruceTree();
		gp.tree[179].worldX = (((45)-2) - 1) *gp.tileSize;
		gp.tree[179].worldY = (((18)-3) - 1) *gp.tileSize;

		gp.tree[180] = new MapleTree();
		gp.tree[180].worldX = (((48)-2) - 1) *gp.tileSize;
		gp.tree[180].worldY = (((18)-3) - 1) *gp.tileSize;

		gp.tree[181] = new BonzaiTree();
		gp.tree[181].worldX = (((32)-2) - 1) *gp.tileSize;
		gp.tree[181].worldY = (((19)-3) - 1) *gp.tileSize;

		gp.tree[182] = new AppleTree();
		gp.tree[182].worldX = (((34)-2) - 1) *gp.tileSize;
		gp.tree[182].worldY = (((19)-3) - 1) *gp.tileSize;

		gp.tree[183] = new BanyanTree();
		gp.tree[183].worldX = (((42)-2) - 1) *gp.tileSize;
		gp.tree[183].worldY = (((19)-3) - 1) *gp.tileSize;

		gp.tree[184] = new PineTree();
		gp.tree[184].worldX = (((27)-2) - 1) *gp.tileSize;
		gp.tree[184].worldY = (((20)-3) - 1) *gp.tileSize;

		gp.tree[185] = new SpruceTree();
		gp.tree[185].worldX = (((29)-2) - 1) *gp.tileSize;
		gp.tree[185].worldY = (((20)-3) - 1) *gp.tileSize;

		gp.tree[186] = new MapleTree();
		gp.tree[186].worldX = (((37)-2) - 1) *gp.tileSize;
		gp.tree[186].worldY = (((20)-3) - 1) *gp.tileSize;

		gp.tree[187] = new BonzaiTree();
		gp.tree[187].worldX = (((39)-2) - 1) *gp.tileSize;
		gp.tree[187].worldY = (((20)-3) - 1) *gp.tileSize;

		gp.tree[188] = new AppleTree();
		gp.tree[188].worldX = (((48)-2) - 1) *gp.tileSize;
		gp.tree[188].worldY = (((20)-3) - 1) *gp.tileSize;

		gp.tree[189] = new BanyanTree();
		gp.tree[189].worldX = (((50)-2) - 1) *gp.tileSize;
		gp.tree[189].worldY = (((20)-3) - 1) *gp.tileSize;

		gp.tree[190] = new PineTree();
		gp.tree[190].worldX = (((32)-2) - 1) *gp.tileSize;
		gp.tree[190].worldY = (((21)-3) - 1) *gp.tileSize;

		gp.tree[191] = new SpruceTree();
		gp.tree[191].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[191].worldY = (((21)-3) - 1) *gp.tileSize;

		gp.tree[192] = new MapleTree();
		gp.tree[192].worldX = (((43)-2) - 1) *gp.tileSize;
		gp.tree[192].worldY = (((21)-3) - 1) *gp.tileSize;

		gp.tree[193] = new BonzaiTree();
		gp.tree[193].worldX = (((46)-2) - 1) *gp.tileSize;
		gp.tree[193].worldY = (((21)-3) - 1) *gp.tileSize;

		gp.tree[194] = new AppleTree();
		gp.tree[194].worldX = (((30)-2) - 1) *gp.tileSize;
		gp.tree[194].worldY = (((22)-3) - 1) *gp.tileSize;

		gp.tree[195] = new BanyanTree();
		gp.tree[195].worldX = (((41)-2) - 1) *gp.tileSize;
		gp.tree[195].worldY = (((22)-3) - 1) *gp.tileSize;

		gp.tree[196] = new PineTree();
		gp.tree[196].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[196].worldY = (((23)-3) - 1) *gp.tileSize;

		gp.tree[197] = new SpruceTree();
		gp.tree[197].worldX = (((44)-2) - 1) *gp.tileSize;
		gp.tree[197].worldY = (((23)-3) - 1) *gp.tileSize;

		gp.tree[198] = new MapleTree();
		gp.tree[198].worldX = (((47)-2) - 1) *gp.tileSize;
		gp.tree[198].worldY = (((23)-3) - 1) *gp.tileSize;

		gp.tree[199] = new BonzaiTree();
		gp.tree[199].worldX = (((31)-2) - 1) *gp.tileSize;
		gp.tree[199].worldY = (((25)-3) - 1) *gp.tileSize;

		gp.tree[200] = new AppleTree();
		gp.tree[200].worldX = (((43)-2) - 1) *gp.tileSize;
		gp.tree[200].worldY = (((25)-3) - 1) *gp.tileSize;

		gp.tree[201] = new BanyanTree();
		gp.tree[201].worldX = (((46)-2) - 1) *gp.tileSize;
		gp.tree[201].worldY = (((25)-3) - 1) *gp.tileSize;

		gp.tree[202] = new PineTree();
		gp.tree[202].worldX = (((48)-2) - 1) *gp.tileSize;
		gp.tree[202].worldY = (((26)-3) - 1) *gp.tileSize;

		gp.tree[203] = new SpruceTree();
		gp.tree[203].worldX = (((46)-2) - 1) *gp.tileSize;
		gp.tree[203].worldY = (((27)-3) - 1) *gp.tileSize;

		gp.tree[204] = new MapleTree();
		gp.tree[204].worldX = (((44)-2) - 1) *gp.tileSize;
		gp.tree[204].worldY = (((26)-3) - 1) *gp.tileSize;

		gp.tree[205] = new BonzaiTree();
		gp.tree[205].worldX = (((35)-2) - 1) *gp.tileSize;
		gp.tree[205].worldY = (((23)-3) - 1) *gp.tileSize;

		gp.tree[206] = new AppleTree();
		gp.tree[206].worldX = (((33)-2) - 1) *gp.tileSize;
		gp.tree[206].worldY = (((25)-3) - 1) *gp.tileSize;

		gp.tree[207] = new BanyanTree();
		gp.tree[207].worldX = (((41)-2) - 1) *gp.tileSize;
		gp.tree[207].worldY = (((24)-3) - 1) *gp.tileSize;

		gp.tree[208] = new PineTree();
		gp.tree[208].worldX = (((43)-2) - 1) *gp.tileSize;
		gp.tree[208].worldY = (((28)-3) - 1) *gp.tileSize;

		// left up  //		
		
		gp.tree[209] = new SpruceTree();
		gp.tree[209].worldX = (((9)-2) - 1) *gp.tileSize;
		gp.tree[209].worldY = (((1)-3) - 1) *gp.tileSize;

		gp.tree[210] = new MapleTree();
		gp.tree[210].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[210].worldY = (((1)-3) - 1) *gp.tileSize;

		gp.tree[211] = new BonzaiTree();
		gp.tree[211].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[211].worldY = (((1)-3) - 1) *gp.tileSize;

		gp.tree[212] = new AppleTree();
		gp.tree[212].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[212].worldY = (((1)-3) - 1) *gp.tileSize;

		gp.tree[213] = new BanyanTree();
		gp.tree[213].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[213].worldY = (((2)-3) - 1) *gp.tileSize;

		gp.tree[214] = new PineTree();
		gp.tree[214].worldX = (((16)-2) - 1) *gp.tileSize;
		gp.tree[214].worldY = (((2)-3) - 1) *gp.tileSize;

		gp.tree[215] = new SpruceTree();
		gp.tree[215].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[215].worldY = (((3)-3) - 1) *gp.tileSize;

		gp.tree[216] = new MapleTree();
		gp.tree[216].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[216].worldY = (((3)-3) - 1) *gp.tileSize;

		gp.tree[217] = new BonzaiTree();
		gp.tree[217].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[217].worldY = (((4)-3) - 1) *gp.tileSize;

		gp.tree[218] = new AppleTree();
		gp.tree[218].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[218].worldY = (((4)-3) - 1) *gp.tileSize;

		gp.tree[219] = new BanyanTree();
		gp.tree[219].worldX = (((17)-2) - 1) *gp.tileSize;
		gp.tree[219].worldY = (((4)-3) - 1) *gp.tileSize;

		gp.tree[220] = new PineTree();
		gp.tree[220].worldX = (((19)-2) - 1) *gp.tileSize;
		gp.tree[220].worldY = (((4)-3) - 1) *gp.tileSize;

		gp.tree[221] = new SpruceTree();
		gp.tree[221].worldX = (((22)-2) - 1) *gp.tileSize;
		gp.tree[221].worldY = (((4)-3) - 1) *gp.tileSize;

		gp.tree[222] = new MapleTree();
		gp.tree[222].worldX = (((9)-2) - 1) *gp.tileSize;
		gp.tree[222].worldY = (((5)-3) - 1) *gp.tileSize;

		gp.tree[223] = new BonzaiTree();
		gp.tree[223].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[223].worldY = (((5)-3) - 1) *gp.tileSize;

		gp.tree[224] = new AppleTree();
		gp.tree[224].worldX = (((16)-2) - 1) *gp.tileSize;
		gp.tree[224].worldY = (((5)-3) - 1) *gp.tileSize;

		gp.tree[225] = new BanyanTree();
		gp.tree[225].worldX = (((21)-2) - 1) *gp.tileSize;
		gp.tree[225].worldY = (((5)-3) - 1) *gp.tileSize;

		gp.tree[226] = new PineTree();
		gp.tree[226].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[226].worldY = (((6)-3) - 1) *gp.tileSize;

		gp.tree[227] = new SpruceTree();
		gp.tree[227].worldX = (((14)-2) - 1) *gp.tileSize;
		gp.tree[227].worldY = (((6)-3) - 1) *gp.tileSize;

		gp.tree[228] = new MapleTree();
		gp.tree[228].worldX = (((18)-2) - 1) *gp.tileSize;
		gp.tree[228].worldY = (((6)-3) - 1) *gp.tileSize;

		gp.tree[229] = new BonzaiTree();
		gp.tree[229].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[229].worldY = (((7)-3) - 1) *gp.tileSize;

		gp.tree[230] = new AppleTree();
		gp.tree[230].worldX = (((16)-2) - 1) *gp.tileSize;
		gp.tree[230].worldY = (((7)-3) - 1) *gp.tileSize;

		gp.tree[231] = new BanyanTree();
		gp.tree[231].worldX = (((20)-2) - 1) *gp.tileSize;
		gp.tree[231].worldY = (((7)-3) - 1) *gp.tileSize;

		gp.tree[232] = new PineTree();
		gp.tree[232].worldX = (((14)-2) - 1) *gp.tileSize;
		gp.tree[232].worldY = (((8)-3) - 1) *gp.tileSize;

		gp.tree[233] = new SpruceTree();
		gp.tree[233].worldX = (((18)-2) - 1) *gp.tileSize;
		gp.tree[233].worldY = (((8)-3) - 1) *gp.tileSize;

		gp.tree[234] = new MapleTree();
		gp.tree[234].worldX = (((19)-2) - 1) *gp.tileSize;
		gp.tree[234].worldY = (((8)-3) - 1) *gp.tileSize;

		gp.tree[235] = new BonzaiTree();
		gp.tree[235].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[235].worldY = (((9)-3) - 1) *gp.tileSize;

		gp.tree[236] = new AppleTree();
		gp.tree[236].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[236].worldY = (((9)-3) - 1) *gp.tileSize;

		gp.tree[237] = new BanyanTree();
		gp.tree[237].worldX = (((17)-2) - 1) *gp.tileSize;
		gp.tree[237].worldY = (((9)-3) - 1) *gp.tileSize;

		gp.tree[238] = new PineTree();
		gp.tree[238].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[238].worldY = (((10)-3) - 1) *gp.tileSize;

		gp.tree[239] = new SpruceTree();
		gp.tree[239].worldX = (((21)-2) - 1) *gp.tileSize;
		gp.tree[239].worldY = (((10)-3) - 1) *gp.tileSize;

		gp.tree[240] = new MapleTree();
		gp.tree[240].worldX = (((14)-2) - 1) *gp.tileSize;
		gp.tree[240].worldY = (((11)-3) - 1) *gp.tileSize;

		gp.tree[241] = new BonzaiTree();
		gp.tree[241].worldX = (((16)-2) - 1) *gp.tileSize;
		gp.tree[241].worldY = (((11)-3) - 1) *gp.tileSize;

		gp.tree[242] = new AppleTree();
		gp.tree[242].worldX = (((19)-2) - 1) *gp.tileSize;
		gp.tree[242].worldY = (((11)-3) - 1) *gp.tileSize;

		gp.tree[243] = new BanyanTree();
		gp.tree[243].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[243].worldY = (((12)-3) - 1) *gp.tileSize;

		gp.tree[244] = new PineTree();
		gp.tree[244].worldX = (((6)-2) - 1) *gp.tileSize;
		gp.tree[244].worldY = (((12)-3) - 1) *gp.tileSize;

		gp.tree[245] = new SpruceTree();
		gp.tree[245].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[245].worldY = (((12)-3) - 1) *gp.tileSize;

		gp.tree[246] = new MapleTree();
		gp.tree[246].worldX = (((22)-2) - 1) *gp.tileSize;
		gp.tree[246].worldY = (((12)-3) - 1) *gp.tileSize;

		gp.tree[247] = new BonzaiTree();
		gp.tree[247].worldX = (((1)-2) - 1) *gp.tileSize;
		gp.tree[247].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[248] = new AppleTree();
		gp.tree[248].worldX = (((4)-2) - 1) *gp.tileSize;
		gp.tree[248].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[249] = new BanyanTree();
		gp.tree[249].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[249].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[250] = new PineTree();
		gp.tree[250].worldX = (((14)-2) - 1) *gp.tileSize;
		gp.tree[250].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[251] = new SpruceTree();
		gp.tree[251].worldX = (((17)-2) - 1) *gp.tileSize;
		gp.tree[251].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[252] = new MapleTree();
		gp.tree[252].worldX = (((19)-2) - 1) *gp.tileSize;
		gp.tree[252].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[253] = new BonzaiTree();
		gp.tree[253].worldX = (((2)-2) - 1) *gp.tileSize;
		gp.tree[253].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[254] = new AppleTree();
		gp.tree[254].worldX = (((8)-2) - 1) *gp.tileSize;
		gp.tree[254].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[255] = new BanyanTree();
		gp.tree[255].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[255].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[256] = new PineTree();
		gp.tree[256].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[256].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[257] = new SpruceTree();
		gp.tree[257].worldX = (((21)-2) - 1) *gp.tileSize;
		gp.tree[257].worldY = (((14)-3) - 1) *gp.tileSize;

		gp.tree[258] = new MapleTree();
		gp.tree[258].worldX = (((5)-2) - 1) *gp.tileSize;
		gp.tree[258].worldY = (((15)-3) - 1) *gp.tileSize;

		gp.tree[259] = new BonzaiTree();
		gp.tree[259].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[259].worldY = (((15)-3) - 1) *gp.tileSize;

		gp.tree[260] = new AppleTree();
		gp.tree[260].worldX = (((17)-2) - 1) *gp.tileSize;
		gp.tree[260].worldY = (((15)-3) - 1) *gp.tileSize;

		gp.tree[261] = new BanyanTree();
		gp.tree[261].worldX = (((19)-2) - 1) *gp.tileSize;
		gp.tree[261].worldY = (((15)-3) - 1) *gp.tileSize;

		gp.tree[262] = new PineTree();
		gp.tree[262].worldX = (((1)-2) - 1) *gp.tileSize;
		gp.tree[262].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[263] = new SpruceTree();
		gp.tree[263].worldX = (((3)-2) - 1) *gp.tileSize;
		gp.tree[263].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[264] = new MapleTree();
		gp.tree[264].worldX = (((7)-2) - 1) *gp.tileSize;
		gp.tree[264].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[265] = new BonzaiTree();
		gp.tree[265].worldX = (((9)-2) - 1) *gp.tileSize;
		gp.tree[265].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[266] = new AppleTree();
		gp.tree[266].worldX = (((14)-2) - 1) *gp.tileSize;
		gp.tree[266].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[267] = new BanyanTree();
		gp.tree[267].worldX = (((20)-2) - 1) *gp.tileSize;
		gp.tree[267].worldY = (((16)-3) - 1) *gp.tileSize;

		gp.tree[268] = new PineTree();
		gp.tree[268].worldX = (((5)-2) - 1) *gp.tileSize;
		gp.tree[268].worldY = (((17)-3) - 1) *gp.tileSize;

		gp.tree[269] = new SpruceTree();
		gp.tree[269].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[269].worldY = (((177)-3) - 1) *gp.tileSize;

		gp.tree[270] = new MapleTree();
		gp.tree[270].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[270].worldY = (((17)-3) - 1) *gp.tileSize;

		gp.tree[271] = new BonzaiTree();
		gp.tree[271].worldX = (((18)-2) - 1) *gp.tileSize;
		gp.tree[271].worldY = (((17)-3) - 1) *gp.tileSize;

		gp.tree[272] = new AppleTree();
		gp.tree[272].worldX = (((1)-2) - 1) *gp.tileSize;
		gp.tree[272].worldY = (((18)-3) - 1) *gp.tileSize;

		gp.tree[273] = new BanyanTree();
		gp.tree[273].worldX = (((3)-2) - 1) *gp.tileSize;
		gp.tree[273].worldY = (((18)-3) - 1) *gp.tileSize;

		gp.tree[274] = new PineTree();
		gp.tree[274].worldX = (((8)-2) - 1) *gp.tileSize;
		gp.tree[274].worldY = (((18)-3) - 1) *gp.tileSize;

		gp.tree[275] = new SpruceTree();
		gp.tree[275].worldX = (((6)-2) - 1) *gp.tileSize;
		gp.tree[275].worldY = (((19)-3) - 1) *gp.tileSize;

		gp.tree[276] = new MapleTree();
		gp.tree[276].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[276].worldY = (((19)-3) - 1) *gp.tileSize;

		gp.tree[277] = new BonzaiTree();
		gp.tree[277].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[277].worldY = (((19)-3) - 1) *gp.tileSize;

		gp.tree[278] = new AppleTree();
		gp.tree[278].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[278].worldY = (((19)-3) - 1) *gp.tileSize;

		gp.tree[279] = new BanyanTree();
		gp.tree[279].worldX = (((17)-2) - 1) *gp.tileSize;
		gp.tree[279].worldY = (((19)-3) - 1) *gp.tileSize;

		gp.tree[280] = new PineTree();
		gp.tree[280].worldX = (((2)-2) - 1) *gp.tileSize;
		gp.tree[280].worldY = (((20)-3) - 1) *gp.tileSize;

		gp.tree[281] = new SpruceTree();
		gp.tree[281].worldX = (((8)-2) - 1) *gp.tileSize;
		gp.tree[281].worldY = (((20)-3) - 1) *gp.tileSize;

		gp.tree[282] = new MapleTree();
		gp.tree[282].worldX = (((14)-2) - 1) *gp.tileSize;
		gp.tree[282].worldY = (((20)-3) - 1) *gp.tileSize;

		gp.tree[283] = new BonzaiTree();
		gp.tree[283].worldX = (((5)-2) - 1) *gp.tileSize;
		gp.tree[283].worldY = (((21)-3) - 1) *gp.tileSize;

		gp.tree[284] = new AppleTree();
		gp.tree[284].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[284].worldY = (((21)-3) - 1) *gp.tileSize;

		gp.tree[285] = new BanyanTree();
		gp.tree[285].worldX = (((16)-2) - 1) *gp.tileSize;
		gp.tree[285].worldY = (((21)-3) - 1) *gp.tileSize;

		gp.tree[286] = new PineTree();
		gp.tree[286].worldX = (((3)-2) - 1) *gp.tileSize;
		gp.tree[286].worldY = (((22)-3) - 1) *gp.tileSize;

		gp.tree[287] = new SpruceTree();
		gp.tree[287].worldX = (((7)-2) - 1) *gp.tileSize;
		gp.tree[287].worldY = (((22)-3) - 1) *gp.tileSize;

		gp.tree[288] = new MapleTree();
		gp.tree[288].worldX = (((9)-2) - 1) *gp.tileSize;
		gp.tree[288].worldY = (((22)-3) - 1) *gp.tileSize;

		gp.tree[289] = new BonzaiTree();
		gp.tree[289].worldX = (((14)-2) - 1) *gp.tileSize;
		gp.tree[289].worldY = (((22)-3) - 1) *gp.tileSize;

		gp.tree[290] = new AppleTree();
		gp.tree[290].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[290].worldY = (((23)-3) - 1) *gp.tileSize;

		gp.tree[291] = new BanyanTree();
		gp.tree[291].worldX = (((3)-2) - 1) *gp.tileSize;
		gp.tree[291].worldY = (((24)-3) - 1) *gp.tileSize;

		gp.tree[292] = new PineTree();
		gp.tree[292].worldX = (((5)-2) - 1) *gp.tileSize;
		gp.tree[292].worldY = (((24)-3) - 1) *gp.tileSize;

		gp.tree[293] = new SpruceTree();
		gp.tree[293].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[293].worldY = (((24)-3) - 1) *gp.tileSize;

		gp.tree[294] = new MapleTree();
		gp.tree[294].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[294].worldY = (((25)-3) - 1) *gp.tileSize;

		gp.tree[295] = new BonzaiTree();
		gp.tree[295].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[295].worldY = (((25)-3) - 1) *gp.tileSize;

		gp.tree[296] = new AppleTree();
		gp.tree[296].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[296].worldY = (((25)-3) - 1) *gp.tileSize;

		gp.tree[297] = new BanyanTree();
		gp.tree[297].worldX = (((4)-2) - 1) *gp.tileSize;
		gp.tree[297].worldY = (((26)-3) - 1) *gp.tileSize;

		gp.tree[298] = new PineTree();
		gp.tree[298].worldX = (((19)-2) - 1) *gp.tileSize;
		gp.tree[298].worldY = (((18)-3) - 1) *gp.tileSize;

		gp.tree[299] = new SpruceTree();
		gp.tree[299].worldX = (((23)-2) - 1) *gp.tileSize;
		gp.tree[299].worldY = (((13)-3) - 1) *gp.tileSize;

		gp.tree[300] = new MapleTree();
		gp.tree[300].worldX = (((22)-2) - 1) *gp.tileSize;
		gp.tree[300].worldY = (((15)-3) - 1) *gp.tileSize;

		//left down//	
		
		gp.tree[301] = new BonzaiTree();
		gp.tree[301].worldX = (((16)-2) - 1) *gp.tileSize;
		gp.tree[301].worldY = (((45)-3) - 1) *gp.tileSize;

		gp.tree[302] = new AppleTree();
		gp.tree[302].worldX = (((14)-2) - 1) *gp.tileSize;
		gp.tree[302].worldY = (((45)-3) - 1) *gp.tileSize;

		gp.tree[303] = new BanyanTree();
		gp.tree[303].worldX = (((9)-2) - 1) *gp.tileSize;
		gp.tree[303].worldY = (((45)-3) - 1) *gp.tileSize;

		gp.tree[304] = new PineTree();
		gp.tree[304].worldX = (((8)-2) - 1) *gp.tileSize;
		gp.tree[304].worldY = (((46)-3) - 1) *gp.tileSize;
		
		gp.tree[305] = new BonzaiTree();
		gp.tree[305].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[305].worldY = (((46)-3) - 1) *gp.tileSize;

		gp.tree[306] = new AppleTree();
		gp.tree[306].worldX = (((18)-2) - 1) *gp.tileSize;
		gp.tree[306].worldY = (((46)-3) - 1) *gp.tileSize;

		gp.tree[307] = new BanyanTree();
		gp.tree[307].worldX = (((12)-2) - 1) *gp.tileSize;
		gp.tree[307].worldY = (((47)-3) - 1) *gp.tileSize;

		gp.tree[308] = new PineTree();
		gp.tree[308].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[308].worldY = (((47)-3) - 1) *gp.tileSize;
		
		gp.tree[309] = new BonzaiTree();
		gp.tree[309].worldX = (((17)-2) - 1) *gp.tileSize;
		gp.tree[309].worldY = (((47)-3) - 1) *gp.tileSize;

		gp.tree[310] = new AppleTree();
		gp.tree[310].worldX = (((21)-2) - 1) *gp.tileSize;
		gp.tree[310].worldY = (((47)-3) - 1) *gp.tileSize;

		gp.tree[311] = new BanyanTree();
		gp.tree[311].worldX = (((8)-2) - 1) *gp.tileSize;
		gp.tree[311].worldY = (((48)-3) - 1) *gp.tileSize;

		gp.tree[312] = new PineTree();
		gp.tree[312].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[312].worldY = (((48)-3) - 1) *gp.tileSize;
		
		gp.tree[313] = new BonzaiTree();
		gp.tree[313].worldX = (((14)-2) - 1) *gp.tileSize;
		gp.tree[313].worldY = (((48)-3) - 1) *gp.tileSize;

		gp.tree[314] = new AppleTree();
		gp.tree[314].worldX = (((11)-2) - 1) *gp.tileSize;
		gp.tree[314].worldY = (((49)-3) - 1) *gp.tileSize;

		gp.tree[315] = new BanyanTree();
		gp.tree[315].worldX = (((10)-2) - 1) *gp.tileSize;
		gp.tree[315].worldY = (((50)-3) - 1) *gp.tileSize;

		gp.tree[316] = new PineTree();
		gp.tree[316].worldX = (((13)-2) - 1) *gp.tileSize;
		gp.tree[316].worldY = (((50)-3) - 1) *gp.tileSize;
		
		gp.tree[317] = new PineTree();
		gp.tree[317].worldX = (((15)-2) - 1) *gp.tileSize;
		gp.tree[317].worldY = (((50)-3) - 1) *gp.tileSize;
		
		///
		
		gp.key[0] = new WinterKey();
		gp.key[0].worldX = ((48) - 1) *gp.tileSize;
		gp.key[0].worldY = ((29) - 1) *gp.tileSize;
		
		gp.key[1] = new WinterGate();
		gp.key[1].worldX = ((25) - 1) *gp.tileSize;
		gp.key[1].worldY = ((27) - 1) *gp.tileSize;
		
		gp.key[2] = new Bone();
		gp.key[2].worldX = ((24) - 1) *gp.tileSize;
		gp.key[2].worldY = ((23) - 1) *gp.tileSize;
		
		gp.key[3] = new SpringKey();
		gp.key[3].worldX = ((24) - 1) *gp.tileSize;
		gp.key[3].worldY = ((48) - 1) *gp.tileSize;
		
		gp.key[4] = new SummerKey();
		gp.key[4].worldX = ((3) - 1) *gp.tileSize;
		gp.key[4].worldY = ((28) - 1) *gp.tileSize;
		
		gp.key[5] = new AutumnKey();
		gp.key[5].worldX = ((24) - 1) *gp.tileSize;
		gp.key[5].worldY = ((2) - 1) *gp.tileSize;
		
		gp.key[6] = new SpringGate();
		gp.key[6].worldX = ((23) - 1) *gp.tileSize;
		gp.key[6].worldY = ((29) - 1) *gp.tileSize;
		
		gp.key[7] = new SummerGate();
		gp.key[7].worldX = ((21) - 1) *gp.tileSize;
		gp.key[7].worldY = ((27) - 1) *gp.tileSize;
		
		gp.key[8] = new AutumnGate();
		gp.key[8].worldX = ((23) - 1) *gp.tileSize;
		gp.key[8].worldY = ((25) - 1) *gp.tileSize;
	}
}
