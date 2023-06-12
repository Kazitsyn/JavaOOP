package ComplexNumber;


public class CalculatorComplex implements CalculableComplex{
    private double realArg;
    private double imaginaryArg;
    private double resultR;
    private  double resultI;

    public CalculatorComplex(double realArg, double imaginaryArg) {
        this.realArg = realArg;
        this.imaginaryArg = imaginaryArg;
    }

    /**
     * Сложение
     *
     * @param rArg
     * @param iArg
     * @return
     */
    @Override
    public CalculableComplex sum(double rArg, double iArg) {
        resultR = realArg + rArg;
        resultI = imaginaryArg + iArg;
        realArg = resultR;
        imaginaryArg = resultI;
        return this;
    }

    /**
     * Умножение
     *
     * @param rArg
     * @param iArg
     * @return
     */
    @Override
    public CalculableComplex multi(double rArg, double iArg) {
        resultR = realArg * rArg - imaginaryArg * iArg;
        resultI = realArg * iArg + imaginaryArg * rArg;
        realArg = resultR;
        imaginaryArg = resultI;
        return this;
    }

    /**
     * Деление
     *
     * @param rArg
     * @param iArg
     * @return
     */
    @Override
    public CalculableComplex divide(double rArg, double iArg) {
        resultR = realArg * rArg + imaginaryArg * iArg;
        resultI = imaginaryArg * rArg - realArg * iArg;
        double denominator = rArg*rArg + iArg*iArg;
        realArg = resultR/denominator;
        imaginaryArg = resultI/denominator;
        return this;
    }

    /**
     * Результат
     *
     * @return
     */
    @Override
    public ComplexNumber getResult() {
        ComplexNumber complexNumber = new ComplexNumber(realArg, imaginaryArg);
        return complexNumber;
    }

}
