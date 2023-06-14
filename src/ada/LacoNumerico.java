package ada;

public class LacoNumerico {

	public static void main(String[] args) {
		
		//laços aninhados = laço for dentro de outro
		//dois laços aninhados é bem comum, mas muitos laços um dentro do outro não é uma boa prática
		
		for(int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(j + " X " + i + " = " + j * i);
			}
		}
	}
}
