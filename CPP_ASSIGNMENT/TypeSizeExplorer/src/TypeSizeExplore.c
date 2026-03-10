/*
 ============================================================================
 Name        : SIzeOfBytes.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>

int main()
{
    printf("Size of short is %d bytes\n", sizeof(short int));//2 bytes
    printf("Size of int is %d bytes\n", sizeof(int));//4 bytes
    printf("Size of long int is %d bytes\n", sizeof(long int));//4 bytes
    printf("Size of long long int is %d bytes\n", sizeof(long long int));//8 bytes
    printf("Size of unsigned int is %d bytes\n", sizeof(unsigned int));//4 bytes
    printf("Size of float is %d bytes\n", sizeof(float));//4 bytes
    printf("Size of double is %d bytes\n", sizeof(double));//8 bytes
    printf("Size of long double is %d bytes\n", sizeof(long double));//12 bytes
    printf("Size of char is %d bytes\n", sizeof(char));//1 bytes

    return 0;
}
//Q.1 print the size of types in bytes
//Size of short is 2 bytes
//Size of int is 4 bytes
//Size of long int is 4 bytes
//Size of long long int is 8 bytes
//Size of unsigned int is 4 bytes
//Size of float is 4 bytes
//Size of double is 8 bytes
//Size of long double is 12 bytes
//Size of char is 1 bytes

//Q.2 which two type have same size in your machine
//-> int and float type have same size.

//Q.3 Does unsigned int have different size than int?
//-> No, both have same size (i.e 4 byte)

