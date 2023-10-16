package moduleFive;
import java.util.ArrayList;


public class Separator {
	int [] array;

	public Separator(int[] array) {
		this.array = array;
	}

	public int [] even(){

		ArrayList<Integer> evenArray = new ArrayList<>();

		for (int i = 0; i < array.length; i++){
			if(array[i] % 2 == 0){
				evenArray.add(array[i]);
			}
		}

		int[] resultArray = new int[evenArray.size()];
		for (int i = 0; i < evenArray.size(); i++) {
			resultArray[i] = evenArray.get(i);
		}
		return resultArray;
	}

	public int [] odd(){

		ArrayList<Integer> oddArray = new ArrayList<>();

		for (int i = 0; i < array.length; i++){
			if(array[i] % 2 != 0){
				oddArray.add(array[i]);
			}
		}

		int[] resultArray = new int[oddArray.size()];
		for (int i = 0; i < oddArray.size(); i++) {
			resultArray[i] = oddArray.get(i);
		}
		return resultArray;
	}
}
