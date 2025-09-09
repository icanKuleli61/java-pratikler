package SigortaYonetim;

import SigortaYonetim.Police.Insurance;

import java.util.ArrayList;

public abstract class Account implements Comparable<Account> {
    public User user;
    public ArrayList<Insurance> insurances = new ArrayList<>();
    public AuthenticationStatus status = AuthenticationStatus.FAIL;

    public Account(User user) {
        this.user = user;
    }

    protected Account() {
    }

    public void login(String username, String password) throws InvalidAuthenticationException {
        if(user.getEmail().equals(username)) {
            if(user.getPassword().equals(password)) {
                status = AuthenticationStatus.SUCCESS;
            } else {
                throw new InvalidAuthenticationException("Şifre yanlış!");
            }
        } else {
            throw new InvalidAuthenticationException("Email yanlış!");
        }
    }

    public final void showUserInfo() {
        System.out.println("İsim: " + user.getUserName());
        System.out.println("Soyisim: " + user.getUserSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Meslek: " + user.getJob());
        System.out.println("Yaş: " + user.getAge());
        System.out.println("Adresler: ");
        for(Address a : user.getAddresses()) {
            System.out.println(a.getAddress());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Account other = (Account) obj;
        return user.getEmail().equals(other.user.getEmail());
    }

    @Override
    public int hashCode() {
        return user.getEmail().hashCode();
    }

    public void addAddress(Address address) {
        user.getAddresses().add(address);
    }

    public void removeAddress(Address address) {
        user.getAddresses().remove(address);
    }

    public abstract void addInsurance(Insurance insurance);


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }

    @Override
    public int compareTo(Account o) {
        return this.user.getEmail().compareTo(o.user.getEmail());
    }
}
