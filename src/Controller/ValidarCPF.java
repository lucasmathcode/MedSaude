package Controller;

public class ValidarCPF {

    public static boolean ValidarCPF(String CPF) {

        // Remover caracteres não numéricos do CPF
        CPF = CPF.replaceAll("[^0-9]", "");

        // Verificar se o CPF possui 11 dígitos
        if (CPF.length() != 11) {
            return false;
        }

        // Verificar se todos os dígitos são iguais
        if (CPF.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Cálculo do primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            // Convertendo o caractere CPF.charAt(i) para inteiro e multiplicando pelo peso (10 - i)
            soma += Integer.parseInt(String.valueOf(CPF.charAt(i))) * (10 - i);
        }

// Calculando o primeiro dígito verificador
        int digito1 = 11 - (soma % 11);

// Se o primeiro dígito verificador for maior que 9, ajusta para 0
        if (digito1 > 9) {
            digito1 = 0;
        }

// Verificação do primeiro dígito verificador
// Convertendo o décimo caractere do CPF (primeiro dígito verificador real) para inteiro
        if (Integer.parseInt(String.valueOf(CPF.charAt(9))) != digito1) {
            // Se não coincidir retorna falso
            return false;
        }

// Cálculo do segundo dígito verificador
// Reinicializa a variável soma para calcular o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            // Convertendo o caractere CPF.charAt(i) para inteiro e multiplicando pelo peso (11 - i)
            soma += Integer.parseInt(String.valueOf(CPF.charAt(i))) * (11 - i);
        }

// Calculando o segundo dígito verificador
        int digito2 = 11 - (soma % 11);

// Se o segundo dígito verificador for maior que 9, ajusta para 0
        if (digito2 > 9) {
            digito2 = 0;
        }

// Verificação do segundo dígito verificador
// Convertendo o décimo primeiro caractere do CPF (segundo dígito verificador real) para inteiro
        if (Integer.parseInt(String.valueOf(CPF.charAt(10))) != digito2) {
            return false;
        }

        // CPF válido
        return true;
    }
}

// A gente utilizou o 'for' para iterar sobre os caracteres do CPF e calcular os dígitos verificadores
// Primeiro loop calcula o primeiro dígito verificador, segundo loop calcula o segundo dígito verificador