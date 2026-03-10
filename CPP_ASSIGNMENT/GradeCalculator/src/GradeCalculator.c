/*
 ============================================================================
 Name        : Calculator.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */
#include <stdio.h>

int main()
{
    float html=40;
     float css=50;
     float js=60;
     float sql=70;
	 float java=80;
      char *grade;

float total = html + css + js + sql + java;

 float    percentage = total / 5;

    grade =(percentage >= 75) ? "A" :
            (percentage >= 60) ? "B" :
            (percentage >= 45) ? "C" :"FAIL";

    printf("Student subjects marks are:\n");
    printf("html subject marks :%.2f \n", html);
    printf("css subject marks :%.2f  \n", css);
    printf("js subject marks :%.2f \n", js);
    printf("sql subject marks :%.2f \n", sql);
    printf("java subject marks :%.2f \n", java);

    printf("Total Marks: %.2f \n", total);
    printf("Percentage: %.2f \n", percentage);
    printf("Grade Calculation: %s \n ", grade);

    return 0;
}
