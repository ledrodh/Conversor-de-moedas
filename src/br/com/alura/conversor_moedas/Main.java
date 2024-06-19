package br.com.alura.conversor_moedas;
import java.io.IOException;
import java.util.Scanner;
import br.com.alura.conversor_moedas.ConvertService;
import static br.com.alura.conversor_moedas.Clear_screen.clearScreen.centralizarTexto;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*************************************\n");
        System.out.println("Bem vindo ao super convetor de moedas\n");
        int op;
        System.out.print("""
                1) Real -> Dólar
                2) Real -> Peso argentino
                3) Real -> Euro
                4) Dólar -> Real
                5) Peso argentino -> Real
                6) Euro -> Real
                0) Sair
                                      
                Escolha uma opção:\s""");
        op = sc.nextInt();
        do {
            switch (op) {
                case 1:
                    try {
                        Double currency = ConvertService.currencyApi("BRL", "USD");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        Clear_screen.clearScreen();


                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 2:
                    // CurrencyConverterService.currencyApi("BRL","ARS" );
                    System.out.println("A conversão de BRL para ARS é: ");
                    try {
                        Double currency = ConvertService.currencyApi("BRL", "ARS");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        Clear_screen.clearScreen();

                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }

                    break;
                case 3:
                    //CurrencyConverterService.currencyApi("BRL", "EUR");

                    try {
                        Double currency = ConvertService.currencyApi("BRL", "EUR");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        Clear_screen.clearScreen();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é invalido.");
                    }
                    break;
                case 4:
                    // CurrencyConverterService.currencyApi("USD", "BRL");
                    try {
                        Double currency = ConvertService.currencyApi("USD", "BRL");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        Clear_screen.clearScreen();

                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 5:
                    //CurrencyConverterService.currencyApi("ARS", "BRL");
                    try {
                        Double currency = ConvertService.currencyApi("ARS", "BRL");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);


                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        Clear_screen.clearScreen();

                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }

                    break;
                case 6:
                    // CurrencyConverterService.currencyApi("EUR","BRL");
                    try {
                        Double currency = ConvertService.currencyApi("EUR", "BRL");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        Clear_screen.clearScreen();


                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 0);

    }

    // Método para exibir o submenu de outras opções
    public static void exibirSubMenuOutrasOpcoes() {
        System.out.println("\n*** Outras opções ***\n");
        // Implemente aqui o submenu com todas as outras opções oferecidas pela API
    }
    }


