import java.util.Arrays;

public class App {

    // ArrayProcessor
    public static double  counter( double value, double[] array ) {
        double nbre =0;
       for (double d : array) {
        if (value == d ) {
            nbre +=1;
            
        }
       } 
       return nbre;
        
    }
    private static double calculer(double[] array,ArrayProcessor op) {
        return op.apply(array);
     }

    public static void main(String[] args) throws Exception {
        double[] integerArray = { 3, 1, 5, 1, 8, 4};

        //valeur maximal d'un tableau 
        System.out.println("la valeur maximal du tableau");
        ArrayProcessor big = (array) -> {

            Arrays.sort(integerArray);
            double maxNum = integerArray[integerArray.length - 1];
            return maxNum;
        } ;
    
        System.out.println("maximum :"+big.apply(integerArray));
        System.out.println("maximum  en appelant la methode calculer: " + calculer(integerArray,big));
        System.out.println();

        //valeur minimal d'un tableau 
        ArrayProcessor small = (array) -> {

            Arrays.sort(integerArray);
            double minNum = integerArray[0];
            return minNum;
        } ;
        System.out.println("la valeur minimal du tableau");
        System.out.println("minimum :"+small.apply(integerArray));
        System.out.println("maximum  en appelant la methode calculer: " + calculer(integerArray,small));
        System.out.println();

        //valeur minimal d'un tableau 
        ArrayProcessor somme = (array) -> {

            double sum  = 0;
            for (double i : integerArray) {
                sum  += i;
            }

            return sum ;
        } ;
        System.out.println("la somme des valeurs du tableau est ");
        System.out.println("somme :"+somme.apply(integerArray));
        System.out.println("maximum  en appelant la methode calculer: " + calculer(integerArray,somme));
        System.out.println();
        

        //valeur de la moyenne du tableau 
        ArrayProcessor moyenne = (array) -> {
            double sum  = 0;
            for (double i : integerArray) {
                sum  += i ;
            }

            return sum  /integerArray.length ;
        } ;
        System.out.println("la moyenne des valeurs du tableau est ");
        System.out.println("moyenne :"+moyenne.apply(integerArray));
        System.out.println("maximum  en appelant la methode calculer: " + calculer(integerArray,moyenne));
        System.out.println();


        ArrayProcessor nombre = (array) -> {
            double value =1;
            double nbre =0;
            for (double d : array) {
             if (value == d ) {
                 nbre +=1;
                 
             }
            } 
            return nbre;
        } ;
        System.out.println("nombre de fois: " + calculer(integerArray,nombre));
        System.out.println("nombre de fois: " + counter(1, integerArray));





    }
}
