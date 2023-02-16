
public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        System.out.println("Remove 3");
        list.delete(3);
        list.print();
        System.out.println("Remove 1");
        list.delete(1);
        list.print();
    }
}
