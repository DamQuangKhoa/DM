package controler;

import java.awt.Graphics;
import java.awt.Image;

public interface BoomMethod {
	public void veBoom(int x,int y, Graphics g,int levelBoom);
	public void noBom(int x, int y,Graphics g,int[][] map,int levelBom);
}
