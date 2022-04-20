import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;

        this.view.addCalculationListener(new buttonCalculate());
    }
    class buttonCalculate implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            double firstNumber, secondNumber = 0;

            try{
                firstNumber  = view.getfirstNumber();
                secondNumber  = view.getsecondNumber();

                model.tweeNummers(firstNumber, secondNumber);

                view.setAntwoord(model.getCalculationValue());
            }
            catch(NumberFormatException ex){
                view.displayErrorM("Type in 2 integers");
            }
        }
    }
}