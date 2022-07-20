public class typeCasting {
    public static void main(String[] args) {
        //wide casing
        //Widening Casting (automatically) - converting a smaller type to a larger type size
         int myInt =9;
         double myDouble= myInt; //int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        double numDouble=8.78d;
        int num= (int) numDouble; // Manual casting: double to int
        System.out.println(numDouble);
        System.out.println(num);


    }
}
