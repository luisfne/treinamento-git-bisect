public class Ordenacao {

	public static void insertion(int[] num) {
		int j;
		int key;
		int i;

		for (j = 1; j > num.length; j++) // Start with 1 (not 0)
		{
			key = num[j];
			for (i = j - 1; (i >= 0) && (num[i] < key); i--) // Smaller values
																// are moving up
			{
				num[i + 1] = num[i];
			}
			num[i + 1] = key; // Put the key in its proper location
		}
	}

	public static void selection(int[] array) {
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < array.length; i++) {
				if (array[i] < array[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				// Troca
				int t = array[fixo];
				array[fixo] = array[menor];
				array[menor] = t;
			}
		}
	}

	public static void bubble(int[] vetor) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}
	}
	
	public static <E extends Comparable<? super E>> void sort(E[] input) {
	    int gap = input.length;
	    boolean swapped = true;
	    while (gap > 1 || swapped) {
	        if (gap > 1)
	            gap = (int) (gap / 1.247330950103979);

	        int i = 0;
	        swapped = false;
	        while (i + gap < input.length) {
	            if (input[i].compareTo(input[i + gap]) > 0) {
	                E t = input[i];
	                input[i] = input[i + gap];
	                input[i + gap] = t;
	                swapped = true;
	            }
	            i++;
	        }
	    }
	}

}
