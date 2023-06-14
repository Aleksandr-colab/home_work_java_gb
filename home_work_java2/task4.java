package home_work_java2;


    

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * К калькулятору из предыдущего дз добавить логирование.
1 + 3 = 4
 */

 public class task4 {
    public static void main(String args[]){
        Logger logger = Logger.getLogger("MyLogger");
        logger.setLevel(Level.INFO);
        ConsoleHandler info = new ConsoleHandler();
        logger.addHandler(info);
        Scanner sc = new Scanner(System.in, "Cp866");
        SimpleFormatter sf = new SimpleFormatter();
        info.setFormatter(sf);
        System.out.print("Ввод числа ->");
        int first = sc.nextInt();
        System.out.print("Ввод знака ->");
        String zn = sc.next();
        System.out.print("Ввод числа ->");
        int second = sc.nextInt();
        sc.close();
        if (zn.equals("+")) {
            System.out.println((first+second));
            logger.log(Level.INFO, "сложение");}
        else if (zn.equals("-")) {
            System.out.println(first-second);
            logger.log(Level.INFO, "вычитание");}
        else if (zn.equals("*")) {
            System.out.print(first*second);
            logger.log(Level.INFO, "умножение");}
        else if (zn.equals("/")) {
            System.out.print(first/second);
            logger.log(Level.INFO, "деление");}

    }
}