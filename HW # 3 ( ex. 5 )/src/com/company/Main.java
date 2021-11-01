package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        int min = 0;
        int max;
        int minim = 0;
        int maxim = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 3 числа з плаваючою крапкою від \"-5\" до \"5\": ");
        float [] check = new float[3];

        while(true) {
            if (sc.hasNextFloat()){
                for (int i = 0; i < check.length; i++) {
                    check[i] = sc.nextFloat();
                }break;
            }else{
                System.out.println("Ви ввели не числове значення, попробуйте ще раз!");
                break;
            }
        }
        System.out.println("Ваші числа після перевірки: ");
        for(int i = 0; i< check.length; i++){
            if(check[i] >= -5 & check[i] <=5){
                System.out.println("Число номер "+count+") - "+ check[i]+ " входить в діапазон");
                count++;
            } else{
                System.out.println("Число номер "+count+") - "+ check[i]+ " не входить в діапазон");
                count++;}
        }
        // Зчитування int, виведення min / max числа
        System.out.println("Введіть 3 цілих числа : ");
        int [] intcheck = new int[3];
        while(true) {
            if (sc.hasNextInt()){
                for (int i = 0; i < intcheck.length; i++) {
                    intcheck[i] = sc.nextInt();
                }break;
            }else{
                System.out.println("Ви ввели не числове значення");
                break;
            }
        }
        // Cортування масиву
        for(int j = 0; j < intcheck.length; j++){
            for(int i = 0; i < intcheck.length-1;i++) {
                if (intcheck[i] > intcheck[i+1]) {
                    max = intcheck[i];
                    intcheck[i] = intcheck[i+1];
                    intcheck[i+1] = max;
                }
            }
        }
        System.out.println("Мінімальне значення "+ intcheck[0]);
        System.out.println("Максимальне значення "+ intcheck[intcheck.length-1]);
        ///////////////////////////////////////////////////////////////////////////

        enum ErrorCode{
            BAD_REQUEST(400),UNAUTORIZED(401), PAYMENT_REQUIRED(402),FORBIDDEN(403), NOT_FOUND(404);
            private int code;
            ErrorCode(int code){
                this.code = code;
            }
            public int getCode() {
                return code;
            }
        }
        System.out.println("Введіть число помилки ");
        int s  = sc.nextInt();
        for(ErrorCode e: ErrorCode.values()) {
            if (s == e.getCode()){
                System.out.println(e);
                sc.close(); //закриваю сканер
            }
        }

        Dog[] dog = new Dog[3];
        dog[0] = new Dog("Бобік", Dog.breed.Dachshund, 5);
        dog[1] = new Dog("Грізлі", Dog.breed.Pug, 2);
        dog[2] = new Dog("Чавс", Dog.breed.German_Shepherd, 3);

        int [] age = new int[dog.length];
        for(int i = 0; i< dog.length; i++){
            dog[i].dogInfo();
            age[i] = dog[i].getAge();}
        Arrays.sort(age);
        min = age[0];
        max = age[age.length-1];
        System.out.println("Мінімальний вік: "+min+" Максимальний вік: "+max);
        boolean same = false;
        for(int j = 0; j<dog.length; j++)
            if(dog[0].getName().equals(dog[j]) | dog[1].getName().equals(dog[j]) | dog[2].getName().equals(dog[j])){
                same = true;
            } else{same = false;}
        System.out.println(same);
    }
}

class Dog{
    private int age;
    private String name;

    private breed enBreed;
    private String translate;
    public int getAge() {
        return age; }
    public String getName() {
        return name; }

    enum breed{
        Pug("Мопс"), Dachshund("Такса"), German_Shepherd("Німецька вівчарка");
        private String tarnslate;
        breed(String translate){
            this.tarnslate = translate;
        }
    }
    public Dog(String name, breed enBreed, int age){
        this.name = name;
        this.age = age;
        this.enBreed = enBreed;
    }
    public void dogInfo(){
        System.out.println("Привіт, я песик" + ": "+name+", мій вік: "+age+", Моя порода: "+enBreed+", по українськи це звучить як: "+enBreed.tarnslate);
    }
}