import java.util.Arrays;
public class ExecLL {
    public static void main(String[] args) {
        var ll=new LinkedList();
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(6);
        ll.addFirst(0);
        System.out.println(ll.indexof(3));
        System.out.println(ll.contains(6));
        ll.printAll();
        ll.addLast(9);
        System.out.println(" ");
        ll.printAll();
        System.out.println(" ");
        System.out.println("Size of linked list is :"+ll.size());
        System.out.println(" ");
        System.out.println("Array is :"+Arrays.toString(ll.toArray()));
        for (String o:ll.toArray())
        {
            System.out.print(o+" ,");
        }
        System.out.println(" ");
        ll.reverse();
        System.out.println("Reversed ll Array is :"+Arrays.toString(ll.toArray()));
        System.out.println(" ");
        System.out.println(" 4 nd element form last is "+ll.getKthFromTheEnd(4));



    }
}
