/*
	Alfredo Palacios Olagaray
	6 November 2018
	Learning two dimensions arrays
*/
public class TwoDimensions{
	public static void main(String[] args) {
		
		int x=0, y=0;

		int[][]table=new int[10000][10000];

		//System.out.println(table[1][1]);
		for (y=0; y<table.length; y++) {
			for (x=0; x<table[y].length; x++) {
				table[y][x]=y+x;
			}
			
		}

		for (y=0; y<table.length; y++) {
			for (x=0; x<table[y].length; x++) {
				System.out.print("[" + table[y][x] + "]");
			}//close x loop
			System.out.println();
		}//close y loop
	}
}