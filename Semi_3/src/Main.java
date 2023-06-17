
public class Main {
    public static void main(String[] args) {
        Linlist list = new Linlist();
        list.addFirst(1);

        list.addFirst(0);
        list.addLast(2);

        list.addLast(3);
        list.addLast(4);
        list.print();

        System.out.println();
//        list.print2(list.revers2());
        list.revers();
        list.print();


    }
}