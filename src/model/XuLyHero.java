package model;

import java.awt.Graphics;
import java.awt.Image;

import controler.ControllerHero;
import controler.HeroMethod;

public class XuLyHero implements HeroMethod {

	@Override
	public boolean kiemTraDiChuyenDuoc(int x, int y, int[][] chan) {
		return false;
	}

	public static boolean huong = false; // false la di xuong
	private static XuLyHero instance = null;

	public static XuLyHero getInstance() {
		if (instance == null) {
			instance = new XuLyHero();
		}
		return instance;
	}

	private XuLyHero() {
	}

	@Override
	public void chet(int x, int y) {
		for (int i = 0; i <= Hero.getLevelBom(); i++) {
			if (((x + i) == Hero.getxHero() && y == Hero.getxHero())
					|| ((x - i) == Hero.getxHero() && y == Hero.getyHero())
					|| (x == Hero.getxHero() && (y + i) == Hero.getyHero())
					|| (x == Hero.getxHero() && (y - i) == Hero.getyHero())) {
				Hero.setSinhLuc(Hero.getSinhLuc() - 20);
				break;
			}
		}
//		System.out.println(Hero.getSinhLuc());
		if (Hero.getSinhLuc() == 0) {
			Hero.setChet(true);
			return;
		}
	}

	@Override
	public void quaMan() {

	}

	@Override
	public void veHero(Image img, int x, int y, Graphics g) {
		General.veHinh(img, x, y, g);
	}

	@Override
	public int di(int data, boolean huong) {
		if (huong == false) {
			--data;
			return data;
		}
		++data;
		return data;
	}
}
