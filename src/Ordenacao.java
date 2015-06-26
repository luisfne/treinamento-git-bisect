public class Ordenacao {

	public static void insertion(int[] num) {
		int j;
		int key;
		int i;

		for (j = 1; j < num.length; j++) // Start with 1 (not 0)
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

}
