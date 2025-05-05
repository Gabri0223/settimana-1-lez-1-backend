import java.util.Scanner;
public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("inserisci il primo numero");
        int num1=scanner.nextInt();
        System.out.println("inserisci il secondo numero");
        int num2=scanner.nextInt();
        scanner.nextLine();
        System.out.println("inserisci una parola");
        String stringa=scanner.nextLine();
        String stringa2=(stringa+num1);
        String[] parole={"topo-Gigio", "cado malato", "Al-bano", "forza Lazio","Sium"};

        moltiplica(num1,num2);
        concatena(num1,stringa);
        inserisciInArray(parole,stringa2);
    }


public static void moltiplica(int num1, int num2){
    System.out.println("il risultato è "+ num1*num2);
    }
public static void concatena(int num1, String stringa){
    System.out.println("la nuova parola è " + stringa+num1);
    }
public static void inserisciInArray(String[] parole, String stringa2){
        String[] newArray= new String[6];
        for (int i=0; i<6;i++){
            if (i<2){
                newArray[i]=parole[i];
            } else if (i==2) {
                newArray[2]=stringa2;
            }else{
                newArray[i]=parole[i-1];
            }
        }
    System.out.print("il nuovo array è : {");
    for (int i = 0; i < newArray.length; i++) {
        System.out.print(newArray[i]+ ",");
    }System.out.print("}");
}
}
