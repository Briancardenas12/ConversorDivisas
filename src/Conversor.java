import com.google.gson.Gson;

public class Conversor {

    private String initCode;
    private String endCode;
    private double cuantity;
    private double conversionRate;
    private double resultado;

    public Conversor(String initCode, String endCode, double cuantity) {
        this.endCode = endCode;
        this.cuantity = cuantity;
        this.initCode = initCode;

        Http http = new Http(initCode);
        Gson gson = new Gson();
        Divisas divisas =gson.fromJson(http.getResponse(), Divisas.class);

        conversionRate = divisas.getConversion_rates().get(endCode);
        resultado = cuantity * conversionRate;

        System.out.println(
                "\nUn " + initCode + " vale " + conversionRate
                        + " " + endCode + "\nPor lo tanto " + cuantity + " " + initCode +
                        " equivalen a " + resultado + " " + endCode
        );

    }



}