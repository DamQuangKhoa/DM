package model_item;

import java.awt.Graphics;

import controler.Item;
import model.General;
import view.HinhAnh;

public class ItemLua extends Item{

	public ItemLua(int xItem, int yItem) {
		super(xItem, yItem);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void veItem(Graphics g) {
		if(super.xuatHien)
General.veHinh(HinhAnh.itemLua, xItem, yItem, g);
	}


}
