import org.w3c.dom.ls.LSOutput;

public class arraySample {
    public static void main(String[] args) {
        //Array asmple

        String[] arrCars = {"bmw", "Nisan", "mercedes", "ford"};
        System.out.println(arrCars[1]);

        for (int i=0;i< arrCars.length;i++){
            System.out.println(arrCars[i]);
        }

        for (String j:arrCars){
            System.out.println(j);
        }

        //Multiple array sample
        int[][] mulArr= {{1,2,3},{4,5,6}};

        for(int i=0;i<mulArr.length;++i){
            for(int j=0;j< mulArr[i].length;++j){
                System.out.println(mulArr[i][j]);
            }
        }

    }
}
