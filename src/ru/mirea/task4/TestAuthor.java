package ru.mirea.task4;

public class TestAuthor {
    public static void main(String [] args){
        Author ob1 = new Author("aziz", "aziz1232@gamil.com", 'M');
        Author ob2 = new Author("ben", "ben1232@gamil.com", 'M');
        Author ob3 = new Author("hidjab", "hidjab@gamil.com", 'M');
        System.out.println(ob1);
        ob1.setName("abeche");
        System.out.println(ob1);
    }
}