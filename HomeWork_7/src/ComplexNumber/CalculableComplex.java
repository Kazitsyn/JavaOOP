package ComplexNumber;

import Calculator.Calculable;

public interface CalculableComplex {
    /**
     * Сложение
     *
     * @param realArg
     * @param imaginaryArg
     * @return
     */
    CalculableComplex sum(double realArg, double imaginaryArg);

    /**
     * Умножение
     * @param realArg
     * @param imaginaryArg
     * @return
     */
    CalculableComplex multi(double realArg, double imaginaryArg);

    /**
     * Деление
     * @param realArg
     * @param imaginaryArg
     * @return
     */
    CalculableComplex divide(double realArg, double imaginaryArg);

    /**
     * Результат
     * @return
     */
    ComplexNumber getResult();
}
