import Calculator.ConsoleLogger;
import Calculator.ICalculableFactory;
import Calculator.LogCalculableFactory;
import Calculator.ViewCalculator;
import ComplexNumber.*;

// Создать логирование операций, для класса Calculator.Calculator. Класс Calculator.Calculator не должен изменится.
public class Main {
    public static void main(String[] args) {
//        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
//        ViewCalculator view = new ViewCalculator(calculableFactory);
//        view.run();

        iCalculableComplexFactory calculableComplexFactory = new LogCalculatorComplexFactory(new ConsoleLogger());
        ViewComplexCalculator viewComplex = new ViewComplexCalculator(calculableComplexFactory);
        viewComplex.runComplexNum();
    }
}
