package model;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import controler.ABoom;
import controler.ControllerHero;
import view.HinhAnh;

public class Boom {
private  int xBom,yBom, levelBoom;
public Boom(int x, int y)  {
	this.xBom=x;
	this.yBom=y;
	levelBoom =3;
	}
public  int getxBom() {
	return xBom;
}
public int getLevelBoom() {
	return levelBoom;
}
public  void setLevelBoom(int levelBoom) {
	levelBoom = levelBoom;
}
public  void setxBom(int xBom) {
	xBom = xBom;
}
public  int getyBom() {
	return yBom;
}
public  void setyBom(int yBom) {
	yBom = yBom;
}
@Override
public String toString() {
	return "X_Bom: "+xBom+"\t" +"Y_Bom"+yBom;
}

}

