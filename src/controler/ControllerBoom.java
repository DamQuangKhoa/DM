package controler;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import model.XuLyBoom;
import model.XuLyHero;
import view.HinhAnh;

public class ControllerBoom  implements BoomMethod{
XuLyBoom xuLyBoom;
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
public void kiemTraBoom(int x,int y,int leveilBoom){
	
}
public void veBoom( int x, int y, Graphics g,int levelBoom) {
	xuLyBoom.veBoom(x, y, g, levelBoom);
}
	@Override
	public void noBom(int x, int y,Graphics g,int[][] map,int levelBom) {
		xuLyBoom.noBom(x, y, g, map,levelBom);
	}
}
