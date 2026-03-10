/*
 ============================================================================
 Name        : TemperatureConvertor.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>

float celsiusToFahrenheit(float c);
float fahrenheitToCelsius(float f);

int main()
{
    float c= 33.0;
    float f= 67.0;

    float result1 = celsiusToFahrenheit(c);
    float result2 = fahrenheitToCelsius(f);

    printf("Celsius: %.2f to Fahrenheit: %.2f \n", c, result1);
    printf("Fahrenheit: %.2f to  Celsius: %.2f \n", f, result2);

    return 0;
}

float celsiusToFahrenheit(float c)
{
    return (c * 9/5) + 32;
}

float fahrenheitToCelsius(float f)
{
    return (f - 32) * 5/9;
}
