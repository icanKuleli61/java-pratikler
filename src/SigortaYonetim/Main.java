package SigortaYonetim;

import SigortaYonetim.Police.CarInsurance;
import SigortaYonetim.Police.HealthInsurance;
import SigortaYonetim.Police.Insurance;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AccountManager accountManager = new AccountManager();

        ArrayList<Address> addresses1 = new ArrayList<>();
        ArrayList<Address> addresses2 = new ArrayList<>();

        // 3️⃣ User nesneleri oluştur
        User user1 = new User(
                "Ahmet",
                "Yılmaz",
                "1234",
                "ahmet@mail.com",
                "1234",
                "Mühendis",
                30,
                addresses1,
                new Date()
        );

        User user2 = new User(
                "Mehmet",
                "Kaya",
                "5678",
                "mehmet@mail.com",
                "5678",
                "Doktor",
                35,
                addresses2,
                new Date()
        );

        Individual individualAccount = new Individual(user1);
        Enterprise enterpriseAccount = new Enterprise(user2);

        accountManager.addAccount(individualAccount);
        accountManager.addAccount(enterpriseAccount);

        Address homeAddress = new HomeAddress("İstanbul Kadıköy Ev No: 5");
        Address businessAddress = new BusinessAddress("İstanbul Levent Ofis No: 10");

        individualAccount.addAddress(homeAddress);
        enterpriseAccount.addAddress(businessAddress);

        Insurance healthInsurance = new HealthInsurance("Özel Sağlık Sigortası", 1000.0, "08.09.2025", "08.09.2026");
        individualAccount.addInsurance(healthInsurance);

        Insurance carInsurance = new CarInsurance("Araç Sigortası", 1500.50, "08.09.2025", "08.09.2026");
        enterpriseAccount.addInsurance(carInsurance);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Şifre: ");
        String password = scanner.nextLine();

        Account loggedInAccount = accountManager.login(email, password);

        if (loggedInAccount != null) {
            System.out.println("Hoşgeldiniz, " + loggedInAccount.getUser().getUserName());
            loggedInAccount.showUserInfo();
        } else {
            System.out.println("Giriş başarısız!");
        }

        scanner.close();
    }
}
