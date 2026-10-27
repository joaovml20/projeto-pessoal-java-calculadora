public class Main {
    public static void main(String[] args){
        int resposta;
        double numero1,numero2;
        System.out.print("bem-vindo a calculadora, agora escolhar a operacacao a ser realizada:\n");
        do{
            System.out.print("\nDigite 0 para fechar a calculadora\nDigite 1 para somar\nDigite 2 para subtrair");
            System.out.println("\nDigite 3 para multiplicar\nDigite 4 para dividir");
            resposta = Integer.parseInt(System.console().readLine());
            switch (resposta){
                case 0:
                    System.out.println("Encerrando a calculadora...");
                    break;
                case 1:
                    System.out.print("\nDigite o valor do primeiro numero: ");
                    numero1 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o valor do segundo numero: ");
                    numero2 = Double.parseDouble(System.console().readLine());
                    System.out.printf("Resultado da soma: %.2f",numero1 + numero2);
                    System.out.print("\nPreparando nova operacao\n");
                    break;
                case 2:
                    System.out.print("\nDigite o valor do primeiro numero: ");
                    numero1 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o valor do segundo numero: ");
                    numero2 = Double.parseDouble(System.console().readLine());
                    System.out.printf("Resultado da subtracao: %.2f",numero1 - numero2);
                    System.out.print("\nPreparando nova operacao\n");
                    break;
                case 3:
                    System.out.print("\nDigite o valor do primeiro numero: ");
                    numero1 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o valor do segundo numero: ");
                    numero2 = Double.parseDouble(System.console().readLine());
                    System.out.printf("Resultado da multiplicacao: %.2f",numero1 * numero2);
                    System.out.print("\nPreparando nova operacao\n");
                    break;
                case 4:
                    System.out.print("\nDigite o valor do primeiro numero: ");
                    numero1 = Double.parseDouble(System.console().readLine());
                    System.out.print("Digite o valor do segundo numero: ");
                    numero2 = Double.parseDouble(System.console().readLine());
                    if(numero2 == 0){
                        System.out.println("impossivel dividir por zero");
                    } else {
                        System.out.printf("Resultado da divisao: %.2f",numero1 / numero2);
                    }
                    System.out.print("\nPreparando nova operacao\n");
                    break;
                default:
                    if(resposta != 0) {
                        System.out.print("Operacao invalida");
                        System.out.print("\nPreparando nova operacao\n");
                    }
            }
        }while(resposta != 0);
    }
}
