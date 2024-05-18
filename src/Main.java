import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserInterface user = new UserInterface();

        int salir = 1;

        while(salir == 1){
            user.Nombre();
            user.Bienvenida();
            user.MenuConversion();
            user.CodigoInicial();
            user.CodigoFinal();
            user.Cantidad();
            Conversor conversor = new Conversor(user.getInitCode(), user.getEndCode(), user.getCuantity());

            salir = user.Continuar();
        }
        user.Despedida();

    }
}
