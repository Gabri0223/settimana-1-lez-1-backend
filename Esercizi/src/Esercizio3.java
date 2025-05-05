import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Inserisci base");
        double base= scanner.nextDouble();
        System.out.println("Inserisci altezza");
        double h= scanner.nextDouble();
        area(base,h);

        System.out.println("Inserisci un intero");
        int num1=scanner.nextInt();
        System.out.println(pariDispari(num1));

        System.out.println("Inserisci il primo lato");
        double a=scanner.nextDouble();
        System.out.println("Inserisci il secondo lato");
        double b= scanner.nextDouble();
        System.out.println("Inserisci il terzo lato");
        double c= scanner.nextDouble();
        System.out.println(areaTriangolo(a,b,c));
    }
    public static void area(double b, double h){
        System.out.println("L'area del rettangolo è: " + b*h);
    }
    public static int pariDispari(int num1){
        if(num1%2==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static double areaTriangolo(double a, double b, double c){
        double semiperimetro=(a+b+c)/2;
        return Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
    }
}
