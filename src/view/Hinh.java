package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import controler.ControllerBoom;
import controler.ControllerHero;
import controler.Item;
import model.Boom;
import model.General;
import model.Hero;
import model_item.ItemBom;
import model_item.ItemHeart;
import model_item.ItemLua;

public class Hinh  extends JPanel implements KeyListener {
	HinhAnh image;
	ControllerHero controller;
	ControllerBoom controllerBoom;
	Hero hero;
	Boom boom;
	public ArrayList<Boom> booms;
	public ArrayList<Boom> boomNo;
	Timer timeBoom;
public static final int DODAI=20;
public static final int CO=0,BUICO=1,CAY=2,DA1=3,DA2=4,DA3=5,DA4=6,DA5=7
,THUNG=8,	NUOC=9;
public   boolean diXuong= false,diLen=false,sangTrai = true,
sangPhai = false, datBoom = false,isNoChua = false;
int tmp,count,i,j,countTmp;
Item itemLua,itemHeart,itemBom;
public static int[][] map = {
		{DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA2, DA1, DA3, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1},
		{DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1, DA1},
		{DA1, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO},
		{CO, CO, CO, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO},
		{DA1, CO, DA1, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO},
		{CO, CO, CO, CO, CO, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO},
		{DA1, CO, DA1, CO, DA1, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO},
		{CO, CO, CO, CO, CO, CO, CO, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO},
		{DA1, CO, DA1, CO, DA1, CO, DA1, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO},
		{CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO},
		{DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, CO, CO, CO, CO, BUICO, BUICO, BUICO, BUICO, BUICO, BUICO},
		{CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO},
		{DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, CO, CO, CO, CO, CO, CO, CO, CO},
		{CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, DA1, CO, DA1, CO, DA1, CO},
		{DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, CO, CO, CO, CO, CO, CO},
		{CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, DA1, CO, DA1, CO},
		{DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, CO, CO, CO, CO},
		{CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, DA1, CO},
		{DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, DA1, CO, CO, CO},
		{CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO, CO}

};

public Hinh() throws IOException {
	hero = new Hero();
	tmp =0;
	count=0;// chinh vong lap boom
	countTmp=0; // chinh vong lap hero chet
	booms = new ArrayList<>();
	boomNo = new ArrayList<>();
	controller = ControllerHero.getInstance();
	controllerBoom = ControllerBoom.getInstance();
	image = new HinhAnh();
	timeBoom = new Timer(500, new ThoiGianBom());
//	timeBoom.stop();
	itemBom = new ItemBom(9, 10);

	itemLua = new ItemHeart(15, 16);
	itemHeart = new ItemLua(5, 6);
}
@Override
	protected void paintComponent(Graphics g) {
		g =(Graphics2D) g; 
		for ( i = 0; i < DODAI; i++) {
			for ( j = 0; j < DODAI; j++) {
				switch (map[i][j]) {
				case CO:
					General.veHinh(HinhAnh.co, i, j, g);
					break;
				case BUICO:
					General.veHinh(HinhAnh.buiCo, i, j, g);
					break;
				case DA1:
					General.veHinh(HinhAnh.da1, i, j, g);
					break;
				case DA2:
					General.veHinh(HinhAnh.da2, i, j, g);
					break;
				case DA3:
					General.veHinh(HinhAnh.da3, i, j, g);
					break;
				case DA4:
					General.veHinh(HinhAnh.da4, i, j, g);
					break;
				case DA5:
					General.veHinh(HinhAnh.da5, i, j, g);
					break;
				case THUNG:
					General.veHinh(HinhAnh.thung1, i, j, g);
					break;
				case NUOC:
					General.veHinh(HinhAnh.nuoc, i, j, g);
					break;
				default:
					break;
				}
			}
		}
		if(diLen){
			controller.veHero(image.nhanVatXoayLen, hero.getxHero(), hero.getyHero(),g);
		}
		if(diXuong){
			controller.veHero(image.nhanVatXoayXuong, hero.getxHero(), hero.getyHero(),g);
		}
		if(sangTrai){
			controller.veHero(image.nhanVatXoayTrai, hero.getxHero(), hero.getyHero(),g);
		}
		if(sangPhai){
			controller.veHero(image.nhanVatXoayPhai, hero.getxHero(), hero.getyHero(), g);
		}
		veBoom(g);
		
		itemHeart.veItem(g);
			itemBom.veItem(g);
			itemLua.veItem(g);
			if(hero.isNhanIteam(itemBom)){
				itemBom.veLaiItem();
			}
			if(hero.isNhanIteam(itemLua)){
				itemLua.veLaiItem();
			}
			if(hero.isNhanIteam(itemHeart)){
				itemHeart.veLaiItem();
			}
		
		repaint();
	}
public void veBoom(Graphics g){
	if(datBoom){
		for (Boom boom : booms) {
			controllerBoom.veBoom(boom.getxBom(), boom.getyBom(), g, hero.getLevelBom());
		}
		for ( i = 0; i < boomNo.size(); i++) {
			itemBom.isXuatHien(boomNo.get(i).getxBom(),boomNo.get(i).getyBom(), hero.getLevelBom());
			itemHeart.isXuatHien(boomNo.get(i).getxBom(),boomNo.get(i).getyBom(), hero.getLevelBom());
			itemLua.isXuatHien(boomNo.get(i).getxBom(),boomNo.get(i).getyBom(), hero.getLevelBom());
			controllerBoom.noBom(boomNo.get(i).getxBom(), boomNo.get(i).getyBom(), g, map,hero.getLevelBom());
			if(!hero.isChet() && countTmp <1){
			controller.chet(boomNo.get(i).getxBom(), boomNo.get(i).getyBom());
			System.out.println(hero.getSinhLuc());
			if(hero.isChet()){
				JOptionPane.showConfirmDialog(null, "YOU LOSE");
			}
		}
			countTmp++;
	}
	}
}
@Override
public void keyTyped(KeyEvent e) {
}
@Override
public void keyPressed(KeyEvent e) {
 tmp = e.getKeyCode();
switch (tmp) {
case KeyEvent.VK_UP:
	if(!diLen){
		// neu chua di len thi doi huong
		// neu di len roi thi thay doi toa do
	diLen = true;
	diXuong = false;
	sangTrai = false;
	sangPhai = false;
	}
	else{
		tmp=controller.di(hero.getyHero(), false);
		if(controller.kiemTraDiChuyenDuoc(hero.getxHero(),tmp ,map)){
		hero.setyHero(tmp);
		}
	}
	break;
case KeyEvent.VK_DOWN:
	if(!diXuong){
	diLen = false;
	diXuong = true;
	sangTrai = false;
	sangPhai = false;
	}
	else {
		tmp=controller.di(hero.getyHero(), true);
		if(controller.kiemTraDiChuyenDuoc(hero.getxHero(),tmp ,map)){
			hero.setyHero(tmp);
			}
	}
	break;
case KeyEvent.VK_LEFT:
	if(!sangTrai){
	diLen = false;
	diXuong = false;
	sangTrai = true;
	sangPhai = false;
}
	else {
		tmp=controller.di(hero.getxHero(), false);
		if(controller.kiemTraDiChuyenDuoc(tmp,hero.getyHero(),map )){
			hero.setxHero(tmp);
			}
	}
	break;
case KeyEvent.VK_RIGHT:
	if(!sangPhai){
	diLen = false;
	diXuong = false;
	sangTrai = false;
	sangPhai = true;
	}
	else {
		tmp=controller.di(hero.getxHero(), true);
		if(controller.kiemTraDiChuyenDuoc(tmp,hero.getyHero(),map )){
			hero.setxHero(tmp);
			}
	}
	break;
case KeyEvent.VK_SPACE:
		controllerBoom.kiemTraBoom(hero.getxHero(), hero.getyHero(),hero.getLevelBom());
		if(controllerBoom.isDatDuoc){
		datBoom = true;
		timeBoom.start();
		countTmp  =0;
	
	try {
	boom = new Boom(hero.getxHero(), hero.getyHero());
	} catch (Exception e1) {
//		e1.printStackTrace();
	}
	booms.add(boom);
	break;
}
		else {
			JOptionPane.showConfirmDialog(null, "Dat Khong Duoc");
		}
}
}



@Override
public void keyReleased(KeyEvent e) {
}
private class ThoiGianBom implements ActionListener {
public ThoiGianBom() throws IOException {
}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		if (count % 2 == 0 && booms.size()>0) {
			boomNo.add(booms.remove(0));
		}
		if (count % 2 == 1 && boomNo.size()>0) {
			boomNo.remove(0);
			count =0;
		}
		
}
}
}
