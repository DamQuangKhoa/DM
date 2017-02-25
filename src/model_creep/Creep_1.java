package model_creep;

import java.awt.Graphics;

import model.General;
import view.HinhAnh;

public class Creep_1 extends Creep{

	public Creep_1(int xCreep, int yCreep) {
		super(xCreep, yCreep);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void veCreep(Graphics g) {
		General.veHinh(HinhAnh.da5, xCreep, yCreep, g);		
	}

}
