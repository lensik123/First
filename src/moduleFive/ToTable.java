package moduleFive;

public class ToTable {

	private int [] data;
	private int x, y;

	public ToTable(int[] data, int x, int y) {
		this.data = data;
		this.x = x;
		this.y = y;
	}


	public int [][] resize(){
		int indexOffield = 0;
		int [][] array = new int [x][y];
		for (int i = 0; i < x; i++){
			for (int j = 0; j < y; j++){
				array[i][j] = data[indexOffield];
				indexOffield++;
			}
		}
		return array;
	}
}
