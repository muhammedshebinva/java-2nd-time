public class methodOverloading {
    //multiple methods with different types of parameters but same name
    //method Overloading
    //first method
    public static int Sum(int num1,int num2){
        return num1+num2;
    }
    //second method
    public static double Sum(double num1,double num2){
        return num1+num2;
    }

    //main

    public static void main(String[] args) {
        System.out.println("Intsum= "+Sum(10,20));
        System.out.println("doubleSUm= "+Sum(4.4,6.3));

    }



}
