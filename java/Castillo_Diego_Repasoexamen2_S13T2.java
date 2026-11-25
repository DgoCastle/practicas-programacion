import java.util.Scanner;
import java.lang.String;
public class S14 {

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        

        System.out.printf("dame el nombre\n");
        String nombre = s.nextLine();
        
        System.out.printf("Dime cuantas horas trabajas\n");
        int horas = s.nextInt();
        
        System.out.printf("\nSeleccione su puesto \n\t1.Secretario \n\t2.Docentes \n\t3.Supervisor\n");
        int puesto = s.nextInt();

        while(puesto != 1 && puesto != 2 && puesto !=3) 
            {
                System.out.println("dato incorrecto, dame su puesto (1, 2 o 3)");
                puesto = s.nextInt();
            }

        switch (puesto)
          {
            case 1:
                if(horas <= 40)
                {
                    
                    float sencillo = s.nextFloat();
                    sencillo = (50 * horas);

                    System.out.printf("%s con un puesto de secretario(a) trabajando %d tendra un pago de %.2f$",nombre,horas,sencillo);
                }
                else if(horas > 40)
                {
                    float sencillo = s.nextFloat();
                    sencillo = (70 * horas);

                    System.out.printf("%s con un puesto de secretario(a) trabajando %d tendra un pago de %.2f$",nombre,horas,sencillo); 
                }
            break;

            case 2:
                if(horas <= 40)
                {
                
                    float sencillo = s.nextFloat();
                    sencillo = (75 * horas);

                    System.out.printf("%s con un puesto de docente trabajando %d tendra un pago de %.2f$",nombre,horas,sencillo);
                }
                else if(horas > 40)
                {
                    float sencillo = s.nextFloat();
                    sencillo = (90 * horas);

                    System.out.printf("%s con un puesto de docente trabajando %d tendra un pago de %.2f$",nombre,horas,sencillo); 
                }
            break;

            case 3:
                if(horas <= 40)
                {
                    
                    float sencillo = s.nextFloat();
                    sencillo = (80 * horas);

                    System.out.printf("%s con un puesto de supervisor(a) trabajando %d tendra un pago de %.2f$",nombre,horas,sencillo);
                }
                else if(horas > 40)
                {
                    float sencillo = s.nextFloat();
                    sencillo = (95 * horas);

                    System.out.printf("%s con un puesto de supervisor(a) trabajando %d tendra un pago de %.2f$",nombre,horas,sencillo); 
                }
                break; 
          }
           
        
        

        s.close();
    }
}