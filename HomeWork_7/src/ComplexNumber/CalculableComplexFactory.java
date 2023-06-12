package ComplexNumber;

public class CalculableComplexFactory implements iCalculableComplexFactory{


    /**
     * Создание комплексного числа
     *
     * @param realArg
     * @param imaginaryArg
     * @return
     */
    @Override
    public CalculableComplex create(double realArg, double imaginaryArg) {
        return new CalculatorComplex(realArg, imaginaryArg);
    }
}
