package model;

import java.awt.Graphics;
import java.awt.Image;

public class General<T> {
	public static final int RONG= 600,CAO=600,KICHTHUOCVUONG =30,
			KICHTHUOCKHUNG=30,DODAI=20,MORONG=2;
public static void veHinh(Image img,int x,int y, Graphics g){
		g.drawImage(img,x*KICHTHUOCVUONG+MORONG, y*KICHTHUOCVUONG+MORONG, KICHTHUOCKHUNG, KICHTHUOCKHUNG,null);
	}
public static<T> void inMang(T[][] data){
	for ( int i = 0; i < data.length; i++) {
		for ( int j = 0; j < data.length; j++) {
			System.out.print(data[i][j]+"\t");
		}
		System.out.println();
	}
}
}
