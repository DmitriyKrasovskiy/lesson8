package DZ92_23_Bankomat;


import java.util.Locale;
import java.util.Scanner;
import java.util.ResourceBundle;

import static DZ92_23_Bankomat.ATM.*;

public class Main {


    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("ATMBundle");
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose language: Russian [RU] English [EN]");
        selectLanguage(scanner.nextLine());


        Scanner in = new Scanner(System.in);
        //задаём начальное количество купюр в банкомате
        while (true) {
            try {
                System.out.println(resourceBundle.getString("Quantitybanknotes20"));
                ATM.number2011 = Math.abs(Integer.parseInt(in.nextLine()));
                sum21 = ATM.number2011*20;
                System.out.println(sum21);
                if(number20<0){
                    System.out.println(resourceBundle.getString("quantitymustbe>0"));
                } else {break;}
            } catch (Exception e){
                System.out.println(resourceBundle.getString("Incorrectvalue"));
            }
        }//проверка начальных значений колличества купюр на корректность
        while (true) {
            try {
                System.out.println(resourceBundle.getString("Quantitybanknotes50"));
                ATM.number5011 = Math.abs(Integer.parseInt(in.nextLine()));
                sum51 = ATM.number2011*50;
                if(ATM.number50<0){
                    System.out.println(resourceBundle.getString("quantitymustbe>0"));
                } else {break;}
            } catch (Exception e){
                System.out.println(resourceBundle.getString("Incorrectvalue"));
            }
        }//проверка начальных значений колличества купюр на корректность
        while (true) {
            System.out.println(resourceBundle.getString("Quantitybanknotes100"));
            try {
                ATM.number10011 = Math.abs(Integer.parseInt(in.nextLine()));
                sum101 = ATM.number10011*100;
                if(ATM.number100<0){
                    System.out.println(resourceBundle.getString("quantitymustbe>0"));
                } else {break;}
            } catch (Exception e){
                System.out.println(resourceBundle.getString("Incorrectvalue"));
            }
        }//проверка начальных значений колличества купюр на корректность


        boolean isRunning = true;
        ATM ATM = new ATM();
        while (isRunning) {
            System.out.println(resourceBundle.getString("Pleaseselectcommand"));
            System.out.println(resourceBundle.getString("insertwithdrawalexit"));
            Scanner scanner1 = new Scanner(System.in);
            String command = scanner1.nextLine();

            switch (command) {

                case "M":
                case "m":
                    enterBanknotes(ATM,scanner1);
                    ATM.countBankNotes();
                    break;

                case "W":
                case "w":
                    int requiredAmount=readInteger(scanner1, resourceBundle.getString("Entersum"));
                    ATM.wMoney(requiredAmount);
                    break;
                case "E":
                case "e":
                    isRunning = false;
                    break;
                default:
                    System.out.println(resourceBundle.getString("Youcommandiswrong"));
                    break;
            }
        }
    }

    private static int readInteger(Scanner scanner, String message) {
        int a = 0;
        do {
            System.out.println(message);
            String a1 = scanner.nextLine();
            try {
                a = Integer.parseInt(a1);
            } catch (NumberFormatException e) {
            }
            if (a == 0) {
                System.out.println(resourceBundle.getString("Enterthecorrectsumm"));
            } else {
                return a;
            }
        } while (true);
    }
    private static void enterBanknotes(ATM ATM, Scanner scanner) {
        do {
            System.out.println(resourceBundle.getString("Insertbanknoteorcancel"));
            String bankNotes = scanner.nextLine();
            if ("C".equals(bankNotes)) break;
            if ("c".equals(bankNotes)) break;

            int amount = 0;
            switch (bankNotes) {
                case "20":
                    amount = 20;
                    break;
                case "50":
                    amount = 50;
                    break;
                case "100":
                    amount = 100;
                    break;
            }

            if (amount == 0) {
                System.out.println(resourceBundle.getString("Pleaseinsertmoneyagain"));
            } else {
                switch (amount) {
                    case 20:
                        ATM.acceptBankNotes20(new Banknote(amount, "BYN"));
                        break;
                    case 50:
                        ATM.acceptBankNotes50(new Banknote(amount, "BYN"));
                        break;
                    case 100:
                        ATM.acceptBankNotes100(new Banknote(amount, "BYN"));
                        break;
                }
            }
        }while(true);
    }


    private static void selectLanguage(String language){
            switch (language) {
                case "ru":
                case "RU":
                    {
                    resourceBundle = ResourceBundle.getBundle("ATMBundle", new Locale("ru", "RU"));
                    break;
                }
                case "en":
                case "EN": {
                    resourceBundle = ResourceBundle.getBundle("ATMBundle", Locale.US);
                    break;
                }
                default: {
                    System.out.println("Wrong choice. The language is set to default");
                    resourceBundle = ResourceBundle.getBundle("ATMBundle");
                }
            }
    }
}