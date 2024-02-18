package org.example.inputDataHolders;

import org.example.service.SmithNumberService;

import java.util.Scanner;
import java.util.logging.Logger;

public class SmithNumberHolder extends SmithNumberService {
    public static final SmithNumberHolder smithNumberHolder = new SmithNumberHolder();

    public static final Logger logger = Logger.getLogger(SmithNumberHolder.class.getName());

    public static void returnIfSmithNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("INSERT NUMBER YOU WANT TO CHECK: ");
        int number;
        try{
            number = scanner.nextInt();
            if (number < 0){
                System.out.println("SMITH NUMBER HAST TO BE INTEGER AND POSITIVE");
                throw new RuntimeException();
            }
            if (smithNumberHolder.isSmithNumber(number)){
                System.out.println("IT IS A SMITH NUMBER");
            }else {
                System.out.println("IT IS NOT A SMITH NUMBER");
            }
        } catch (Exception e){
            logger.warning(e.getMessage());
        }



    }
}
