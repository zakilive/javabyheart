package com.zakilive;

public class Employee {

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
    {
        if(finance==true)
        {
            double loanAmount=vehicle.getPrice()-cust.getCashOnHand();
            runCreditHistroy(cust,loanAmount);

        }
        else if (vehicle.getPrice()<=cust.getCashOnHand())
        {
            //customer pays in cash
            processTransaction(cust,vehicle);
        }
        else{
            System.out.println("Customer will need more money to purchase vehicle: "+vehicle);
        }
    }

    public void runCreditHistroy(Customer cust, double loanAmount)
    {
        System.out.println("Ran credit history for customer....");
        System.out.println("Customer has been approved to purchase the vehicle");
    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle:"+vehicle+"for the price"+vehicle.getPrice());
    }

}
