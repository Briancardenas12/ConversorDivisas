import java.util.Scanner;

public class UserInterface {

    private double cuantity;
    private String initCode;
    private String endCode;
    private String usuario;

    //Scanner
    Scanner sc = new Scanner(System.in);

    //getter

    public double getCuantity() {
        return cuantity;
    }

    public String getInitCode() {
        return initCode;
    }

    public String getEndCode() {
        return endCode;
    }

    //Metodos

    //Solicitar nombre

    public void Nombre(){
        System.out.println("Ingrese su nombre, por favor: ");
        usuario = sc.nextLine();
    }

    //Bienvenida
    public void Bienvenida(){
        System.out.println("""
                ***********************************
                ***********************************
                """);

        System.out.println("""
                            BIENVENIDO AL
                        CONVERSOR DE DIVISAS"""
                            + usuario);


        System.out.println("""
                ***********************************
                ***********************************
                """);
    }

    public void MenuConversion(){

        System.out.println("""
                
                ************************************
                
                El siguiente es el menú de las divisas entre las cuales es posible
                realizar las conversiones:
                
                Codigo del Pais           Nombre de la moneda
                
                ARS                =>     Peso Argentino.
                UDS                =>     Dólar de los Estados Unidos.
                COP	               =>     Peso Colombiano.
                MXN                =>     Peso Mexicano.
                BRL                =>     Real Brasileño.
                
                
                ***************************************
                """);
    }

    public void CodigoInicial(){
        System.out.println("Ingrese el código de la moneda de origen: ");
        initCode = sc.nextLine().toUpperCase();
    }

    public void CodigoFinal(){
        System.out.println("Ingrese el código de la moneda de destino: ");
        endCode = sc.nextLine().toUpperCase();
    }

    public void Cantidad(){
        System.out.println("¿Cúantos " + initCode + " desea convertir a " + endCode + "?");
        cuantity = sc.nextDouble();
    }

    int Continuar(){
        System.out.println("""
                ***********************************
                Ingrese: 
                
                1 => Si desea Continuar
                Cualquier tecla => Si desea Salir
                ***********************************
                """);

        System.out.println("¿Desea realizar una nueva consulta en nuestro sistema de divisas? ");
        int continuar = sc.nextInt();
        System.out.println(continuar);
        return continuar;

    }

    public void Despedida(){

        System.out.println("""
                ***********************************
                ***********************************
                """);

        System.out.println("""
                        GRACIAS POR UTILIZAR
                                NUESTRO
                        CONVERSOR DE DIVISAS"""
                            + usuario);


        System.out.println("""
                ***********************************
                ***********************************
                """);

    }


}
