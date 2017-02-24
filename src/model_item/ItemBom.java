package model_item;

import java.awt.Graphics;

import controler.Item;
import model.General;
import view.HinhAnh;

public class ItemBom extends Item {

	public ItemBom(int xItem, int yItem) {
		super(xItem, yItem);
	}

	@Override
	public void veItem(Graphics g) {
		if(super.xuatHien)
		General.veHinh(HinhAnh.itemBomb, xItem, yItem, g);
		
	}

	

}
