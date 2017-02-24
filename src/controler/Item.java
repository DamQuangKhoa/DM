package controler;

import java.awt.Graphics;
import java.util.Random;

import javax.transaction.xa.Xid;

import model.General;

public abstract class Item {
	protected int xItem;
	protected int yItem;
	public  boolean xuatHien = false;
	public  boolean nhanChua= false;
	Random rd = new Random();
	public Item(int xItem, int yItem) {
		super();
		this.xItem = xItem;
		this.yItem = yItem;
	}
	
	public int getxItem() {
		return xItem;
	}

	public void setxItem(int xItem) {
		this.xItem = xItem;
	}

	public int getyItem() {
		return yItem;
	}

	public void setyItem(int yItem) {
		this.yItem = yItem;
	}

	public  void isXuatHien(int x,int y,int levelBom) {
		for (int i = 0; i <= levelBom; i++) {
			if(((x+i)== xItem && y == yItem) || ( (x-i) == xItem && y == yItem )
					|| (x== xItem && (y+i) == yItem) || (x== xItem && (y-i) == yItem)   ){
				xuatHien= true;
				return;
		}
		}
	}

	public  void setXuatHien(boolean xuatHien) {
		xuatHien = xuatHien;
	}

	public  boolean isNhanChua() {
		return nhanChua;
	}

	public  void setNhanChua(boolean nhanChua) {
		nhanChua = nhanChua;
	}

	public abstract void veItem(Graphics g);
	public void veLaiItem(){
		xuatHien = false;
		xItem = rd.nextInt(General.KICHTHUOCKHUNG);
		yItem = rd.nextInt(General.KICHTHUOCKHUNG);
	}
} 
