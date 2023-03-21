import javax.swing.JOptionPane;

public class App4 {
    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog(null, "Insira algo:", JOptionPane.QUESTION_MESSAGE);

            if (input == null || input.isEmpty()) {
                throw new InputVazioException("O campo de entrada não pode estar vazio!");
            }

            JOptionPane.showMessageDialog(null, "Você digitou: " + input.toUpperCase(), input, JOptionPane.INFORMATION_MESSAGE);
        
        } catch (InputVazioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

class InputVazioException extends Exception {
    public InputVazioException(String message) {
        super(message);
    }
}
