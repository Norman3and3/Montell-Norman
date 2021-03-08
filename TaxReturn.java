/*
Problem Defintion
Create a TaxReturn class with fields that hold a taxpayer’s Social Security number, last name, first name, street address, city, zip code, marital status, annual income, and tax liability. 
Include a constructor that requires arguments that provides values for all the fields other than the tax liability. 
Then calculate the tax liability based on annual income and the percentage shown below:
Income               Single                Married 
0-20,000              15%                    14% 
20,001-50,000         22%                    20% 
50,001 and over       30%                    28% 
In the TaxReturn class, also include a display method that displays all the TaxReturn data. 
Save the file as TaxReturn.java. 
Author: Montell N.
Date: 3/4/21
 */
package preparetax;

public class TaxReturn {
    //variables
    private String socialSN;
    private String lName;
    private String fName;
    private String address;
    private String city;
    private int zip;
    private char mStatus;
    private double income;
    private double tax;
    
    //Constructor
    public TaxReturn(String socialSN, String lName, String fName, String address, String city,
            int zip, char mStatus, double income){
        this.socialSN = socialSN;
        this.address = address;
        this.city = city;
        this.lName = lName;
        this.fName = fName;
        this.zip = zip;
        this.mStatus = mStatus;
        this.income = income;
        tax = TaxLiability(); //Calling TaxLiability method
        
    }

    public double TaxLiability(){
        if(income <= 20000){
            if(mStatus == 'S' || mStatus == 's'){
                return income * 0.15;
            }
            else{
                return income * 0.14;
            }
        }
        
        else if(income >= 20001 && income <= 50000){
            if(mStatus == 'S' || mStatus == 's'){
                return income * 0.22;
            }
            else{
                return income * 0.20;
            }
        }
        
        else{
            if(mStatus == 'S' || mStatus == 's'){
                return income * 0.30;
            }
            else{
                return income * 0.28;
            }
        
        }
    }
    
    //Display method
    public void displayTaxData(){
        System.out.println("Your SSN is: " + socialSN);
        System.out.println("Your address: " + address);
        System.out.println("The place you live in is: " + city);
        System.out.println("Your last name is: " + lName);
        System.out.println("Your first name is: " + fName);
        System.out.println("Your zip code is: " + zip);
        System.out.println("Your income is: " + income);
        System.out.println("Your tax liability is: " + tax);
        if(mStatus == 'S' || mStatus == 's'){
                System.out.println("You are single!");
            }
            else{
                System.out.println("You are married!");
            }
        
    }
}
