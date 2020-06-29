package com.zakilive;

public class Dealership {

    public static void main(String[] args)
    {

        Customer cust1=new Customer();
        cust1.setName("Tom"); //cust1 is referencing the things on heap
        cust1.setAddress("123 Anything st");
        cust1.setCashOnHand(12000);

        Vehicle vehicle=new Vehicle();
        vehicle.setMake("Honda");
        vehicle.setModel("Accord");
        vehicle.setPrice(10000);
        Employee emp=new Employee();




        cust1.purchaseCar(vehicle, emp, true);


        /***
         *
         * handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
         *  if(finance==true)
         *      runCreditHistory(Customer cust, double doubleAmount)
         *  else if(vehicle.getPrice()<=cust.getCashOnHand()):
         *      processTransaction(Customer cust,Vehicle vehicle)
         *   else:
         *      tell customer bring more money
         *
         *
         * //getters allow us to encapsulate data
         *
         */


    }

}
