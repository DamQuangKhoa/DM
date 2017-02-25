package model_creep;

import java.awt.Graphics;

import model.General;
import view.HinhAnh;

public class Creep_2 extends Creep {

	public Creep_2(int xCreep, int yCreep) {
		super(xCreep, yCreep);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void veCreep(Graphics g) {
		General.veHinh(HinhAnh.da4, xCreep, yCreep, g);		
	}

}
