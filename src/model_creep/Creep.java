package model_creep;

import java.awt.Graphics;

import controler.ControllerHero;

public abstract class Creep {
protected int xCreep,yCreep;
ControllerHero controller;
public static boolean isChetChua = false;
public  boolean diXuong = false,diLen = true,sangTrai = false,sangPhai= false;

public Creep(int xCreep, int yCreep) {
	super();
	this.xCreep = xCreep;
	this.yCreep = yCreep;
	controller = ControllerHero.getInstance();

}
public void kiemTraHuong(int xCong, int yCong,int[][] map){
	if(xCong > xCreep  && yCong >yCreep){
		if(controller.kiemTraDiChuyenDuoc((xCreep+1), yCreep, map)&& !sangTrai){
			sangTrai = false;
			sangPhai = true;
			diLen = false;
			diXuong = false;
		}
		else if (controller.kiemTraDiChuyenDuoc(xCreep, (yCreep+1), map ) ){
			sangTrai = false;
			sangPhai = false;
			diLen = true;
			diXuong = false;
		}
else if (controller.kiemTraDiChuyenDuoc((xCreep-1), yCreep, map )  && !sangPhai){
	sangTrai = true;
	sangPhai = false;
	diLen = false;
	diXuong = false;
		}
	}
}

public void diChuyen(int xCong, int yCong,int[][] map){
kiemTraHuong(xCong, yCong, map);		
if(sangTrai){
	xCreep--;
}
if(sangPhai){
	xCreep++;
}
if(diLen){
	yCreep++;
}
	}
	
public abstract void veCreep(Graphics g);
	

}