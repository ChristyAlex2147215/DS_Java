import java.util.Arrays;

public class ExecStackWithLL {
    public static void main(String[] args) {
        var sll=new StackWithLL();
        sll.push("1");
        sll.push("2");
        sll.push("3");
        sll.push("4");
        sll.push("5");
        sll.push("6");
        sll.pop();
        sll.pop();
        System.out.println("Array is: "+ Arrays.toString(sll.printAll()));
        sll.push("1");
        System.out.println("Array is: "+ Arrays.toString(sll.printAll()));


    }
}
