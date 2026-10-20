package class_links.model;

import class_links.model.Account;

public class User {
    private String name = "";
    private short age = 20;
    private String telNumber = "123456789";
    private Account account = null;

    public User() {
        account = new Account(this);
    }

    public User(String name, short age, String telNumber) {
        this.name = name;
        this.age = age;
        this.telNumber = telNumber;
        this.account = new Account(this);;
    }

    public void changeName(String name){
        //
    }


    public void changeTelephoneNumber(String name){
        //
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", telNumber='" + telNumber + '\'' +
                ", account=" + account +
                '}';
    }
}
