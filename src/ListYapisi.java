import java.io.FileWriter;
import java.io.IOException;

public class ListYapisi {
	Node head = null;
	Node tail = null;
	private char data;
	char[] dizi1;

	void ekle(char data) {
		Node eleman = new Node(data);

		if (head == null) {
			head = eleman;
			tail = eleman;
		} else {
			tail.next = eleman;
			eleman.prev = tail;
			tail = eleman;
		}

	}

	void tekrarlarıSil() {
		Node current, index, temp;

		for (current = head; current != null; current = current.next) {
			for (index = current.next; index != null; index = index.next) {
				if (current.data == index.data) {
					temp = index;
					index.prev.next = index.next;
					if (index.next != null) {
						index.next.prev = index.prev;
						temp = null;
					}
				}
			}
		}

	}

	int sonDiziLength() {
		int diziBoyut = 0;
		Node temp = head;
		while (temp != null) {
			diziBoyut++;
			temp = temp.next;
		}
		return diziBoyut;
	}

	void dizibir() {
		dizi1 = new char[sonDiziLength()];
		int i = 0;
		Node temp = head;
		while (temp != null && i < sonDiziLength()) {

			dizi1[i] = temp.data;
			temp = temp.next;
			i++;
		}

	}

	void txtAt(String str) {

		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\sinan\\Desktop\\brutteforcealgorithm\\sonuc.txt", true);
			myWriter.write(str);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	void yazdir() {
		Node temp = head;
		System.out.print("İlk :");
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println(" : Son");
	}

}
