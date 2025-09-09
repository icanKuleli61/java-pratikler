package SigortaYonetim;

import java.util.TreeSet;

public class AccountManager {

    TreeSet<Account> accounts;

    public AccountManager() {
        accounts = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }


    public Account login(String email, String password) {
        for (Account account : accounts) {
            try {
                account.login(email, password);
                if (account.getStatus() == AuthenticationStatus.SUCCESS) {
                    System.out.println("Login başarılı: " + account.getUser().getUserSurname());
                    return account;
                }
            } catch (InvalidAuthenticationException e) {
                 System.out.println(e.getMessage());
            }
        }
        System.out.println("Giriş bilgileri hatalı veya kullanıcı bulunamadı.");
        return null;
    }
}
