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

}
