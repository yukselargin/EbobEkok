import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int obeb,i;

        System.out.print("n1 sayısını giriniz: ");
        int n1= input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2= input.nextInt();

        if (n1<n2){
            i = n1;
            while(i>1){
                if(n1%i==0 && n2%i==0){
                    obeb=i;
                    break;
                }
                i--;
            }
        }else{
            i = n2;
            while(i>1){
                if(n1%i==0 && n2%i==0){
                    obeb=i;
                    break;
                }
                i--;
            }
        }
        System.out.println("Ebob: "+i);
        System.out.print("Ekok: "+(n1*n2/i));
    }
}