package Calculator;

import java.util.Scanner;
import ComplexNumber.*;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            Calculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.division(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.toUpperCase().equals("Y")) {
                continue;
            }
            break;
        }
    }
    public void runComplexNum(){
        while (true){
            int real = promptInt("Введите первый аргумент real: ");
            int imaginary = promptInt("Введите первый аргумент imaginary: ");
            ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
            Calculable calculatorR = calculableFactory.create(real);
            Calculable calculatorI = calculableFactory.create(imaginary);
            while (true){
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("+")){
                    int agrR = promptInt("Введите второй аргумент real: ");
                    int agrI = promptInt("Введите второй аргумент imaginary: ");
                    calculatorR.sum(agrR);
                    calculatorI.sum(agrI);
                    continue;
                }
                if (cmd.equals("*")){
                    int agrR = promptInt("Введите второй аргумент real: ");
                    int agrI = promptInt("Введите второй аргумент imaginary: ");
                    calculatorR.multi(agrR);
                    calculatorI.multi(agrI);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber complexNumberResult =
                            new ComplexNumber(calculatorR.getResult(),calculatorI.getResult());
                    System.out.println(complexNumberResult.toString());
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
