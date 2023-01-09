public class ExecStackWithArray {
    public static void main(String[] args) {
        var St1=new StackWithArray(10);
        St1.push(1);
        St1.push(2);
        St1.push(3);
        St1.push(4);
        St1.push(5);
        St1.push(6);
        St1.pop(6);
        System.out.println(St1.printAll());

    }
}
