package controler;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import model.XuLyBoom;
import model.XuLyHero;
import view.HinhAnh;

public class ControllerBoom  implements BoomMethod{
XuLyBoom xuLyBoom;
public static boolean isDatDuoc= false;
private static ControllerBoom instance = null;
public static ControllerBoom getInstance(){
	if(instance == null){
		instance = new ControllerBoom();
	}
	return instance;
}

public ControllerBoom()  {
xuLyBoom = XuLyBoom.getInstance();
}
public void kiemTraBoom(int x,int y,int levelBom){
	if(x<= levelBom-1 || x> 19-levelBom ||  y<= levelBom-1 || y > 19-levelBom){
		isDatDuoc = false;
	}
	else {
		isDatDuoc = true;
	}
}
public void veBoom( int x, int y, Graphics g,int levelBoom) {
	xuLyBoom.veBoom(x, y, g, levelBoom);
}
	@Override
	public void noBom(int x, int y,Graphics g,int[][] map,int levelBom) {
		if ((x - levelBom) < 0 && (x + levelBom) > 29 || (y - levelBom) < 0 && (y + levelBom) > 29) {
			levelBom-=2;
			xuLyBoom.noBom(x, y, g, map,levelBom);
			
		} 
		else {
			xuLyBoom.noBom(x, y, g, map,levelBom);
		}
	}
}
