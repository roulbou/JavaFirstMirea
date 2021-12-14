package ru.mirea.task28.opt2;

public class Test {
    public static void main(String[] args) {
        System.out.println("Создадим проверку для анонимного класса");
        Action action=new Action("Samsung", 10);
        System.out.println(action.toString());
        Sale sale = new Sale() {
            @Override
            public void access() {
                System.out.println("Покупка невозможна. Проверьте баланс");
            }
        };
        sale.access();

        Action action1=new Action("Magnit", 15);
        System.out.println(action1.toString());
        Sale sale1 = new Sale() {
            @Override
            public void access() {
                System.out.println("Покупка совершена");
            }
        };
        sale1.access();

    }
}