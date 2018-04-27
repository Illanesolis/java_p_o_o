import java.util.Scanner;
public class main
{
    static void main(String[]args)
    {
        Rana rana1 = new Rana("lete","rojo",0);
        Rana rana2 =new Rana("mati","azul",0);
        int carril;
        System.out.println("ingrese la carrera que quiere (15) (20) (30) ");
        Scanner scanner = new Scanner(System.in);
        carril = scanner.nextInt();

        if(carril==15)
        {

            int random1 =1 + (int)(Math.random() * ((1 - 3) + 1)) ;
            rana1.ganador(random1);
            int random2 =1 + (int)(Math.random() * ((1 - 3) + 1)) ;



        }

    }



}
