/*    ДОМАШНЕЕ ЗАДАНИЕ
Создать программу, используя обобщённые типы и метасимвольные переменные 
по вычислению результат деления произведения элементов числовых 
(Integer, Double типов) массивов  на количество элементов, добавить логику 
по проверке одинаково ли это значение у различных массивов. 
Продемонстрировать работу в демо классе
*/

package javaapplication1;


public class Main {

    
    public static void main(String[] args) {
        
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7};
        // создаем обьект, заменя обобщенный тип Т, на тип <Integer> 
        Calculator<Integer> intCalc = new Calculator<>();
        // заносим массив в метод setArray, класса Calculator
        intCalc.setArray(intArray);
        // получаем результата деления, произведения элементов числовых массивов
        intCalc.arrayCalculate();
        
        
        Double[] doubleArray = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8};
        // создаем обьект, заменя обобщенный тип Т, на тип <Double> 
        Calculator<Double> doubleCalc = new Calculator<>();
        // заносим массив в метод setArray, класса Calculator
        doubleCalc.setArray(doubleArray);
        // получаем результата деления, произведения элементов числовых массивов
        doubleCalc.arrayCalculate();
        
        // в обьект intCalc заносим обьект doubleCalc 
        // используя метасимвольные параметры Calculator<?> calc
        // методом Comparator делаем сравнение вычисленных величин.
        boolean compar = intCalc.Comparator(doubleCalc);

        if(compar == true)System.out.println("Вычисленные значения равны");
        if(compar == false)System.out.println("Вычисленные значения НЕ равны");
        
    }         
}


//Класс с ограниченным обобщенным типом, ограничение классом Number
class Calculator <T extends Number> {
    
    private T[] array;

    // метод ввода числовых массивов
    public void setArray(T[]array) { 
        this.array = array.clone(); 
    }
    
    // метод по вычислению результата деления, произведения элементов числовых массивов
    public double arrayCalculate(){
        double sum = 1.0;
        for(T value: array){
            sum = sum * value.doubleValue();
        }
        return sum / array.length;   
    }
    
    // метод сравнения результата arrayCalculate
    boolean Comparator(Calculator<?> calc){
        return arrayCalculate() == calc.arrayCalculate();
    }
}