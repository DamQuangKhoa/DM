package controler;

import java.awt.Graphics;
import java.awt.Image;

import model.General;
import model.XuLyHero;
import view.HinhAnh;

public class ControllerHero implements HeroMethod {
XuLyHero model ;
private static ControllerHero instance = null;
public static ControllerHero getInstance(){
	if(instance == null){
		instance = new ControllerHero();
	}
	return instance;
}
private ControllerHero() {
model = XuLyHero.getInstance();
}
	@Override
public void chet(int xHero,int yHero) {
model.chet(xHero, yHero);
}

@Override
public void quaMan() {
	// TODO Auto-generated method stub
}

	@Override
	public int di(int toaDo, boolean huong) {
		return model.di(toaDo, huong);
	}
	@Override
	public void veHero(Image img, int x, int y, Graphics g) {
		model.veHero(img, x, y, g);
		
	}
	
	@Override
	public boolean kiemTraDiChuyenDuoc(int x, int y, int[][] chan) {
//		return model.kiemTraDiChuyenDuoc(x, y, chan);
			try {
				if (chan[x][y] == 0)
					return true;
			} catch (Exception e) {
			}
			return false;
		}
	}
