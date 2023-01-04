import java.util.Arrays;
import java.util.NoSuchElementException;

class Node
{
    public int data;
    public Node next;

    public Node(int value)
    {
        this.data=value;
    }
}
public class LinkedList {
    static int size;

    public Node head;
    public Node tail;

    public void addLast(int value) {
        var node = new Node(value);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

    }

    public void addFirst(int value) {
        var node = new Node(value);
        if (head == null)
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }

    }

    public int indexof(int item) {
        int index = 0;
        Node current = head;

        while (current != null) {
            if (current.data == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;

    }

    public boolean contains(int item) {
        return indexof(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (head == tail) {
            head = tail = null;
            return;
        }
        var second = head.next;
        head.next = null;
        head = second;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (head == tail) {
            head = tail = null;
        }
        Node iterator = head;
        while (iterator.next != tail) {
            iterator = iterator.next;
        }
        if (iterator.next == tail) {
            System.out.println("Second last element found" + iterator);
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void printAll() {
        var temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp == null)
                return;
        }
        System.out.println(" ");
    }

    public int size() {
        int counter = 0;
        var temp = head;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        size = counter;
        return counter;
    }

    public String[] toArray() {
        var temp = head;
        int index = 0;
        String[] arr = new String[size()];
        while (temp != null) {
            arr[index++] = String.valueOf(temp.data);
            temp = temp.next;

        }
        return arr;
    }

    public void reverse() {
        if (isEmpty())
            return;
       var previous=head;
       var current=head.next;
       while(current!=null)
       {
           var next=current.next;
           current.next=previous;
           previous=current;
           current=next;
       }
       tail=head;
       tail.next=null;
       head=previous;

    }

    public int getKthFromTheEnd(int k)
    {
        if (isEmpty())
        {
            throw new IllegalStateException();
        }
        if(k>size || k<=0)
        {
            throw new IllegalArgumentException();
        }
        var first=head;
        Node second=head;
        for(int i=1;i<k;i++)
        {
            second=second.next;
            if(second==null)
                throw  new IllegalArgumentException();
        }
        while(second.next!=null)
        {
            first=first.next;
            second=second.next;
        }
        return first.data;
    }
}
