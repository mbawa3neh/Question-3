package com.MB;

public class Main {

    public static void main(String[] args) {


            String PhoneMake;
            String PhoneModel;
            Integer PhoneYear;


            Phone myPhone = new Phone();

            Scanner sc = new Scanner(System.in);

            System.out.print("Input the phone make:");
            PhoneMake = sc.nextLine();
            System.out.println();
            myPhone.setMake(PhoneMake);

            System.out.print("Input the phone model:");
            PhoneModel = sc.nextLine();
            System.out.println();
            myPhone.setModel(PhoneModel);

            System.out.print("Input the phone year:");
            PhoneYear = Integer.parseInt (sc.nextLine() );
            System.out.println();
            myPhone.setYear(PhoneYear);



            System.out.println(myPhone.ToString());

            if (myPhone.isObsolete() == true)
                System.out.println("This is an Obsolete model.");
            else
                System.out.println("This is a new model.");


        }
}
