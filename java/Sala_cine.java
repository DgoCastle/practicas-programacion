import java.util.Scanner;

public class Sala_cine {

    public static void main(String[] args)
     {
        Scanner s = new Scanner(System.in);

        double precio=0, total=0;   
        int edad, num_azar, i;

        do
        {
            System.out.println("dame la edad del cliente");
            edad = s.nextInt();

            System.out.println("\n dame el precio del boleto");
            precio = s.nextDouble();

            System.out.println("\nElige un numero al azar (1 o 2)");
            num_azar = s.nextInt();

            while(num_azar != 1 && num_azar != 2) 
            {
                System.out.println("dato incorrecto, dame un numero al azar (1 o 2)");
                num_azar = s.nextInt();
            }

            switch (num_azar) 
            {
                case 1:
                    if (edad >= 4 || edad <= 12)
                    {
                        total = precio;
                        System.out.printf("\nUsted cuenta con %d de edad y con un numero al azar"+
                        "de %d pagaras $%.2f",edad, num_azar, total);
                    }
                    else if (edad >= 13 || edad <= 25)
                    {
                        total = precio * 0.85 ;
                        System.out.printf("\nUsted cuenta con %d de edad y con un numero al azar"+
                        "de %d pagaras $%.2f con un descuento del 15%%",edad, num_azar, total);
                    }
                    else if (edad >= 26 )
                    {
                        total = precio * 0.97 ;
                        System.out.printf("\nUsted cuenta con %d de edad y con un numero al azar"+
                        "de %d pagaras $%.2f con un descuento del 3%%",edad, num_azar, total);
                    }
                    break;
            
                case 2:
                    if (edad >= 4 || edad <= 12)
                    {
                        total = precio * 0.95;
                        System.out.printf("\nUsted cuenta con %d de edad y con un numero al azar"+
                        "de %d pagaras $%.2f con un descuento del 5%%",edad, num_azar, total);
                    }
                    else if (edad >= 13 || edad <= 25)
                    {
                        total = precio;
                        System.out.printf("\nUsted cuenta con %d de edad y con un numero al azar"+
                        "de %d pagaras $%.2f",edad, num_azar, total);
                    }
                    else if (edad >= 26 )
                    {
                        total = precio;
                        System.out.printf("\nUsted cuenta con %d de edad y con un numero al azar"+
                        "de %d pagaras $%.2f",edad, num_azar, total);
                    }
                    break;
            }
            do
            {
                System.out.printf("\nDeseas calcular otro cliente(1-Si , 2-No)");
                i = s.nextInt();
            }while (i!= 1 && i!=2); 
        }while(i == 1);
        System.out.println("\n fin del programa chau");
        s.close();

    }
}