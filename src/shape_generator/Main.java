package shape_generator;

import java.util.Scanner;

public class Main {

    /*
        Açıklama:

        Bir grafik sistemi geliştirilmektedir. Sistem farklı
        geometrik şekiller oluşturabilmektedir.

        Desteklenen şekiller:

        - Circle
        - Rectangle
        - Triangle

        Kullanıcı oluşturmak istediği şekli seçer.
        Sistem seçime göre doğru şekil nesnesini Factory Pattern
        kullanarak oluşturur.

        Oluşturulan şekil için aşağıdaki işlemler yapılmalıdır:

        - Alan hesaplama
        - Çevre hesaplama

        Her şekil kendi alan ve çevre hesaplama algoritmasını
        içermelidir.

        Önemli Kurallar:

        - Main class içinde new Circle(), new Rectangle() gibi
          nesneler doğrudan oluşturulmamalıdır.

        - Şekil nesneleri ShapeFactory class tarafından
          oluşturulmalıdır.

        - Sistem yeni bir şekil eklendiğinde mevcut kod
          değiştirilmeden genişletilebilmelidir.

        Amaç:

        Factory Pattern kullanarak object creation işlemini
        merkezi bir yerde toplamak ve polymorphism kullanarak
        her şeklin kendi hesaplama algoritmasını çalıştırmasını
        sağlamaktır.


        Örnek Senaryo:

        Input:
        Shape = Circle
        Radius = 5

        Output:
        Shape: Circle
        Area: 78.5
        Perimeter: 31.4


        Input:
        Shape = Rectangle
        Width = 4
        Height = 6

        Output:
        Shape: Rectangle
        Area: 24
        Perimeter: 20
    */

    private static int shapeSecim(Scanner sc){
        int secim;
        boolean isFlag = false;
        System.out.println("Oluşturmak istediğiniz Şekli Seciniz");
        System.out.println("-------------------");
        do {
            if (isFlag){
                System.out.println("Hatalı secim yaptınız tekrar deneyiniz.");
            }
            System.out.println("1- Daire\n2- Dikdörtgen\n3- Ücgen");
            System.out.print("Secim : ");
            isFlag = true;
            secim = sc.nextInt();
        }while (secim < 1 || secim > 3);
        return secim;
    }




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int secim = shapeSecim(sc);

        switch (secim){
            case 1:
                System.out.print("Daire icin bir radius değeri giriniz : ");
                int radius = sc.nextInt();
                new ShapeService(new Circle(radius));
                break;
                case 2:
                    System.out.print("Dikdörtgen icin bir kısa kenar değeri giriniz : ");
                    int kisaKenar = sc.nextInt();
                    System.out.print("Dikdörtgen icin bir kısa kenar değeri giriniz : ");
                    int uzunKenar = sc.nextInt();
                    new ShapeService(new Rectangle(kisaKenar,uzunKenar));
                    break;
                    case 3:
                        int[] kenar= new int[3];
                        for (int i = 0; i < 3; i++){
                            System.out.println("Ücgenin "+i+". kenarını giriniz : ");
                            kenar[i] = sc.nextInt();
                            sc.nextLine();
                        }
                        new ShapeService(new Triangle(kenar[0],kenar[1],kenar[2]));
                        break;

        }


    }
}
