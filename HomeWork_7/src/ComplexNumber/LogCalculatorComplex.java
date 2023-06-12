package ComplexNumber;

import Calculator.Calculable;
import Calculator.Loggable;

public class LogCalculatorComplex implements CalculableComplex{
    private CalculableComplex decorated;
    private Loggable logger;

    public LogCalculatorComplex(CalculableComplex decorated, Loggable logger){
        this.decorated = decorated;
        this.logger = logger;
    }

    /**
     * Сложение
     *
     * @param realArg
     * @param imaginaryArg
     * @return
     */
    @Override
    public CalculableComplex sum(double realArg, double imaginaryArg) {
        double rArg = decorated.getResult().getReal();
        double iArg = decorated.getResult().getImaginary();
        logger.log(String.format("Первое значение калькулятора (%.2f, %.2f i). Начало вызова метода sum с параметром (%.2f, %.2f i)", rArg, iArg, realArg, imaginaryArg));
        CalculableComplex result = decorated.sum(realArg, imaginaryArg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    /**
     * Умножение
     *
     * @param realArg
     * @param imaginaryArg
     * @return
     */
    @Override
    public CalculableComplex multi(double realArg, double imaginaryArg) {
        double rArg = decorated.getResult().getReal();
        double iArg = decorated.getResult().getImaginary();
        logger.log(String.format("Первое значение калькулятора (%.2f, %.2f i). Начало вызова метода sum с параметром (%.2f, %.2f i)", rArg, iArg, realArg, imaginaryArg));
        CalculableComplex result = decorated.multi(realArg, imaginaryArg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    /**
     * Деление
     *
     * @param realArg
     * @param imaginaryArg
     * @return
     */
    @Override
    public CalculableComplex divide(double realArg, double imaginaryArg) {
        double rArg = decorated.getResult().getReal();
        double iArg = decorated.getResult().getImaginary();
        logger.log(String.format("Первое значение калькулятора (%.2f, %.2f i). Начало вызова метода sum с параметром (%.2f, %.2f i)", rArg, iArg, realArg, imaginaryArg));
        CalculableComplex result = decorated.divide(realArg, imaginaryArg);
        logger.log(String.format("Вызова метода divide произошел"));
        return result;
    }

    /**
     * Результат
     *
     * @return
     */
    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = decorated.getResult();
        logger.log(String.format("Получение результата: " + result.toString()));
        return result;
    }
}
