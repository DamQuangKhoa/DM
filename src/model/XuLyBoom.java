package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.Timer;

import controler.BoomMethod;
import controler.ControllerBoom;
import controler.ControllerHero;
import controler.Item;
import view.HinhAnh;

public class XuLyBoom  implements BoomMethod{
private static XuLyBoom instance = null;
public static  XuLyBoom getInstance() {
	if(instance == null){
		instance = new XuLyBoom();
	}
	return instance;
}
private XuLyBoom()  {
}
@Override
public void veBoom(int x, int y, Graphics g, int levelBoom) {
	if(levelBoom == 1){
	General.veHinh(HinhAnh.boom, x, y, g);
	}
	if(levelBoom == 2){
		General.veHinh(HinhAnh.boomDen, x, y, g);
	}
	if(levelBoom >=3){
		General.veHinh(HinhAnh.boomMax, x, y, g);
	}
}
	@Override
	public void noBom(int x, int y,Graphics g,int[][] map,int levelBom) {
		
			for (int i = 0; i <= levelBom; i++) {
				if(x-levelBom > 0){
					General.veHinh(HinhAnh.boomNo, x-i, y, g);
					map[x + i][y] = 0;	
				}
				if(x+levelBom < 29){
					General.veHinh(HinhAnh.boomNo, x+i, y, g);
					map[x - i][y] = 0;
				}
				if(y-levelBom > 0){
					General.veHinh(HinhAnh.boomNo, x, y-i, g);
					map[x][y+i] = 0;
				}
				if(y+levelBom < 29){
					General.veHinh(HinhAnh.boomNo, x, y+i, g);
					map[x][y - i] = 0 ;
				}
				
					
				
				
				
				
				
			}
		}
				
	}		
