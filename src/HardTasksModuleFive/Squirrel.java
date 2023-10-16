package HardTasksModuleFive;

public class Squirrel {
	int [] nuts;

	public Squirrel(int[]nuts){
		this.nuts = nuts;
	}

	public int getNuts(int index){
		return nuts[index];
	}

//	Squirrel s4 = new Squirrel(new int[] {-2, 2, 4, -6, -2, -1, -2, -1});

	public int maxNuts(){
		int maxNuts = 0;

		if(nuts.length > 0){

			if (nuts[0] > 0){
				maxNuts += nuts[0];
			}

			for (int i = 0; i < nuts.length - 2; i++) {
				if (nuts[i + 1] < 0 && nuts[i + 1] <= nuts[i + 2]) {
					i++;
				}
				maxNuts += nuts[i + 1];
				if (maxNuts < 0) maxNuts = 0;

				if (nuts.length - 2 == i && nuts[i+1] > nuts[i+2]){
					maxNuts += nuts[i+1];
				}
//				else{
//					maxNuts += nuts[i+2];
//				}
			}

		}

		else if (nuts[0] >= 0) return maxNuts = nuts[0];
		else return 0;

		return maxNuts;
	}
}


//конструктор, в который подают массив nuts ( в каждой ячейке которого хранится значение n, если n — положительное, то на пеньке с таким индексом белочка найдет n орешков, если отрицательное, то на этом пеньке белочка потеряет n орешков);
//		метод getNuts(int index), возвращает число — сколько найдет или потеряет белочка на пеньке с индексом n;
//		метод maxNuts(), также возвращает число — какое максимальное число орешков белочка донесет до дома.