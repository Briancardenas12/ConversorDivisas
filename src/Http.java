import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Http {

    String json;

    public Http(String initCode) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/2fae49c6bf0e01b41c433714/latest/" + initCode);
        //Cliente http
        HttpClient client = HttpClient.newHttpClient();
        //Solicitud http
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        //Respuesta http
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Error al convertir la Divisa " + e);
        }
        json = response.body();
    }

    public String getResponse(){
        return json;
    }


}
