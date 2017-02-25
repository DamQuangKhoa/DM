package view;

public class Map {
	public static final int CO=0,BUICO=1,CAY=2,DA1=3,DA2=4,DA3=5,DA4=6,DA5=7
			,THUNG=8,	NUOC=9;
	public static int[][] map1 = { 
			{ CO, CO, CAY, CAY, CAY, CAY, CAY, CO, CO, CO, CAY, CO, CO, CO, CAY, CO, CO, CO, CAY, CO },
			{ CAY, CO, CAY, CO, CO, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ DA1, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ CO, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ DA1, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ CO, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ DA1, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ CO, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ DA1, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ CO, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ DA1, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ CO, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ DA1, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ CO, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ DA1, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ CO, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ DA1, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ CO, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ CAY, CO, CO, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO, CAY, CO },
			{ CAY, CAY, CAY, CAY, CAY, CO, CO, CO, CAY, CO, CO, CO, CAY, CO, CO, CO, CAY, CO, CO, CO }

	};
	
		public static int[][] map2 = {
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

}
