import java.util.*;

public class Programa
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();
        int inteiro = scan.nextInt();

        System.out.println(texto);
        System.out.println(inteiro);
        
        scan.close();
    }
}