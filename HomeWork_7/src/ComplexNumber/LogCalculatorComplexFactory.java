package ComplexNumber;

import Calculator.Calculable;
import Calculator.Calculator;
import Calculator.LogCalculator;
import Calculator.Loggable;

public class LogCalculatorComplexFactory implements iCalculableComplexFactory{
    private Loggable logger;

    public LogCalculatorComplexFactory(Loggable logger){
        this.logger = logger;
    }

    public CalculableComplex create(double realArg, double imaginaryArg) {
        return new LogCalculatorComplex(new CalculatorComplex(realArg, imaginaryArg), logger);
    }
}
