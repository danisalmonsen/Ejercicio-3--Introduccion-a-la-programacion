public class Main
{
    public static void main(String[] args) {
        //Parte 1
       
        int numero1 = 12;
        int numero2 = 13;
        int numero3 = 15;

        int resultadoSuma = Sumar(numero1, numero2, numero3);
        System.out.println(resultadoSuma);

        /*
            Parte 2
           
         */
        Coche miCoche = new Coche();
        miCoche.AgregarPuertas();
        miCoche.AgregarPuertas();
        int puertas = 2;
        miCoche.AgregarPuertas(puertas);
        System.out.println(miCoche.puertas);


    }
    public int Sumar(int numA, int numB, int numC)
    public static int Sumar(int numA, int numB, int numC)
    {
        int resultado;
        resultado = numA + numB + numC;
@@ -26,8 +43,8 @@ public int Sumar(int numA, int numB, int numC)
    //Atributos de la clase
    public int puertas = 0;

    public void AgregarPuertas()
    public void AgregarPuertas(int puertasPa)
    {
        this.puertas++;
        this.puertas += puertasPa;
    }
}