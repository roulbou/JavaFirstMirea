package ru.mirea.task28.opt1;

//реализуем статический вложенный класс по операции покупки

import java.util.HashMap;

public class Bank {

    static  class Account{
        private String id;
        private String name;
        private int money;

    }

    public static class Banker{
        public Bank createBank(){
            return new Bank();
        }
    }

    public Bank(){}

    HashMap<String, Account> accounts = new HashMap<String,Account>();

    public void openAccount(String id, String name){
        Account account = new Account();
        account.id=id;
        account.name=name;
        accounts.put(id,account);
        System.out.println("Данные пользователя:"+id+", "+name);
    }

    public void putMoney(String id, int money){
        Account account=accounts.get(id);
        if (account==null){
            return;
        }
        System.out.println("Было внесено:");
        System.out.println(account.money+=money);
    }

    public void buyStocks(String id, int money){
        Account account=accounts.get(id);
        if (account==null){
            return;
        }
        System.out.println("Счет после покупки");
        System.out.println(account.money-=money);
    }

}