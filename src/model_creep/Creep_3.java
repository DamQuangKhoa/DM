package model_creep;

import java.awt.Graphics;

import model.General;
import view.HinhAnh;

public class Creep_3 extends Creep{

	public Creep_3(int xCreep, int yCreep) {
		super(xCreep, yCreep);
	}

	@Override
	public void veCreep(Graphics g) {
		General.veHinh(HinhAnh.da5, xCreep, yCreep, g);
	}

}
