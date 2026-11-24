#include <iostream>
#include <locale.h>
char nombre[40];
int i = 1, edad, master,NPINZAS,NJUEGOS,NHAMMERS;
int cclientes=0, G = 0, HERRAMIENTAS; 
float PINZASP = 18.56, DESAP = 125.52, HAMMERP = 76.45, IVA = 1.16,MONTOFINAL;

using namespace std;
int main() 
{
	setlocale(LC_CTYPE, "Spanish");
  	
	printf("Bienvenido a tienda ferreteria\n");
  	
	while (i == 1)
  	{
  	cclientes ++;
  	printf("ingrese su nombre \n:");
	fflush(stdin);
	gets(nombre);
	
	printf("ingrese su edad\n:");
	scanf("%d",&edad);
	
	printf("ingrese su antiguedad como cliente\n:");
	scanf("%d",&master);
	
	printf("Cuantas pinzas compro\n:");
	scanf("%d",&NPINZAS);
	printf("Cuantos juegos de desarmador compro\n:");
	scanf("%d",&NJUEGOS);
	printf("Cuantos martillos compro\n:");
	scanf("%d",&NHAMMERS);
	
	if (NPINZAS >= 3)
			PINZASP = 13.50;
	
	else if (NJUEGOS > 3 && NHAMMERS > 2)
			{
				DESAP = 101.48;
				HAMMERP = 60.45;
			}
			
	else if (master > 2 && edad > 60)
			{
				IVA = 0;
			}
	
	HERRAMIENTAS = NPINZAS + NJUEGOS + NHAMMERS;
	MONTOFINAL = ( NPINZAS * PINZASP + NJUEGOS * DESAP + NHAMMERS * HAMMERP ) * IVA;
	G += MONTOFINAL; 
	
	printf("Estimado %s usted compro %d cantidad de herramientas y con %d de edad y %d de años ser cliente terminara pagando $%.2f\n",nombre,HERRAMIENTAS,edad,master,MONTOFINAL);
	
	printf("desea calcular otro cliente \n\t1.Si\n\t2.no\n");
	scanf("%d",&i);
		while(i < 1 || i > 2)
		{
			printf("Dato incorrecto deme uno o dos\n: ");
			scanf("%d",&i);
		}
	}
	
	printf("\nAl final del dia llegaron %d clientes, y se obtuvo una ganancia final de %d\n",cclientes,G);
  	
  	
  	system ("PAUSE");
    return 0;
}
