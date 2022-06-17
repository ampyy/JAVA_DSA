
public class MainClass {
	public static void main(String[] args) {
			LL l1 = new LL();
			l1.prepend(45);
			l1.prepend(15);
			l1.append(14);
			l1.append(89);
			l1.append(45);
			l1.deleteFirst();
			l1.deleteLast();
			l1.append(45);
			l1.insertnth(45,1);
			l1.insertnth(3, 4);
			l1.deletenth(3);
			l1.printList();
			
	}
}
