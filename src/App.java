import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String senha = "";
        boolean senhaValida = false; 

        while (!senhaValida) {
            System.out.println("Digite uma senha para validação: ");
            senha = scanner.nextLine();

            if (senha.equals("SAIR")) {
                System.out.println("Sistema de validação encerrando......");
                break;
            }

            String mensagemResultado = avaliarSenha(senha);
            System.out.println(mensagemResultado);

            if (mensagemResultado.startsWith("SUCESSO")) {
                senhaValida = true;
            }
        }

        scanner.close();
    }

    public static String avaliarSenha(String senha) {
        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean senhaObvia = false;

        String[] senhasObvias = {
                "12345678",
                "senha123",
                "admin123"
        };

        for (int i = 0; i < senhasObvias.length; i++) {
            if (senha.equals(senhasObvias[i])) {
                senhaObvia = true;
            }
        }

        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);

            if (Character.isUpperCase(caractere)) {
                temMaiuscula = true;
            }

            if (Character.isDigit(caractere)) {
                temNumero = true;
            }
        }

        if (senha.length() < 8) {
            return "DICA: A senha deve ter no mínimo 8 caracteres.";
        } else if (!temNumero) {
            return "DICA: Adicione pelo menos um número à sua senha.";
        } else if (senhaObvia) {
            return "ALERTA: Esta senha é muito comum ou óbvia.";
        } else if (!temMaiuscula) {
            return "DICA: Adicione pelo menos uma letra maiúscula à sua senha.";
        } else {
            return "SUCESSO: Sua senha passou nos critérios básicos!";
        }
    }
}