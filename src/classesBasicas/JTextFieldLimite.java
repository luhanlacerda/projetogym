package classesBasicas;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//Créditos: http://www.java2s.com/Code/Java/Swing-JFC/LimitJTextFieldinputtoamaximumlength.htm
public class JTextFieldLimite extends PlainDocument {

    private final int limit;

    public JTextFieldLimite(int limit) {
        super();
        this.limit = limit;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }

        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}
