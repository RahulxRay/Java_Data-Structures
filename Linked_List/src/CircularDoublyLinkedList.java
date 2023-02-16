/*public class CircularDoublyLinkedList {

    public void delete(int data){
        if (head == null){
            return;
        }
        if (head.data == data){
            head = head.next;
            head.prev = null;
        }

        DoublyLinkedList.Node current = head;
        while (current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
                current.next.next.prev = current;
                return;
            }
            current = current.next;
        }
}
*/