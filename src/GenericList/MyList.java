package GenericList;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private int i = 0;
    private int boyut;
    private T[] myList;

    public MyList() {
        this.boyut = 10;
        myList = (T[]) new Object[boyut];
    }

    public MyList(int size) {
        myList = (T[]) new Object[size];
    }

    public void add(T item) {
        if (i == boyut) {
            T[] newList = (T[]) new Object[boyut * 2];
            this.boyut = boyut * 2;
            for (int j = 0; j < i; j++) {
                newList[j] = myList[j];
            }
            myList = newList;
        }
        myList[this.i++] = item;
    }

    public int getCapacity() {
        return myList.length;
    }

    public int getSize() {
        return boyut;
    }

    public T get(int index) {
        if (index >= 0 && index < i) {
            return myList[index];
        } else {
            System.out.println("Index: " + index + "Değeri boş");
            return null;
        }
    }

    public void print(){
        System.out.println("Kapasite: " + getCapacity());
        System.out.println("Boyut: " + getSize());
    }

    public void print(int index){
        System.out.println("Kapasite: " + getCapacity());
        System.out.println("Boyut: " + getSize());
        System.out.println(index+". Elaman " + get(index));
    }

}
