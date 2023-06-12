package ComplexNumber;

import Calculator.Calculable;

public interface iCalculableComplexFactory {
    /**
     * Создание комплексного числа
     * @param realArg
     * @param imaginaryArg
     * @return
     */
    CalculableComplex create(double realArg, double imaginaryArg);
}
