package com.example;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=sc.nextLine();

        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        System.out.println("Enter your exam score: ");
        int marks=sc.nextInt();
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
        System.out.println("score:"+marks);

        if (marks>=90){
            System.out.println("Grade:A");
        }
        else if(marks>=80&&marks<90){
            System.out.println("Grade:B");
        }
        else if(marks>=70&&marks<80){
            System.out.println("Grade:C");
        }
        else if(marks>=60&&marks<70){
            System.out.println("Grade:D");
        }
        else{
            System.out.println("Grade:F");
        }
        
        
        if (age<25 && marks>=80 && marks<101){
        System.out.println("'Eligible for scholorship'");
        }
        else {
        System.out.println("'not eligible for scholorship");
        }
        

    }
    }


    

