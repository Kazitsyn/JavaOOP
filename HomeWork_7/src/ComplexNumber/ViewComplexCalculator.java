package ComplexNumber;

import Calculator.Calculable;

import java.util.Scanner;

public class ViewComplexCalculator {
    private iCalculableComplexFactory calculableComplexFactory;

    public ViewComplexCalculator(iCalculableComplexFactory calculableComplexFactory) {
        this.calculableComplexFactory = calculableComplexFactory;
    }

    public void runComplexNum(){
        while (true){
            int real = promptInt("Введите первый аргумент real: ");
            int imaginary = promptInt("Введите первый аргумент imaginary: ");
            ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
            CalculableComplex complexCalculator = calculableComplexFactory.create(real,imaginary);
            while (true){
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("+")){
                    int argR = promptInt("Введите второй аргумент real: ");
                    int argI = promptInt("Введите второй аргумент imaginary: ");
                    complexCalculator.sum(argR,argI);
                    continue;
                }
                if (cmd.equals("*")){
                    int argR = promptInt("Введите второй аргумент real: ");
                    int argI = promptInt("Введите второй аргумент imaginary: ");
                    complexCalculator.multi(argR,argI);
                    continue;
                }
                if (cmd.equals("/")){
                    int argR = promptInt("Введите второй аргумент real: ");
                    int argI = promptInt("Введите второй аргумент imaginary: ");
                    complexCalculator.divide(argR,argI);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = complexCalculator.getResult();
                    System.out.printf("Результат " + result.toString());
                    break;
                }
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}
