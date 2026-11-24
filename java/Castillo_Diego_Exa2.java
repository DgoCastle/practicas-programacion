import java.util.Scanner;
import java.lang.String; 

public class Castillo_Diego_Exa2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,G = 0 ;
        int clientes=0;
        int tresconta=0, cincoconta=0, ochoconta=0, sinconta=0;
        double PRICE = 0 ;
        double LB = 100000, LC = 0;

        do
        {
            clientes++;
            System.out.printf("Dame tu nombre:");
            String N = s.nextLine();
    
            System.out.printf("\nCual es el nombre de su libro:");
            String LIBRO = s.nextLine();

            System.out.printf("\ningrese el precio del libro:");
            float PLIBRO = s.nextFloat();

            if(PLIBRO > 500 && PLIBRO < 700)
                {
                     PRICE = (PLIBRO*0.97) * 1.16;
                    tresconta++;
                    System.out.printf("%s su libro %s con un precio inicial del $%.2f y tiene un descuento del 3%%"
                    + "por lo que pagara con IVA %.2f",N,LIBRO,PLIBRO,PRICE);

                }
            
            else if(PLIBRO > 700 && PLIBRO < 1200)
                {
                     PRICE = (PLIBRO*0.95) * 1.16;
                    cincoconta++;
                    System.out.printf("%s su libro %s con un precio inicial del $%.2f y tiene un descuento" 
                    + "del 5%% por lo que pagara con IVA %.2f",N,LIBRO,PLIBRO,PRICE);
                    G += PRICE;
                }

            else if(PLIBRO > 1200)
                {
                     PRICE = (PLIBRO*0.92) * 1.16;
                    ochoconta++;
                    System.out.printf("%s su libro %s con un precio inicial del $%.2f y tiene un descuento del 8%%"
                    +"por lo que pagara con IVA %.2f",N,LIBRO,PLIBRO,PRICE);
                    G += PRICE;
                }

            else if(PLIBRO < 700)
                {
                     PRICE = PLIBRO * 1.16;
                    sinconta++;
                    System.out.printf("%s su libro %s con un precio inicial del $%.2f y no tiene descuento, por lo"
                    + "que pagara con IVA %.2f",N,LIBRO,PLIBRO,PRICE);
                    G += PRICE;
                }

                    if (LB > PRICE)
                        LB = PRICE;
                    if(LC < PRICE)
                        LC = PRICE;

            System.out.println("\n\t Deseas calcular otro cliente");
            System.out.print("\t 1.Si");
            System.out.print("\t 2.No\n");
            i = s.nextInt();
            while(i != 1 && i !=2)
            {
                System.out.println("Tiene que ingresar uno o dos no hay mas");
                i = s.nextInt();
            }
            s.nextLine();
            
        } while (i == 1);
        
        System.out.printf("Con un total de %d de libros vendidos de los cuales a %d se les otorgo " 
        + "el 3%%, a %d el 5%%, %d el 8%% y a %d no tuvo descuento, al final la ganancia fue de $%d,"
        + "el libro mas caro fue %.2f y el mas barato %.2f",clientes,tresconta,cincoconta,ochoconta,sinconta,G,LC,LB);

        s.close();
    }
}