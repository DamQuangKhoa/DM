package controler;

import java.awt.Graphics;
import java.awt.Image;

public interface HeroMethod {
public int di(int toaDo,boolean huong);
public void veHero(Image img,int x,int y, Graphics g);
public boolean kiemTraDiChuyenDuoc(int x,int y,int[][] chan);
public void chet(int xHero, int yHero);
public void quaMan();
}
