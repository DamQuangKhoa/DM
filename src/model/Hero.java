package model;

import controler.Item;
import model_item.ItemBom;
import model_item.ItemHeart;
import model_item.ItemLua;

public class Hero {
	private static int xHero, yHero, levelBom, sinhLuc, soTenLua;
	private static boolean isChet = false;

	public Hero(int xHero, int yHero) {
		super();
		this.xHero = xHero;
		this.yHero = yHero;
	}

	public Hero() {
		super();
		this.xHero = 2;
		this.yHero = 2;
		this.levelBom = 1;
		sinhLuc = 100;
	}

	
	
	public static boolean isChet() {
		return isChet;
	}

	public static void setChet(boolean isChet) {
		Hero.isChet = isChet;
	}

	public static int getLevelBom() {
		return levelBom;
	}

	public static void setLevelBom(int levelBom) {
		Hero.levelBom = levelBom;
	}

	public static int getSinhLuc() {
		return sinhLuc;
	}

	public static void setSinhLuc(int sinhLuc) {
		Hero.sinhLuc = sinhLuc;
	}

	public static int getSoTenLua() {
		return soTenLua;
	}

	public static void setSoTenLua(int soTenLua) {
		Hero.soTenLua = soTenLua;
	}

	public static int getxHero() {
		return xHero;
	}

	public static void setxHero(int xHero) {
		Hero.xHero = xHero;
	}

	public static int getyHero() {
		return yHero;
	}

	public static void setyHero(int yHero) {
		Hero.yHero = yHero;
	}

	@Override
	public String toString() {
		return "Vi Tri x: " + xHero + "\t" + "Vi Tri y: " + yHero;
	}

	public boolean isNhanIteam(Item item) {
		if (xHero == item.getxItem() && yHero == item.getyItem() ) {
			if(item instanceof ItemBom){
				levelBom++;
			}
			if(item instanceof ItemLua){
				levelBom++;
			}
			if(item instanceof ItemHeart){
				sinhLuc+= 20;
			}
			return true;
		} else
			return false;
	}
	
}
