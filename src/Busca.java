public class Busca {

	public static int binaria(int[] array, int valor) {
		int inicio = 0;
		int fim = array.length - 1;

		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;

			if (array[meio] == valor) {
				return meio;
			}

			if (valor > array[meio]) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		return -1;
	}

	public static int linear(Object[] vetor, Object elementoProcurado) {
		for (int i = 0; i < vetor.length; i++)
			if (vetor[i].equals(elementoProcurado))
				return i;
		return -1; // Não achou, retorna -1
	}

}
