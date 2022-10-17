import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scannner = new Scanner(System.in);

		ListYapisi list = new ListYapisi();

		System.out.println("Lütfen 1.kelimeyi en az 5 harfli olacak şekilde giriniz");
		String birinci = scannner.nextLine();
		char[] textChar1 = birinci.toCharArray();

		for (int i = 0; i < textChar1.length; i++) {

			list.ekle(textChar1[i]);

		}

		list.tekrarlarıSil();
		// list.yazdir();

		list.dizibir();

		char[] dizi1_1 = new char[list.dizi1.length + 1];

		System.out.println();
		for (int i = 0; i < list.dizi1.length; i++) {
			for (int j = 0; j < list.dizi1.length; j++) {
				for (int m = 0; m < list.dizi1.length; m++) {
					for (int n = 0; n < list.dizi1.length; n++) {
						for (int k = 0; k < list.dizi1.length; k++) {

							dizi1_1[0] = list.dizi1[i];
							System.out.print(dizi1_1[0]);
							dizi1_1[1] = list.dizi1[j];
							System.out.print(dizi1_1[1]);
							dizi1_1[2] = list.dizi1[m];
							System.out.print(dizi1_1[2]);
							dizi1_1[3] = list.dizi1[n];
							System.out.print(dizi1_1[3]);
							dizi1_1[4] = list.dizi1[k];
							System.out.print(dizi1_1[4]);
							dizi1_1[5] = '\n';
							String son = String.valueOf(dizi1_1);

							list.txtAt(son);

							System.out.println();
						}
					}
				}
			}
		}

	}

}
