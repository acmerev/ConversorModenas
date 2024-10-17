import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConversorMonedas {
    private JsonObject rates;

    public ConversorMonedas(String apiResponse) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(apiResponse, JsonObject.class);
        this.rates = jsonObject.getAsJsonObject("conversion_rates");
    }

    public double convertidor(String deTipoCambio, String nuevoTipoCambio, double amount) {
        double fromRate = rates.get(deTipoCambio).getAsDouble();
        double toRate = rates.get(nuevoTipoCambio).getAsDouble();
        return (amount / fromRate) * toRate;
    }
}
