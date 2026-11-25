#include <iostream>
#include <locale>

int main() {
    
	int opcion;

    do {
        char nombre[50];
        int horas, puesto;

        printf("Dame el nombre:\n");
        fflush(stdin);
        gets (nombre);

        printf("Dime cuantas horas trabajas:\n");
        scanf("%d", &horas);

        printf("\nSeleccione su puesto:\n");
        printf("\t1. Secretario\n");
        printf("\t2. Docentes\n");
        printf("\t3. Supervisor\n");

        scanf("%d", &puesto);

        while (puesto < 1 || puesto > 3) {
            printf("Dato incorrecto, dame su puesto (1, 2 o 3):\n");
            scanf("%d", &puesto);
        }

        float pago = 0;

        if (puesto == 1) {
            if (horas <= 40) {
                pago = 50 * horas;
            } else {
                pago = 70 * horas;
            }
            printf("%s, con un puesto de secretario(a), trabajando %d horas tendra un pago de %.2f$\n", nombre, horas, pago);
        } else if (puesto == 2) {
            if (horas <= 40) {
                pago = 75 * horas;
            } else {
                pago = 90 * horas;
            }
            printf("%s, con un puesto de docente, trabajando %d horas tendra un pago de %.2f$\n", nombre, horas, pago);
        } else if (puesto == 3) {
            if (horas <= 40) {
                pago = 80 * horas;
            } else {
                pago = 95 * horas;
            }
            printf("%s, con un puesto de supervisor(a), trabajando %d horas tendra un pago de %.2f$\n", nombre, horas, pago);
        }

        do {
            printf("\n¿Deseas calcular otro cliente? (1-Si, 2-No):\n");
            scanf("%d", &opcion);
            getchar(); 
        } while (opcion != 1 && opcion != 2);

    } while (opcion == 1);

    printf("\nFin del programa chau\n");
    return 0;
}

