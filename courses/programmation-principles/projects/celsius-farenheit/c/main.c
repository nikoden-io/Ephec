#include <stdio.h>
#include <stdlib.h>

void convertTemperature(char type) {
    char buffer[50];
    float celsius, fahrenheit;
    printf("\033[1;32m");
    if (type == 'c') {
        printf("Enter temperature in celsius: ");
    }
    if (type == 'f') {
        printf("Enter temperature in fahrenheit: ");
    }
    printf("\033[0m");
    fgets(buffer, sizeof(buffer), stdin);
    char *endptr;

    if (type == 'f') {
        fahrenheit = strtof(buffer, &endptr);

        if (endptr == buffer) {
            printf("Invalid input.\n");
            return;
        }

        celsius = (fahrenheit - 32) * 5 / 9;
        printf("Temperature in Celsius: %.2f\n", celsius);
        return;
    }

    if (type == 'c') {
        celsius = strtof(buffer, &endptr);

        if (endptr == buffer) {
            printf("Invalid input.\n");
            return;
        }

        fahrenheit = (celsius * 9 / 5) + 32;
        printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
    }
}

int main() {
    char buffer[50];
    int choice;
    printf("\033[1;32m");
    printf("Temperature Converter\n");
    printf("\033[0m");
    printf("1. Convert from Celsius to Fahrenheit\n");
    printf("2. Convert from Fahrenheit to Celsius\n");
    printf("\033[1;32m");
    printf("Enter your choice: ");
    printf("\033[0m");

    fgets(buffer, sizeof(buffer), stdin);
    char *endptr;
    choice = strtol(buffer, &endptr, 10);

    if (endptr == buffer) {
        printf("Invalid input.\n");
        return 1;
    }

    switch (choice) {
        case 1:
            convertTemperature('c');
            break;
        case 2:
            convertTemperature('f');
            break;
        default:
            printf("Invalid choice\n");
    }

    return 0;
}
