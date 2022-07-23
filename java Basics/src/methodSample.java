public class methodSample {
    static  void display(){
        System.out.println("this is a  method");
    }
    //sum function parameter passing
    static void sum(int num1, int num2){
        int a=num1;
        int b=num2;
        int sum=a+b;
        System.out.println(a+"+"+b+"="+sum);

    }
    //return sample
    static String fullName(String fName,String lName){
        return fName+lName;
    }


    public static void main(String[] args) {
        display(); //method calling

        sum(10,20); //parameters passing

        System.out.println("Full name= "+fullName("shebin","vs"));//Return String value
    }
}
