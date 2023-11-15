#include<stdlib.h>
#include<stdio.h>

double polinomio_grado2(double x0, double y0,  double x1, double y1);
double polinomio_grado3(double x0, double y0,  double x1, double y1, double x2, double y2);
double polinomio_grado4(double x0, double y0,  double x1, double y1, double x2, double y2, double x3, double y3);
double polinomio_grado5(double x0, double y0,  double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4);
double polinomio_grado6(double x0, double y0,  double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5);
double polinomio_grado7(double x0, double y0,  double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5, double x6, double y6);


double polinomio_grado2(double x0, double y0,  double x1, double y1){

    double polinomio;
    double a0, a1, r, x;
    
    printf("Puntos: (%.2f,%.2f), (%.2f,%.2f), ",x0,y0,x1,y1);

    a0 = y0;
    a1 = (y1 - y0)/(x1 - x0);
    printf("\nEl polinomio es: %.2f + %.2f(x - %.2f)",a0,a1,x0);
    char opc;
    do
    {
    printf("\nIngrese el el valor en el que desea probar el polinomio 'x': ");
    scanf(" %lf",&x);
    r = a0 + a1*(x - x0);
    printf("\nEl valor del polinomio evaluado en '%.2f' es de: %.2f",x,r);
    printf("\nDesea probar mas puntos?(Y/N): ");
    scanf(" %c", &opc);
    } while (opc != 'N' && opc !='n');
    
    
    return polinomio;
}

double polinomio_grado3(double x0, double y0, double x1, double y1, double x2, double y2){

    
    double polinomio;
    double a0, a1, a2, r, x;

    printf("Puntos: (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f),",x0,y0,x1,y1,x2,y2);

    a0 = y0;
    a1 = (y1 - y0)/(x1 - x0);
    a2 = (((y2 - y0)/(x2 - x0)) - a1)/(x2 - x1);
    printf("\nEl polinomio es: %.2f + %.2f(x - %.2f) + %.2f(x - %.2f)(x - %.2f)",a0,a1,x0,a2,x0,x1);
    char opc;
    do
    {

        printf("\nIngrese el el valor en el que desea probar el polinomio 'x': ");
        scanf(" %lf", &x);
        r = a0 + (a1*(x - x0)) + (a2*(x - x0)*(x - x1));
        printf("\nEl valor del polinomio evaluado en '%.2f' es de: %.2f",x,r);
        printf("\nDesea probar mas puntos?(Y/N): ");
        scanf(" %c", &opc);

    } while (opc!='N' && opc !='n');
    
    

    return polinomio;
}

double polinomio_grado4(double x0, double y0,  double x1, double y1, double x2, double y2, double x3, double y3){

    double a0, a1, a2, a3, r, x;
    double polinomio;
    //imprimir los puntos de cada funcion denro de la libreria
    printf("Puntos: (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f)",x0,y0,x1,y1,x2,y2,x3,y3);

    a0 = y0;
    a1 = (y1 - y0)/(x1 - x0);
    a2 = (((y2 - y0)/(x2 - x0)) - a1)/(x2 - x1);
    a3 = (((((y3 - y0)/(x3 - x0)) - a1)/(x3 - x1)) - a2)/(x3 - x2); 
    //TODO: crear funcion para imprimir cada termino del polinomio 
    printf("\nEl polinomio es: %.2f + %.2f(x - %.2f) + %.2f(x - %.2f)(x - %.2f)",a0,a1,x0,a2,x0,x1);
    char opc;
    do
    {
        printf("\nIngrese el el valor en el que desea4 probar el polinomio 'x': ");
        scanf(" %lf", &x);
        r = a0 + (a1*(x - x0)) + (a2*(x - x0)*(x - x1)) + (a3*(x - x0)*(x - x1)*(x - x2));
        printf("\nEl valor del polinomio evaluado en '%.2f' es de: %.2f",x,r);
        printf("\nDesea probar mas puntos?(Y/N): ");
        scanf(" %c", &opc);
        
    } while (opc!='N' && opc!='n');
    
    return polinomio;
}

double polinomio_grado5(double x0, double y0,  double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
    
    printf("Puntos: (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f)",x0,y0,x1,y1,x2,y2,x3,y3,x4,y4);

    double polinomio;
    double a0, a1, a2, a3, a4, r, x;

    a0 = y0;
    a1 = (y1 - y0)/(x1 - x0);
    a2 = (((y2 - y0)/(x2 - x0)) - a1)/(x2 - x1);
    a3 = (((((y3 - y0)/(x3 - x0)) - a1)/(x3 - x1)) - a2)/(x3 - x2); 
    a4 = (((((((y4 - y0)/(x4 - x0)) - a1)/(x4 - x1)) - a2)/(x4 - x2))- a3)/(x4 - x3); 

    printf("\nEl polinomio es: %.2f + %.2f(x - %.2f) + %.2f(x - %.2f)(x - %.2f) + %.2f(x - %.2f)(x - %.2f)(x - %.2f)",a0,a1,x0,a2,x0,x1,a3,x0,x1,x2);
    char opc;
    do
    {
        printf("\nIngrese el el valor en el que desea probar el polinomio 'x': ");
        scanf(" %lf", &x);
        r = a0 + (a1*(x - x0)) + (a2*(x - x0)*(x - x1)) + (a3*(x - x0)*(x - x1)*(x - x2)) + (a4*(x - x0)*(x - x1)*(x - x2)*(x - x3));
        printf("\nEl valor del polinomio evaluado en '%.2f' es de: %.2f", x , r);
        printf("\nDesea probar mas puntos?(Y/N): ");
        scanf(" %c", &opc);
        
    } while (opc!='N' && opc!='n');    
    
    
    return polinomio;
}

double polinomio_grado6(double x0, double y0,  double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5){

    printf("Puntos: (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f)",x0,y0,x1,y1,x2,y2,x3,y3,x4,y4,x5,y5);

    double a0, a1,a2,a3,a4,a5,x,r;
    double polinomio;
    a0 = y0;
    a1 = (y1 - y0)/(x1 - x0);
    a2 = (((y2 - y0)/(x2 - x0)) - a1)/(x2 - x1);
    a3 = (((((y3 - y0)/(x3 - x0)) - a1)/(x3 - x1)) - a2)/(x3 - x2); 
    a4 = (((((((y4 - y0)/(x4 - x0)) - a1)/(x4 - x1)) - a2)/(x4 - x2)) - a3)/(x4 - x3); 
    a5 = (((((((((y5 - y0)/(x5 - x0)) - a1)/(x5 - x1)) - a2)/(x5 - x2)) - a3)/(x5 - x3)) - a4)/(x5 - x4);
   
    printf("\nEl polinomio es: %.2f + %.2f(x - %.2f) + %.2f(x - %.2f)(x - %.2f) + %.2f(x - %.2f)(x - %.2f)(x - %.2f)+ %.2f(x - %.2f)(x - %.2f)(x - %.2f)(x - %.2f)",a0,a1,x0,a2,x0,x1,a3,x0,x1,x2,a4,x0,x1,x2,x3,a5,x0,x1,x2,x3,x4); 
    char opc;
    do
    {
        printf("\nIngrese el el valor en el que desea probar el polinomio 'x': ");
        scanf(" %lf", &x);
        
        r = a0 + (a1*(x - x0)) + (a2*(x - x0)*(x - x1)) + (a3*(x - x0)*(x - x1)*(x - x2)) + (a4*(x - x0)*(x - x1)*(x - x2)*(x - x3)) + (a5*(x - x0)*(x - x1)*(x - x2)*(x - x3)*(x - x4));

        printf("\nEl valor del polinomio evaluado en '%.2f' es de: %.2f", x , r);
        printf("\nDesea probar mas puntos?(Y/N): ");
        scanf(" %c", &opc);
        
    } while (opc!='N' && opc!='n');    
    return polinomio;
}

double polinomio_grado7(double x0, double y0,  double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5, double x6, double y6){
    
      printf("Puntos: (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f), (%.2f,%.2f)",x0,y0,x1,y1,x2,y2,x3,y3,x4,y4,x5,y5,x6,y6);

    
    double a0, a1,a2,a3,a4,a5,a6,x,r;
    double polinomio;
    a0 = y0;
    a1 = (y1 - y0)/(x1 - x0);
    a2 = (((y2 - y0)/(x2 - x0)) - a1)/(x2 - x1);
    a3 = (((((y3 - y0)/(x3 - x0)) - a1)/(x3 - x1)) - a2)/(x3 - x2); 
    a4 = (((((((y4 - y0)/(x4 - x0)) - a1)/(x4 - x1)) - a2)/(x4 - x2))- a3)/(x4 - x3); 
    a5 = (((((((((y5 - y0)/(x5 - x0)) - a1)/(x5 - x1)) - a2)/(x5 - x2)) - a3)/(x5 - x3)) - a4)/(x5 - x4);
    a6 = (((((((((((y6 - y0)/(x6 - x0)) - a1)/(x6 - x1)) - a2)/(x6 - x2)) - a3)/(x6 - x3)) - a4)/(x6 - x4)) - a5)/(x6 - x5); 
    
    printf("\nEl polinomio es: %.2f + %.2f(x - %.2f) + %.2f(x - %.2f)(x - %.2f) + %.2f(x - %.2f)(x - %.2f)(x - %.2f)+ %.2f(x - %.2f)(x - %.2f)(x - %.2f)(x - %.2f) + %.2f(x - %.2f)(x - %.2f)(x - %.2f)(x - %.2f)(x - %.2f)",a0,a1,x0,a2,x0,x1,a3,x0,x1,x2,a4,x0,x1,x2,x3,a5,x0,x1,x2,x3,x4,a6,x0,x1,x2,x3,x4,x5); 
    char opc;
    do
    {
        printf("\nIngrese el el valor en el que desea probar el polinomio 'x': ");
        scanf(" %lf", &x);
        //completar para grado 6
        r = a0 + (a1*(x - x0)) + (a2*(x - x0)*(x - x1)) + (a3*(x - x0)*(x - x1)*(x - x2)) + (a4*(x - x0)*(x - x1)*(x - x2)*(x - x3)) + (a5*(x - x0)*(x - x1)*(x - x2)*(x - x3)*(x - x4)) + (a6*(x - x0)*(x - x1)*(x - x2)*(x - x3)*(x - x4)*(x - x5));


        printf("\nEl valor del polinomio evaluado en '%.2f' es de: %.2f", x , r);
        printf("\nDesea probar mas puntos?(Y/N): ");
        scanf(" %c", &opc);
        
    } while (opc!='N' && opc!='n');    

    return polinomio;
}