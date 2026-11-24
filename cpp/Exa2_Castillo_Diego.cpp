#include <iostream>
#include <locale.h>

char nombre[50];
int i, D, DP, BECA, becas_academicas = 0, becas_deportivas = 0, becas_culturales = 0, becas_negadas = 0;
float PROM, COL, DESC;

using namespace std;

int main() {
    setlocale(LC_CTYPE, "Spanish");

    printf("programa de cálculo de becas\n");

    for (i = 1; i <= 10; i++) {
        printf("\nEstudiante %d:\n", i);
        printf("Ingrese su nombre: ");
        fflush(stdin);
        gets(nombre);

        printf("Ingrese su calificación promedio final: ");
        scanf("%f", &PROM);

        printf("Ingrese el monto de sus colegiaturas: ");
        scanf("%f", &COL);

        printf("Ingrese su nivel educativo:\n\t1. Primaria\n\t2. Secundaria\n\t3. Bachiller\n");
        scanf("%d", &D);

        while (D != 1 && D != 2 && D != 3) {
            printf("Valor incorrecto, ingrese 1, 2 o 3:\n");
            scanf("%d", &D);
        }

        printf("Seleccione el tipo de beca:\n\t1. Académica\n\t2. Deportiva\n\t3. Cultural\n");
        scanf("%d", &BECA);

        if (BECA == 1) { 
            if (PROM >= 9) {
                if (D == 1) {
                    DESC = COL * 0.8;
                    becas_academicas++;
                } else if (D == 2) {
                    DESC = COL * 0.85;
                    becas_academicas++;
                } else if (D == 3) {
                    DESC = COL * 0.7;
                    becas_academicas++;
                }
                printf("%s tiene un descuento en colegiaturas de %.2f y pagará %.2f por su beca académica.\n", nombre, COL - DESC, DESC);
            } else {
                printf("Beca académica no otorgada. Promedio insuficiente.\n");
                becas_negadas++;
            }
        } else if (BECA == 2) { 
            if (PROM >= 8) {
                printf("Ingrese el tipo de deporte:\n\t1. Baloncesto\n\t2. Fútbol\n");
                scanf("%d", &DP);

                if (DP == 1) {
                    DESC = COL * 0.9;
                    becas_deportivas++;
                } else if (DP == 2) {
                    DESC = COL * 0.85;
                    becas_deportivas++;
                } else {
                    printf("Tipo de deporte no válido.\n");
                    becas_negadas++;
                    continue;
                }

                printf("%s tiene un descuento en colegiaturas de %.2f y pagará %.2f por su beca deportiva.\n", nombre, COL - DESC, DESC);
            } else {
                printf("Beca deportiva no otorgada. Promedio insuficiente.\n");
                becas_negadas++;
            }
        } else if (BECA == 3) { 
            if (PROM > 9.5) {
                DESC = COL * 0.8;
                becas_culturales++;
                printf("%s tiene un descuento en colegiaturas de %.2f y pagará %.2f por su beca cultural.\n", nombre, COL - DESC, DESC);
            } else {
                printf("Beca cultural no otorgada. Promedio insuficiente.\n");
                becas_negadas++;
            }
        } else {
            printf("Tipo de beca no válido.\n");
            becas_negadas++;
        }
    }

    printf("\nResumen de becas otorgadas:\n");
    printf("Becas académicas: %d\n", becas_academicas);
    printf("Becas deportivas: %d\n", becas_deportivas);
    printf("Becas culturales: %d\n", becas_culturales);
    printf("Becas negadas: %d\n", becas_negadas);

    system("PAUSE");
    return 0;
}










