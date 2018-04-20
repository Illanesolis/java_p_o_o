import java.util.Scanner;
public class main
{
    public static void main(String[]args)
    {
        //se crean los candidatos los cuales contienen un nombre y una cierta cantidad de votos
        Candidato uno= new Candidato("claudio",0);
        Candidato dos= new Candidato("matias",0);
        Candidato tres= new Candidato("javier",0);
        Candidato nulo= new Candidato("nulo",0);
        String voto;
        //se inician los votos para que cada candidato sume un voto el usuario debe ingresar el nombre del elegido, de votar nulo debe ingresar la palabra nulo
        do{

          System.out.println("ingrese su voto");
          Scanner scanner = new Scanner(System.in);
          voto = scanner.nextLine();
          //System.out.println("su voto es para " + voto);

          if (voto.equalsIgnoreCase(uno.getNombre())) {
            uno.setVoto(uno.getVoto()+1);
          }
          if(voto.equalsIgnoreCase(dos.getNombre())){

              dos.setVoto(dos.getVoto()+1);
          }
          if(voto.equalsIgnoreCase(tres.getNombre())){
              tres.setVoto(tres.getVoto()+1);
          }
          if(voto.equalsIgnoreCase(nulo.getNombre())){
             nulo.setVoto(nulo.getVoto()+1);
          }

        }while(!voto.equalsIgnoreCase("f"));

        System.out.println("los votos totales de claudio son :" + uno.getVoto());
        System.out.println("los votos totales de matias son :" + dos.getVoto());
        System.out.println("los votos totales de javier son :" + tres.getVoto());
        System.out.println("los votos nulos totales son :" + nulo.getVoto());

        if(uno.getVoto()>dos.getVoto()) {
            if (uno.getVoto() > tres.getVoto()) {
                System.out.println("el ganador es claudio");
                System.out.println("el porcentaje de votos es de "+((uno.getVoto()/(uno.getVoto()+dos.getVoto()+tres.getVoto()))*100+"%"));
            }

        }
        if(dos.getVoto()>uno.getVoto())
        {
            if (dos.getVoto()>tres.getVoto())
            {
                System.out.println("el ganador es matias");
                System.out.println("el porcentaje de votos es de "+((dos.getVoto()/(uno.getVoto()+dos.getVoto()+tres.getVoto()))*100+"%"));
            }
        }
        if(tres.getVoto()>uno.getVoto()){
            if (tres.getVoto()>dos.getVoto()){
                System.out.println("el ganador es javier");
                System.out.println("el porcentaje de votos es de "+((tres.getVoto()/(uno.getVoto()+dos.getVoto()+tres.getVoto()))*100+"%"));

            }
        }








    }
}
