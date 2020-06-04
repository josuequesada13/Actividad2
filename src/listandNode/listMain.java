package listandNode;

public class listMain {
	public static void main(String[] args){
		DoubleLL lista = new DoubleLL();
		lista.push(21);
		lista.push(5);
		lista.push(872);
		lista.push(55);
		lista.push(666);
		lista.push(75);
		DoubleLL.printList(lista.head);
		Node.selectionSort(lista.head);
		System.out.println();
		DoubleLL.printList(lista.head);
		System.out.println("Fin");
		}
		
	}

}
