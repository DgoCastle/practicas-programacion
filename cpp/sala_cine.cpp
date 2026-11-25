#include <iostream>
using namespace std;

int main() {
    double precio = 0, total = 0;
    int edad, num_azar, i;

    do {
        printf("Dame la edad del cliente: ");
        scanf("%d", &edad);

        printf("\nDame el precio del boleto: ");
        scanf("%lf", &precio);

        printf("\nElige un numero al azar (1 o 2): ");
        scanf("%d", &num_azar);

        while (num_azar != 1 && num_azar != 2) {
            printf("Dato incorrecto, dame un numero al azar (1 o 2): ");
            scanf("%d", &num_azar);
        }

        switch (num_azar) {
            case 1:
                if (edad >= 4 && edad <= 12) {
                    total = precio;
                    printf("\nUsted cuenta con %d de edad y con un numero al azar de %d, pagara $%.2f\n", edad, num_azar, total);
                } else if (edad >= 13 && edad <= 25) {
                    total = precio * 0.85;
                    printf("\nUsted cuenta con %d de edad y con un numero al azar de %d, pagara $%.2f con un descuento del 15%%\n", edad, num_azar, total);
                } else if (edad >= 26) {
                    total = precio * 0.97;
                    printf("\nUsted cuenta con %d de edad y con un numero al azar de %d, pagara $%.2f con un descuento del 3%%\n", edad, num_azar, total);
                }
                break;

            case 2:
                if (edad >= 4 && edad <= 12) {
                    total = precio * 0.95;
                    printf("\nUsted cuenta con %d de edad y con un número al azar de %d, pagara $%.2f con un descuento del 5%%\n", edad, num_azar, total);
                } else if (edad >= 13 && edad <= 25) {
                    total = precio;
                    printf("\nUsted cuenta con %d de edad y con un número al azar de %d, pagara $%.2f\n", edad, num_azar, total);
                } else if (edad >= 26) {
                    total = precio;
                    printf("\nUsted cuenta con %d de edad y con un número al azar de %d, pagara $%.2f\n", edad, num_azar, total);
                }
                break;
        }

        do {
            printf("\n¿Deseas calcular otro cliente? (1-Si, 2-No): ");
            scanf("%d", &i);
        } while (i != 1 && i != 2);

    } while (i == 1);

    printf("\nFin del programa Chau\n");

    return 0;
}

