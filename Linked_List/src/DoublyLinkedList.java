public class DoublyLinkedList {

    Node head;

    private static class Node{
        private int data;
        private Node next;
        private Node prev;


        public Node(int data){
            this.data = data;
            this.next = null;
        }


    }

    public void add(int data){

        Node newnode = new Node(data);

        if (head == null){
            head = newnode;
            head.prev = null;
        }else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newnode;
            newnode.prev = current;
        }
    }

    public void delete(int data){
        if (head == null){
            return;
        }
        if (head.data == data){
            head = head.next;
            head.prev = null;
        }

        Node current = head;
        while (current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
                if (current.next != null) {
                    current.next.prev = current;
                }
                return;
            }
            current = current.next;
        }
    }

    public void print() {
        Node current = head;
        while (current != null){
            if (current.prev != null) {
                System.out.println("Node Prev: " + current.prev.data);
            }else {
                System.out.println("Node Prev: null");
            }
            System.out.println("Node Data: " + current.data);
            if (current.next != null) {
                System.out.println("Node Next: " + current.next.data);
            }else{
                System.out.println("Node Next: null");
            }
            System.out.println("");
            current = current.next;
        }
        System.out.println();
    }
}
