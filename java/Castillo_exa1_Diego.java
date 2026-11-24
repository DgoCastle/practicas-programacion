import java.util.Scanner;
import java.lang.String;

/**
 * Castillo_exa1_Diego
 */
public class Castillo_exa1_Diego {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deme su nombre");
        String NAME = s.nextLine();

        System.out.println("Que tipo de vehiculo manejaba \n 1. Carro \n 2. Moto \n 3. Camion ");
        int RUMRUM = s.nextInt();

        System.out.println("ingrese el monto total de daños generados");
        int MONTO = s.nextInt();

            if (RUMRUM == 1)
            {
                double MONTOTAL = MONTO * 0.2;
                System.out.println("Numero de lesionados"); 
                int LES = s.nextInt();
                int TLES = LES * 1000;

                System.out.println("Numero de postes lesionados");
                int POSTES = s.nextInt();
                int TPOSTES = POSTES * 5000;


                System.out.println("Cuantos accidentes ha tenido antes");
                int ACC = s.nextInt();
                   
                    if (ACC > 0)
                    {
                        double FINAL = TPOSTES + TLES + MONTOTAL;
                        System.out.printf("%s tendra que pagar un monto de %.2f por ser un carro y se le adicionan el monto por lesionados $%d y $%d y tendra un total de $%.2f",NAME,MONTOTAL,TLES,TPOSTES,FINAL);
                    }

                    else if ( ACC == 0 )
                    {
                        double FINAL = TPOSTES + TLES + MONTOTAL * 0.9;
                        System.out.printf("%s tendra que pagar un monto de %.2f por ser un carro y se le adicionan el monto por lesionados $%d y $%d y tendra un total de $%.2f",NAME,MONTOTAL,TLES,TPOSTES,FINAL);
                    
                    }        
                    else 
                    {
                        System.out.println("dato erroneo JAJA");
                    }
            }

            else if (RUMRUM == 2)
            {
                double MONTOTAL = MONTO * 0.1;
                System.out.println("Numero de lesionados"); 
                int LES = s.nextInt();
                int TLES = LES * 1000;

                System.out.println("Numero de postes lesionados");
                int POSTES = s.nextInt();
                int TPOSTES = POSTES * 5000;


                System.out.println("Cuantos accidentes ha tenido antes");
                int ACC = s.nextInt();
                   
                    if (ACC > 0)
                    {
                        double FINAL = TPOSTES + TLES + MONTOTAL;
                        System.out.printf("%s tendra que pagar un monto de %.2f por ser una moto y se le adicionan el monto por lesionados $%d y $%d y tendra un total de $%.2f",NAME,MONTOTAL,TLES,TPOSTES,FINAL);
                    }

                    else if ( ACC == 0 )
                    {
                        double FINAL = TPOSTES + TLES + MONTOTAL * 0.9;
                        System.out.printf("%s tendra que pagar un monto de %.2f por ser una moto y se le adicionan el monto por lesionados $%d y $%d y tendra un total de $%.2f",NAME,MONTOTAL,TLES,TPOSTES,FINAL);
                    
                    }   
                    else 
                    {
                        System.out.println("dato erroneo JAJA");
                    }
                }
            else if (RUMRUM == 3)
            {
                double MONTOTAL = MONTO * 0.3;
                System.out.println("Numero de lesionados"); 
                int LES = s.nextInt();
                int TLES = LES * 1000;

                System.out.println("Numero de postes lesionados");
                int POSTES = s.nextInt();
                int TPOSTES = POSTES * 5000;


                System.out.println("Cuantos accidentes ha tenido antes");
                int ACC = s.nextInt();
                   
                    if (ACC > 0)
                    {
                        double FINAL = TPOSTES + TLES + MONTOTAL;
                        System.out.printf("%s tendra que pagar un monto de %.2f por ser un camion y se le adicionan el monto por lesionados $%d y $%d y tendra un total de $%.2f",NAME,MONTOTAL,TLES,TPOSTES,FINAL);
                    }

                    else if ( ACC == 0 )
                    {
                        double FINAL = TPOSTES + TLES + MONTOTAL * 0.9;
                        System.out.printf("%s tendra que pagar un monto de %.2f por ser un camion y se le adicionan el monto por lesionados $%d y $%d y tendra un total de $%.2f",NAME,MONTOTAL,TLES,TPOSTES,FINAL);
                    
                    }      
                    
                    else 
                    {
                        System.out.println("dato erroneo JAJA");
                    }
                    
            }
            else 
            {
                System.out.println("dato erroneo JAJA");
            }
            

        



        s.close();
    }
}