import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException, InterruptedException {
        ApiCliente apiClient = new ApiCliente();
        String apiResponse = apiClient.getExchangeRates();
        ConversorMonedas conversor = new ConversorMonedas(apiResponse);

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. USD a MXN");
            System.out.println("2. EUR a JPY");
            System.out.println("3. MXN a GBP");
            System.out.println("4. GBP a CAD");
            System.out.println("5. JPY a USD");
            System.out.println("6. MXN a USD");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();
            if (opcion == 7) {
                salir = true;
                continue;
            }

            System.out.print("Ingresa el monto a convertir: ");
            double monto = scanner.nextDouble();
            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = conversor.convertidor("USD", "MXN1", monto);
                    break;
                case 2:
                    resultado = conversor.convertidor("EUR", "JPY", monto);
                    break;
                case 3:
                    resultado = conversor.convertidor("MXN", "GBP", monto);
                    break;
                case 4:
                    resultado = conversor.convertidor("GBP", "CAD", monto);
                    break;
                case 5:
                    resultado = conversor.convertidor("JPY", "USD", monto);
                    break;
                case 6:
                    resultado = conversor.convertidor("MXN", "USD", monto);
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            System.out.println("Resultado: " + resultado);
            guardarHistorial("Conversión: " + monto + " a " + resultado);
        }
    }

    public static void guardarHistorial(String data) {
        try (FileWriter writer = new FileWriter("historial.txt", true)) {
            writer.write(data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
