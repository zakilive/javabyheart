package java_basics;

public class LearningArrays {
    public static void main(String[] args)
    {
        double[] values=new double[100];
        values[0]=100;
        values[99]=94342;
        System.out.println(values[99]);

        String[] words=new String[3];
        words[0]="My";
        words[1]="Name";
        words[2]="Is";
        System.out.println(words[2]);

        words=new String[10];
        System.out.println(words[2]);
    }

}
