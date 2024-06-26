import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda buscaMoneda (String codigoDeMoneda) {
       URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1099d10bf0f4897bd6538f59/latest/"+codigoDeMoneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String>
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Moneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);

        }

// Convert to JSON


// Accessing object
      //  String req_result = jsonobj.get("result").getAsString();

    }

}
