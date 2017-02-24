package controler;

import java.awt.Graphics;
import java.io.IOException;

import view.HinhAnh;

public abstract class ABoom implements BoomMethod {
	protected int xBom,yBom;
	ControllerHero heroControl;
	public ABoom(int x,int y) throws IOException  {
		super();
		xBom =x;
		yBom= y;
		heroControl = ControllerHero.getInstance();
	}
	public ControllerHero getHeroControl() {
		return heroControl;
	}

	public void setHeroControl(ControllerHero heroControl) {
		this.heroControl = heroControl;
	}

	public int getxBom() {
		return xBom;
	}
	public void setxBom(int xBom) {
		this.xBom = xBom;
	}
	public int getyBom() {
		return yBom;
	}
	public void setyBom(int yBom) {
		this.yBom = yBom;
	}
	@Override
//	public abstract void datBom(int x, int y, Graphics g) ;
//	
//	@Override
	public abstract void noBom(int x, int y,Graphics g, int[][] map,int levelBom) ;
	
	@Override
	public String toString() {
			return "xBom=" + xBom + ", yBom=" + yBom ;
		}


}
