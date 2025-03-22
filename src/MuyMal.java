import java.util.Scanner;

public class MuyMal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // Se modifico el nombre de las variables junto con el scanner
        int i = 1;
        int multiplosTres = 0;
        int multiplosCinco = 0;
        int sumaTotal = 0;

        System.out.println("Ingrese un número límite:");
        int numeroLimite = input.nextInt();

        
        while (i <= numeroLimite) {
            // If para verificar multiplo de 3
            if (i % 3 == 0) {
            multiplosTres = multiplosTres + i;
            System.out.println(i + " es múltiplo de 3");
            }
            // If para verificar multiplo de 5
            if (i % 5 == 0) {
            multiplosCinco = multiplosCinco + i;
            System.out.println(i + " es múltiplo de 5");
            }
            // If para sumar 
            if (i % 3 != 0 && i % 5 != 0) {
            sumaTotal = sumaTotal + i;
            System.out.println(i + " no es múltiplo de 3 ni 5");
            }
            i += 1;
        }

        System.out.println("Suma de múltiplos de 3: " + multiplosTres);
        System.out.println("Suma de múltiplos de 5: " + multiplosCinco);
        System.out.println("Suma del resto: " + sumaTotal);

        // INTENTE CON FOR PERO ME IMPRIMIA INFINITAS COSAS JAJAJ

       // for (int i = 1; i <= L; i++){
         //   if (i % 3 == 0) {
           //     multiplosTres = multiplosTres +i;
             //   System.out.println(i + " es múltiplo de 3.");
            //}else if (i % 5 == 0){
              //  multiplosCinco = multiplosCinco + i;
               // System.out.println(i + " es múltiplo de 5.");
            //}else if (i % 3 != 0 && i % 5 != 0) {
              //  sumaTotal = sumaTotal + i;
               // System.out.println(i + " no es multiplo de 3 ni 5.");
           // }
            //System.out.println("Suma de múltiplos de 3: " + multiplosTres);
            //System.out.println("Suma de múltiplos de 5: " + multiplosCinco);
           // System.out.println("Suma del resto: " + sumaTotal);
            //input.close();
        //}
    }
}
