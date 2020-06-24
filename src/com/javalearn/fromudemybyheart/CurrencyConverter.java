package com.javalearn.fromudemybyheart;

public class CurrencyConverter {

    int rupee = 63;
    int dirhams = 3; //UAE
    int real = 3; //brazilian
    int chilean_peso = 595;
    int mexian_peso = 18;
    int _yen = 107;
    int $australian = 2;
    double[] exchangeRates = new double[]{63, 3, 3, 595, 18, 107, 2};

    void printCurrencies() {
        System.out.println("Rupee:" + exchangeRates[0]);
        System.out.println("dirhams:" + exchangeRates[1]);
        System.out.println("real:" + exchangeRates[2]);
        System.out.println("chilean_peso:" + exchangeRates[3]);
        System.out.println("mexian_peso:" + exchangeRates[4]);
        System.out.println("_yen:" + exchangeRates[5]);
        System.out.println("$australian:" + exchangeRates[exchangeRates.length - 1]);
    }


    static void primitives() {
        System.out.println("\n\n Inside primitives");
        //literals demo
        int intHex = 0x0041;
        System.out.println("intHex:" + intHex);
        int intBinary = 0b01000001;
        System.out.println("intBinary:" + intBinary);
        int intUnderscore = 1_23_456;
        System.out.println("intUnderScore:" + intUnderscore);
    }

    static void primitiveChar() {
        System.out.println("\n\n Inside primitives");
        char charA = 'A';
        System.out.println("charA=" + charA);
        char charInt = 65;
        System.out.println("charInt=" + charInt);
        char charUnicode1 = '\u0041';
        System.out.println("charUnicode1=" + charUnicode1);
        char charUnicode2 = 0x41;
        System.out.println("charUnicode2=" + charUnicode2);
        char charBinary = 0b01000001;
        System.out.println("charBinary=" + charBinary);

    }

    static boolean isInsured; //it is false by default

    static void primitiveBoolean() {

        double coveragerByInsurance = 0.8;
        double billAmount = 1000.0;
        double amountPaidByInsurance = 0.0;
        double amountPaidByPatient = billAmount;
        if (isInsured) {
            amountPaidByInsurance = billAmount * coveragerByInsurance;
            amountPaidByPatient = billAmount - amountPaidByInsurance;
        }
        System.out.println("AmountPaidByInsurance=" + amountPaidByInsurance);
        System.out.println("AmountPaidBypatient=" + amountPaidByPatient);
    }

    static void typeCasting() {
        System.out.println("\n\n Inside typeCasting");
        //Explicit casting
        long y = 42;
        //  int x=y;
        int x = (int) y;
        System.out.println(x);

        //Information loss due to out of range assignment
        byte narrowByte = (byte) 123456;
        System.out.println("narrowedByte: " + narrowByte);

        //Truncation
        int iTruncated = (int) 0.99;
        System.out.println("iTruncated:" + iTruncated);
//
        //Implicit cast(char to int)
        char cChar = 'A';
        int iInt = cChar;
        System.out.println("iTnt:" + iInt);

        //byte to char using an explicit cast
        byte bByte = 65;
        cChar = (char) bByte;
        System.out.println("cChar: " + cChar);
    }

    static int count = 25;

//    static void statement() {
//        count = 34;
//        if (count < 49) {
//
//        }
//    }

    static void arrays() {
        System.out.println("Inside arrays:");
        int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
        System.out.println("myArray.length:" + myArray.length);
        System.out.println("myArray[1]:" + myArray[1]);
        //  System.out.println("myArray[7]:"+myArray[7]);

    }

//    static void threeDarrays{
//        int[][][] unitsSold=new int[][][]{
//                //New york
//                {0,0,0,0}, //jan
//                {0,0,0,0}, //Feb
//                {0,0,0,0}, //mar
//                {0,850,0,0} //Apr
//        },
//        {
//            //San fransisco
//            {0,0,0,0}, //jan
//            {0,0,0,0},//Feb
//            {0,0,0,0}, //mar
//            {0,0,0,0} //Apr
//        },
//        {
//            {0,0,0,0},
//            {0,0,0,0},
//            {0,0,0,0},
//            {0,0,0,0}
//        },
//        {
//            {0,0,0,0},
//            {0,0,0,0},
//            {0,0,0,0},
//            {0,0,0,0}
//        }
//
//        System.out.println("unitsSold[0][3][1]:"+unitsSold[0][3][1]);
//    }

    static float sum(double x, double y) {
        return (float)(x + y);
    }

    static double avg(double x, double y){
        double sum=sum(x,y);
        return sum/2;
    }

    static boolean search(int[] listmake,int key){
        return true;
    }

    public static void main(String[] args) {
//        CurrencyConverter cc=new CurrencyConverter();
//        cc.printCurre ncies();
        //primitives();
        //primitiveChar();
        //primitiveBoolean();
        // typeCasting();
        // statement();         //statements demo
        //arrays();
//        CurrencyConverter cc=new CurrencyConverter();
//        cc.printCurrencies();

        float d = (float)sum(3.0f, (float)2.0);
        System.out.println(d);

        double d2=avg(3.0,2.0);
        System.out.println(d2);
//
//        int[] list={1,2};
//        list={2,3};



    }
}