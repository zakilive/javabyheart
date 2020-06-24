package java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        boolean hungry = true;

        if (hungry) {
            System.out.println("I am starving....");
        } else {
            System.out.println("I am not hungry");
        }

        int hungerRating = 5;
        if (!(hungerRating != 6)) {
            System.out.println("Not hungry");
        } else {
            System.out.println("I am starving too !!");
        }

        int favoriteTemp = 75;
        int currentTemp = 60;
        String opinion;

        if (favoriteTemp == currentTemp) {
            if (currentTemp <= (favoriteTemp - 30)) {
                opinion = "It's pretty Darn Cold....";
            } else if (currentTemp < favoriteTemp - 20) {
                opinion = "It's kinda cold out....";
            } else if (currentTemp > favoriteTemp + 10) {
                opinion = "It's hot out";
            } else {
                opinion = "It's beautiful day";
            }
        } else {
            opinion = "Unknown Temperature";
        }
        System.out.println(opinion);


        int month = 6;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            default: monthString="Unkown Month";
                break;
        }

        System.out.println(monthString);
    }
}
