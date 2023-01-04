
public class Main {
    public static void main(String[] args) {
        Arrays arr=new Arrays(3);
        arr.append(3);
        arr.append(4);
        arr.append(5);
        arr.append(6);
        arr.append(3);
        arr.append(4);
        arr.append(5);
        arr.append(6);
        arr.itemat(2);
        arr.print();
        System.out.println("--------------");
        arr.delete();
        arr.print();
        arr.removeat(3);
        arr.print();

    }
}