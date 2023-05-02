package main;
import entity.npcOldMan;
import monster.Chort;
import monster.Mimic;
import monster.Orc;
import object.Obj_Boot;
import object.Obj_Chest;
import object.Obj_Door;
import object.Obj_Gate;
import object.Obj_Key;
import object.Obj_SpecialKey;

public class AssetSetter {
	
	GamePanel gamePanel;
	
	public AssetSetter(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	public void setObject() {
		int ob=0;
		gamePanel.obj[ob] = new Obj_SpecialKey(gamePanel);
		gamePanel.obj[ob].worldX = 4*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 2*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_SpecialKey(gamePanel);
		gamePanel.obj[ob].worldX = 48*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 48*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Key(gamePanel);
		gamePanel.obj[ob].worldX = 4*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 3*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 19*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 20*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 14*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 17*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 27*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 44*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 1*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 22*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 9*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 17*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 18*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 12*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 24*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 13*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 29*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 2*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 37*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 4*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 37*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 12*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 36*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 18*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 30*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 44*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 32*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 32*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 40*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 41*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 43*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 26*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 24*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 46*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 19*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 37*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 43*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 26*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 12*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 29*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Chest(gamePanel);
		gamePanel.obj[ob].worldX = 10*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 2*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Boot(gamePanel);
		gamePanel.obj[ob].worldX = 10*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 4*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Chest(gamePanel);
		gamePanel.obj[ob].worldX = 28*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 16*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Chest(gamePanel);
		gamePanel.obj[ob].worldX = 16*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 1*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Chest(gamePanel);
		gamePanel.obj[ob].worldX = 23*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 11*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Chest(gamePanel);
		gamePanel.obj[ob].worldX = 27*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 16*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Chest(gamePanel);
		gamePanel.obj[ob].worldX = 1*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 11*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 25*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 13*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 9*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 47*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 7*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 47*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 8*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 47*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 6*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 47*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 5*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 47*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 4*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 47*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Door(gamePanel);
		gamePanel.obj[ob].worldX = 3*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 47*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Chest(gamePanel);
		gamePanel.obj[ob].worldX = 40*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 11*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Chest(gamePanel);
		gamePanel.obj[ob].worldX = 36*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 40*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Chest(gamePanel);
		gamePanel.obj[ob].worldX = 46*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 43*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Gate(gamePanel);
		gamePanel.obj[ob].worldX = 4*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 4*gamePanel.tileSize;
		ob++;
		gamePanel.obj[ob] = new Obj_Gate(gamePanel);
		gamePanel.obj[ob].worldX = 48*gamePanel.tileSize;
		gamePanel.obj[ob].worldY = 49*gamePanel.tileSize;
		
	}
	
	public void setNPCs() {
		int ob=0;
		gamePanel.npc[ob] = new npcOldMan(gamePanel);
		gamePanel.npc[ob].worldX = gamePanel.tileSize * 25;
		gamePanel.npc[ob].worldY = gamePanel.tileSize * 36;
		ob++;
		gamePanel.npc[ob] = new npcOldMan(gamePanel);
		gamePanel.npc[ob].worldX = gamePanel.tileSize * 2;
		gamePanel.npc[ob].worldY = gamePanel.tileSize * 4;
	}
	
	public void setMonster() {
		int ob=0;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 21;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 6;
		
		//First
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 5;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 26;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 10;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 26;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 5;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 35;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 7;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 36;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 8;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 33;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 9;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 34;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 7;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 35;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 7;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 34;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 8;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 36;
		
		//second
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 15;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 26;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 19;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 35;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 18;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 43;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 20;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 36;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 19;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 42;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 20;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 44;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 8;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 9;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 14;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 9;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 14;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 8;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 20;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 9;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 26;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 6;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 34;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 9;
		ob++;
		gamePanel.monster[ob] = new Chort(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 44;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 6;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 44;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 12;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 44;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 13;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 42;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 6;
		ob++;
		gamePanel.monster[ob] = new Mimic(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 32;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 9;
		
		// Last
		ob++;
		gamePanel.monster[ob] = new Orc(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 47;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 38;
		ob++;
		gamePanel.monster[ob] = new Orc(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 47;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 39;		
		ob++;
		gamePanel.monster[ob] = new Orc(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 40;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 33;
		ob++;
		gamePanel.monster[ob] = new Orc(gamePanel);
		gamePanel.monster[ob].worldX = gamePanel.tileSize * 42;
		gamePanel.monster[ob].worldY = gamePanel.tileSize * 32;
			
	}
}