package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class Consulta extends Pessoa {

    Date data_consulta;
    private String horario;
    private String medico;

    public Consulta(String consulta, String horario, String medico, String Nome, String CPF, String Nascimento, String telefone, String rua) throws ParseException {
        super(Nome, CPF, Nascimento, telefone, rua);
        setData_consulta(consulta);
        this.horario = horario;
        this.medico = medico;
    }

    public Consulta(String Nome, String consulta, String horario, String medico, String CPF) throws ParseException {
        super(Nome, CPF, null, null, null);
        setData_consulta(consulta);
        this.horario = horario;
        this.medico = medico;

    }

    @Override
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

    public void setData_consulta(String consulta) throws ParseException {
        SimpleDateFormat Formatacao = new SimpleDateFormat("dd/MM/yyyy");
// Criamos um objeto chamado Formatacao que vai nos ajudar a formatar e entender datas no formato "dia/mês/ano".

        this.Data_Niver = Formatacao.parse(consulta);
// Usamos o objeto Formatacao para converter um texto (consulta) em uma data (Data_Niver) no formato "dia/mês/ano".
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

}
