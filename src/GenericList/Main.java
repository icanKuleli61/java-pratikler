package GenericList;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> m = new MyList<>();
        m.add(1);
        m.add(2);
        m.add(3);
        m.print();
        m.add(20);
        m.add(30);
        m.add(60);
        m.add(70);
        m.add(80);
        m.add(90);
        m.add(100);
        m.add(120);
        m.print(5);



    }
}


