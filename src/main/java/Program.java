import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;

public class Program {

  private static final String NBP_URL = "http://api.nbp.pl/api/exchangerates/tables/A";

  private static List<Price> fetchNbpPrices(String url) {
    try {
      URL apiUrl = new URL(url);
      URLConnection urlConnection = apiUrl.openConnection();
      BufferedReader reader = new BufferedReader(
          new InputStreamReader(urlConnection.getInputStream()));
      StringBuilder builder = new StringBuilder();

      String element = null;
      while ((element = reader.readLine()) != null) {

        builder.append(element);
      }
      Gson gson = new Gson();
      Price[] prices = gson.fromJson(builder.toString(), Price[].class);
      return Arrays.asList(prices);
    } catch (IOException e) {
      throw new RuntimeException("Cannot fetch data from api");
    }
  }

  public static void main(String[] args) {

    List<Price> prices = fetchNbpPrices(NBP_URL);
    prices.forEach(System.out::println);
  }


}
