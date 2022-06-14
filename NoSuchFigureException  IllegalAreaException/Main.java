package homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchFigureException {
        

    int nFigure = 3;    
    while (nFigure > 2){
        System.out.println("1. (Фигура) Ракета Р-30 Булава.");
        System.out.println("2. (Фигура) Ракета РТ-2ПМ2.Тополь-М.");
        System.out.println("3 и более. (Фигуры) Ракеты не доступны возникнет Exception.");
        System.out.println("Введите номер запускаемой ракеты (фигуры):");
        
        Scanner console = new Scanner(System.in);
        nFigure = console.nextInt();
        

        if(nFigure == 1){ 
            System.out.println("Выбрана Ракета Р-30 Булава.");
            System.out.println("Дальность ракеты Булава = 10.000 км:");
        } 
        if(nFigure == 2){ 
            System.out.println("Выбрана Ракета РТ-2ПМ2.Тополь-М.");
            System.out.println("Дальность ракеты Тополь = 11.000 км:");
        } 
        
        // применение NoSuchFigureException
        if(nFigure != 1 && nFigure != 2) {
            try{
                throw new NoSuchFigureException();
            }catch(NoSuchFigureException e){
               System.out.println("Такой ракеты в обойме нет, введите правильное значение.");
            }               
        }     
    } 
    

        
        System.out.println("Введите расстояние до цели:");
        Scanner scannerL = new Scanner(System.in);
        int L = scannerL.nextInt();
        
        
        if(nFigure == 1){
            FigureRaketaBulava bulava1 = new FigureRaketaBulava();
            bulava1.OffsetFigure(L);          
        }
        
        if(nFigure == 2){
            FigureRaketaTopol topol1 = new FigureRaketaTopol();
            topol1.OffsetFigure(L);          
        }
                
    }
}



//-----------------          Exception          --------------------------------


class NoSuchFigureException extends Exception {
    
    public NoSuchFigureException(){}
    public NoSuchFigureException(String msg){
        super(msg);
    }    
    
}

class IllegalAreaException extends Exception {
    public IllegalAreaException(){}
    public IllegalAreaException(String msg){
        super(msg);
    }    
}



//-----------------          КЛАССЫ ФИГУРЫ РАКЕТЫ          ---------------------


class FigureRaketaBulava {
    
    private int koordL;
    
    public void OffsetFigure(int L) {

        if(L == 10000){ 
            System.out.println("Ракета прошла 10 тыс.км и попала точно в цель.");
            System.out.println("Исключений нет. Exception отсутствует.");
        }
            
            if(L < 10000){ 
                try{
                    throw new IllegalAreaException();
                }catch(IllegalAreaException e){
                    System.out.println("Exception: IllegalAreaException");
                    System.out.println("Ракета не дошла до цели, возник Exception, попробуйте еще раз.");
                }    
            }
            
            if(L > 10000){  
                try{
                    throw new IllegalAreaException();
                }catch(IllegalAreaException e){
                    System.out.println("Exception: IllegalAreaException");
                    System.out.println("Ракета прошла дальше цели, возник Exception, попробуйте еще раз.");
                }    
            }
    }
}




class FigureRaketaTopol {
    
    private int koordL;
    
    public void OffsetFigure(int L) {

        if(L == 11000){ 
            System.out.println("Ракета прошла 11 тыс.км и попала точно в цель.");
            System.out.println("Исключений нет. Exception отсутствует.");
        }
            
            if(L < 11000){ 
                try{
                    throw new IllegalAreaException();
                }catch(IllegalAreaException e){
                    System.out.println("Exception: IllegalAreaException");
                    System.out.println("Ракета не дошла до цели, возник Exception, попробуйте еще раз.");
                }    
            }
            
            if(L > 11000){  
                try{
                    throw new IllegalAreaException();
                }catch(IllegalAreaException e){
                    System.out.println("Exception: IllegalAreaException");
                    System.out.println("Ракета прошла дальше цели, возник Exception, попробуйте еще раз.");
                }    
            }
    }
}