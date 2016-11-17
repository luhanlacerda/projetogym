/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesBasicas;

import java.sql.Date;
import java.sql.Time;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Luhana
 */
//Classe final para que nenhuma outra classe possa herdar dela
public final class FormatacaoDataHora {

    //Faz com que a classe não possa ser insTãnciada já que não pode ser final abstract. Fonte: http://stackoverflow.com/questions/9618583/java-final-abstract-classxa comple
    private FormatacaoDataHora() {
        throw new AssertionError();
    }

    //Todos métodos static, para chamar sem instancia. Neste casó é obrigatório, já que não pode ser herdada e instânciada. 
    //método para converter para horário padrão. By Matheus
    //http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
    public static Time stringToTime(String fonte) {
        Time horario = null;
        try {
            String padrao = "HH:mm";
            SimpleDateFormat dataSimples = new SimpleDateFormat(padrao);
            horario = new Time(dataSimples.parse(fonte).getTime());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o horário/data informado.");
        }
        return horario;
    }

    //método para converter para data padrão BR
    public static Date stringToDate(String fonte) {
        Date data = null;
        try {
            String padrao = "dd/MM/yyyy";
            SimpleDateFormat dataSimples = new SimpleDateFormat(padrao);
            data = new Date(dataSimples.parse(fonte).getTime());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a data informada.");
        }
        return data;
    }

    //http://stackoverflow.com/questions/5683728/convert-java-util-date-to-string
    //converte de Date para String.
    public static String dateToString(Date fonte) {
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(fonte);
    }
}
