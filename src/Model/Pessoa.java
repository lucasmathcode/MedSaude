package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {

    private String Nome;
    private String CPF;
    private int Idade;
    Date Data_Niver;
    private String telefone;
    private String rua;

    public Pessoa(String Nome, String CPF, String Nascimento, String telefone, String rua) throws ParseException {
        this.Nome = Nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.rua = rua;
        setData_Niver(Nascimento);
        CalcularIdade();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    private void setData_Niver(String Nascimento) throws ParseException {
        SimpleDateFormat Formatacao = new SimpleDateFormat("dd/MM/yyyy");
        this.Data_Niver = Formatacao.parse(Nascimento);

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        //PROXIMA AULA!
        return Idade;
    }

    public String getData_Niver() {
        String dataconsulta;
        // Declaramos uma variável chamada dataconsulta onde vamos guardar o resultado final.

        Calendar calendario = Calendar.getInstance();
        // Criamos um objeto chamado calendario que vai nos ajudar a trabalhar com datas.

        calendario.setTime(Data_Niver);
        // Aqui, configuramos o calendario para a data de aniversário (Data_Niver).

        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        // Pegamos o dia do mês da data de aniversário e guardamos na variável dia.

        int mes = calendario.get(Calendar.MONTH) + 1;
        // Pegamos o mês da data de aniversário e guardamos na variável mes. 
        // Adicionamos 1 porque os meses no Java começam do zero (Janeiro é 0, Fevereiro é 1, etc.).

        int ano = calendario.get(Calendar.YEAR);
        // Pegamos o ano da data de aniversário e guardamos na variável ano.

        //Está nesse formato pq o BD entende nessa formatação: Ano, mês e dia.
        if (mes < 10) {
            dataconsulta = ano + "-0" + mes + "-" + dia;
        } else {
            dataconsulta = ano + "-" + mes + "-" + dia;
        }
        return dataconsulta;
    }

    public void CalcularIdade() {
        Date Hoje = new Date();
// Criamos um objeto chamado Hoje que guarda a data atual (hoje).

        Calendar calendario = Calendar.getInstance();
// Criamos um objeto chamado calendario que nos ajuda a trabalhar com datas.

        calendario.setTime(Hoje);
// Configuramos o calendario para a data de hoje.

        int dia_hoje = calendario.get(Calendar.DAY_OF_MONTH);
// Pegamos o dia do mês de hoje e guardamos na variável dia_hoje.

        int mes_hoje = calendario.get(Calendar.MONTH) + 1;
// Pegamos o mês de hoje e guardamos na variável mes_hoje. 
// Adicionamos 1 porque os meses no Java começam do zero.

        int ano_hoje = calendario.get(Calendar.YEAR);
// Pegamos o ano de hoje e guardamos na variável ano_hoje.

        calendario.setTime(Data_Niver);
// Configuramos o calendario para a data de aniversário (Data_Niver).

        int dia_aniver = calendario.get(Calendar.DAY_OF_MONTH);
// Pegamos o dia do mês da data de aniversário e guardamos na variável dia_aniver.

        int mes_aniver = calendario.get(Calendar.MONTH) + 1;
// Pegamos o mês da data de aniversário e guardamos na variável mes_aniver. 
// Adicionamos 1 porque os meses no Java começam do zero.

        int ano_aniver = calendario.get(Calendar.YEAR);
// Pegamos o ano da data de aniversário e guardamos na variável ano_aniver.

        Idade = ano_hoje - ano_aniver;
// Calculamos a idade subtraindo o ano de aniversário do ano atual.

        if (mes_hoje < mes_aniver) {
            Idade--;
            // Se o mês atual for menor que o mês de aniversário, a pessoa ainda não fez aniversário este ano.
            // Então subtraímos 1 da idade.
        } else if ((mes_hoje == mes_aniver) && (dia_hoje < dia_aniver)) {
            Idade--;
            // Se estamos no mês de aniversário, mas o dia de hoje é antes do dia de aniversário,
            // a pessoa ainda não fez aniversário este ano. Então subtraímos 1 da idade.
        }

        if (Idade < 0) {
            Idade = 0;
            // Se por algum motivo a idade calculada for menor que 0, ajustamos para 0.
        }

    }

}
