package com.javalearn.fromudemybyheart;

public class CurrencyConverterNew {
  static  double[] exchangeRates;

    void setExchangeRates(double[] rates){
        exchangeRates=rates;
    }

    void updateExchangeRates(int arrayIndex, double newval){
        exchangeRates[arrayIndex]=newval;
    }

    double getExchangeRate(int arrayIndex){
        return exchangeRates[arrayIndex];
    }

    double computerTransferAmount(int arrayIndex, double amount){
        return amount*getExchangeRate(arrayIndex);
    }

    void printCurrencies() {
        System.out.println("Rupee:" + exchangeRates[0]);
        System.out.println("dirhams:" + exchangeRates[1]);
        System.out.println("real:" + exchangeRates[2]);
        System.out.println("chilean_peso:" + exchangeRates[3]);
        System.out.println("mexian_peso:" + exchangeRates[4]);
        System.out.println("_yen:" + exchangeRates[5]);
        System.out.println("$australian:" + exchangeRates[exchangeRates.length - 1]);
    }


    public static void main(String[] args){
        CurrencyConverter cc=new CurrencyConverter();

        //Jan 1st
        double[] rates={63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
        cc.setExchangeRates(rates);
        cc.printCurrencies();

        rates=new double[]{65.0, 5.0, 3.0, 595.5, 18.0, 107.0, 2.0};
        cc.setExchangeRates(rates);

        cc.printCurrencies();

        cc.updateExchangeRate(0,66.0);
        cc.printCurrencies();
        double amount = cc.computerTransferAmount(0,1000);
        System.out.println("Transferred amount:"+amount);
    }

}
void updateId(Student s1){
    s1.id=1001;
}

Student s=new Student();
s.id=1000;
updateId(s);
System.out.println(s.);

passing data

pass by value, [ass by data]