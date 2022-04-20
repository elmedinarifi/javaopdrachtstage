
public class Model {

    private double calculationValue;

    public void tweeNummers(double firstNumber, double secondNumber){
        calculationValue = firstNumber / secondNumber;
    }
    public double getCalculationValue(){
        return calculationValue;
    }

}