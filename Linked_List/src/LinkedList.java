public class LinkedList {

    private Node head; // This identifies first node in the list

    private static class Node{
        private int data; // The data stored in the node
        private Node next; // The next node in the list

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data){
        Node newnode = new Node(data);

        if (head == null){
            head = newnode;
        }else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }

    public void delete(int data){
        if (head == null){
            return;
        }
        if (head.data == data){
            head = head.next;
        }

        Node current = head;
        while (current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void print() {
        Node current = head;
        while (current != null){
            System.out.print(current.data);
            System.out.print(" ");
            current = current.next;
        }
        System.out.println();
    }



}
