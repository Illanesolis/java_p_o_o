import java.util.Scanner;
public class main
{
    public static void main (String[]args)
    {
        Termometro termometro;
        termometro = new Termometro(4,0);
        int agitar;

        if(termometro.getAgitadas()>2 && termometro.getAgitadas()<=4)
        {
            while(termometro.getAgitadas()>2)
            {
                System.out.println("presione 1 para agitar ");
                Scanner scanner = new Scanner(System.in);
                agitar = scanner.nextInt();

                if (agitar == 1) {
                    termometro.setAgitadas(termometro.getAgitadas() - 1);
                }
                System.out.println("agitadas restantes : " + termometro.getAgitadas());
                if(termometro.getAgitadas()==2)
                {
                    System.out.println("el termometro esta a 0 grados ");
                    System.out.println("midiendo temperatura... ");
                    int randomNum=35 + (int)(Math.random() * ((40 - 35) + 1)) ;
                    termometro.temperatura(randomNum);
                    System.out.println("espere segunda medicion para ver la temperatura final");
                    
                }



            }
        }
        if(termometro.getAgitadas()>0 && termometro.getAgitadas()<=2)
        {
           while (termometro.getAgitadas()>0)
           {
                System.out.println(" ******segunda medicion ***** ");
                System.out.println("presione 1 para agitar ");
                Scanner scanner = new Scanner(System.in);
                agitar = scanner.nextInt();

                if (agitar == 1) {
                    termometro.setAgitadas(termometro.getAgitadas() - 1);
                }
                System.out.println("agitadas restantes : " + termometro.getAgitadas());
                if(termometro.getAgitadas()==0)
                {
                    System.out.println("el termometro esta a 0 grados ");
                    System.out.println("midiendo temperatura... ");
                    int randomNum=35 + (int)(Math.random() * ((40 - 35) + 1)) ;
                    termometro.temperatura(randomNum);

           }    }

        }






    }
}
