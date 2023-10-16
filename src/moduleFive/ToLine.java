package moduleFive;

public class ToLine {
	private int [][] data;

	public ToLine(int[][] data) {
		this.data = data;
	}

	public int[] resize(){
		int arrayLength = data.length * data[0].length;
		int[] array = new int[arrayLength];
		int index = 0;

		for (int i = 0; i < data.length; i++){
			for (int j = 0; j < data[0].length; j++){
				array[index] = data[i][j];
				index++;
			}
		}
		return array;
	}
}
