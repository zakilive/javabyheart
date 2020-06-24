package java_basics;

 public class MyUtils {
    public static String printSomeJunk(String argument)
    {
        //String str1=("String passed in: "+argument);
        return argument;
    }

    public static void printSomeJunk(int argument)
    {
        System.out.println("Integer passed in "+argument);
    }

    public static int Sum2Numbers(int firstArg, int secondArg){
        int result = firstArg+secondArg;
        return result;
    }


    public  int add10(int someArgument){
        int result = someArgument+10;
        return result;
    }
}
