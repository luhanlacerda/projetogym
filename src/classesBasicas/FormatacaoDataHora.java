/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesBasicas;

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
    

    //método para converter para horário padrão. By MahGostosão30cmNoFRIOINTENSO!
    //http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
    public static long getHorario(String fonte) {
        try {
            String padrao = "HH:mm";
            SimpleDateFormat dataSimples = new SimpleDateFormat(padrao);
            return dataSimples.parse(fonte).getTime();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o horário/data informado.");
        }
        return 0;
    }

    //método para converter para data padrão BR
    public static long getData(String fonte) {
        try {
            String padrao = "dd/MM/yyyy";
            SimpleDateFormat dataSimples = new SimpleDateFormat(padrao);
            return dataSimples.parse(fonte).getTime();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a data informada.");
        }
        return 0;
    }
}
