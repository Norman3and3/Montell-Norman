/*
Problem Defintion
Create an application that prompts a user for the data needed to create a TaxReturn. 
Continue to prompt the user for data as long as the information are true:
    SSN is not in the correct format with dashes and digits at the right place- for example, 999-99-9999. 

    The zip code is not five digits. 

    The marital status does not belong with one of the following: S, s, M, or m. 

    The annual income is negative 

After all the input data is correct, create a TaxReturn object and then display its values. Save the file as PrepareTax.java. 
Author: Montell N.
Date: 3/4/21
 */
package preparetax;

import java.util.Scanner;

public class PrepareTax {

    public static void main(String[] args) {
        //Ask for user input for all tax return data
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Social Security number in the format of 999-99-9999: "); //This is for SSN
        String socialSN = input.next();
        while(!isValidNumber(socialSN)){ //Checks to see if its true or false
            System.out.print("Enter your valid security number: ");
            socialSN = input.next();
        }
        
        System.out.print("Enter your last name: "); //This is for Last and First name
        String lName = input.next();
        System.out.print("Enter your first name: "); 
        String fName = input.next();
        
        System.out.print("Enter your address: "); //This is for address
        String address = input.next();
        
        System.out.print("Enter the city you're currently living in: "); //This is for city
        String city = input.next();
        
        System.out.print("Enter the zip code of the city you're in: "); //This is for the zip code
        int zip = input.nextInt();
        while(zip < 10000 || zip > 99999){ //Checks to see if its true or false
            System.out.print("Enter the correct zip code: ");
            zip = input.nextInt();
        }
        
        System.out.print("Enter your income: $"); //This is for income
        double income = input.nextDouble();
        while(income < 0){
            System.out.print("Enter your coreect income: $");
            income = input.nextDouble();
        }
        
        System.out.print("Enter your marital status: "); //This is for maritalStatus
        char mStatus = input.next().charAt(0);
        while(mStatus != 'S' && mStatus != 's' && mStatus != 'M' && mStatus != 'm'){ //Checks to see if its true or false
            System.out.print("Enter the correct marital status: ");
            mStatus = input.next().charAt(0);
        }
        
        //Create a tax return object
        TaxReturn tReturn = new TaxReturn(socialSN, lName, fName, address, city, zip, mStatus, income);
        
        //Invoke the object to the display method
        tReturn.displayTaxData();
    }
    
    //isValidNumber method
    private static boolean isValidNumber(String socialSN){
        if(socialSN.length() != 11){
            return false;
        }
        else{
            for(int i = 0; i < socialSN.length(); i++){
                if((i == 3 || i == 6) && socialSN.charAt(i) != '-'){
                    return false;
                }
                if(i != 3 && i != 6 && !Character.isDigit(socialSN.charAt(i))){
                    return false;
                }
            }
            
            return true;
        }
    }
    
}
