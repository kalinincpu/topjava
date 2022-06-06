package homework;

public class Main {

    public static void main(String[] args) {
        
        Circle circle = new Circle();
        // реализация абстрактного метода, абстрактного класса
        circle.PerimeterFigure(20);
        // реализация интерфейса Movable
        circle.OffsetFigure(35, 50);
        // реализация интерфейса Scalable
        circle.Resize(10);
        
        
        Ellipse ellipse = new Ellipse();
        ellipse.PerimeterFigure(10, 20); 
        ellipse.OffsetFigure(35, 50); 
        ellipse.Resize(15, 20); 
        
        
        Rectangle rectangle = new Rectangle();
        rectangle.PerimeterFigure(20, 10);
        rectangle.OffsetFigure(35, 50);
        rectangle.Resize(20, 15);
                
    }
}



//-----------------          ИНТЕРФЕЙСЫ          -------------------------------


interface Movable{
    public void OffsetFigure(int x,int y);
}


interface Scalable{
    // S=πR² площадь круга
    public void Resize(int r); 
    // S=п*D*d/4  площадь эллипса и S=a*b прямоугольника
    public void Resize(int db, int dm); 
}



//-----------------     АБСТРАКТНЫЙ КЛАСС Figure  ------------------------------
// потому что неизвестно какие фигуры будут

abstract class Figure{
    
    private int koordX;
    private int koordY;
    
    // абстрактные методы, потому что неизвестно какие фигуры будут
    abstract public void PerimeterFigure(int r); 
    abstract public void PerimeterFigure(int db, int dm); 
   
}



//-----------------   НАСЛЕДНИКИ Circle, Ellipse, Rectangle
// наследники реализуют методы абстрактного класса и интерфейсов


// наследник Circle от абстрактного Figure и интерфейсов Movable, Scalable
class Circle extends Figure implements Movable, Scalable{
    
     private int koordX;
     private int koordY;
    
    // реализация метода абстрактного класса 
    @Override
    public void PerimeterFigure(int r){
        double pi = 3.14;
        double Perimeter = 2 * pi * r;
        System.out.printf("Периметр круга равен: %.1f \n", Perimeter);
    }
    @Override
    public void PerimeterFigure(int db, int dm) {}

    
    // реализация интерфейса Movable
    @Override
    public void OffsetFigure(int x, int y) {
        koordX = koordX + x;
        koordY = koordY + y;
        System.out.println("Фигура сместилась:");
        System.out.println("По координате Х на " + koordX + "ед.");
        System.out.println("По координате Y на " + koordY + "ед.");
    }
    
    // реализация интерфейса Scalable
    @Override
    public void Resize(int r) {
       double pi = 3.14;
       // S=πR² площадь круга
       double S = pi * (r * r);
       System.out.printf("Площадь круга изменилась и стала равна: %.1f \n\n", S);
    }
    @Override
    public void Resize(int x, int y) {}
}



//------------------------------------------------------------------------------
// наследник Ellipse от абстрактного Figure и интерфейсов Movable, Scalable

class Ellipse extends Figure implements Movable, Scalable{
    
     private int koordX;
     private int koordY;
    
    // реализация метода абстрактного класса
    @Override
    public void PerimeterFigure(int db, int dm){
        double pi = 3.14;
        double Perimeter = 2 * pi * Math.sqrt((db*db+dm*dm)/8);
        System.out.printf("Периметр эллипса равен: %.1f \n", Perimeter);
    }
    @Override
    public void PerimeterFigure(int r) {}
    
    // реализация интерфейса Movable
    @Override
    public void OffsetFigure(int x, int y) {
        koordX = koordX + x;
        koordY = koordY + y;
        System.out.println("Фигура сместилась:");
        System.out.println("По координате Х на " + koordX + "ед.");
        System.out.println("По координате Y на " + koordY + "ед.");
    }
    
    // реализация интерфейса Scalable
    @Override
    public void Resize(int db, int dm) {
       double pi = 3.14;
       // S=п*D*d/4  площадь эллипса
       double S = pi * db * dm / 4;
       System.out.printf("Площадь эллипса изменилась и стала равна: %.1f \n\n", S);
    }
    @Override
    public void Resize(int r) {}
}



//------------------------------------------------------------------------------
// наследник Rectangle от абстрактного Figure и интерфейсов Movable, Scalable

class Rectangle extends Figure implements Movable, Scalable{
    
     private int koordX;
     private int koordY;
    
    // реализация метода абстрактного класса
    @Override
    public void PerimeterFigure(int storon1, int storon2){
        double Perimeter = (storon1 + storon2) * 2;
        System.out.printf("Периметр прямоугольника равен: %.1f \n", Perimeter);
    }
    @Override
    public void PerimeterFigure(int r) {}
    
    // реализация интерфейса Movable
    @Override
    public void OffsetFigure(int x, int y) {
        koordX = koordX + x;
        koordY = koordY + y;
        System.out.println("Фигура сместилась:");
        System.out.println("По координате Х на " + koordX + "ед.");
        System.out.println("По координате Y на " + koordY + "ед.");
    }
    
    // реализация интерфейса Scalable
    @Override
    public void Resize(int a, int b) {
       double pi = 3.14;
       // S=a*b площадь прямоугольника  
       double S = a * b;
       System.out.printf("Площадь эллипса изменилась и стала равна: %.1f \n", S);
    }
    @Override
    public void Resize(int r) {}
}




