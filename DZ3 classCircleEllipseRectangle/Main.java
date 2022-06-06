package homework;

public class Main {

    public static void main(String[] args) {
        
        Figure circle = new Circle();
        circle.PerimeterFigure(20);
        circle.OffsetFigure(35, 50);
        
        Figure ellipse = new Ellipse();
        ellipse.PerimeterFigure(20, 10);
        ellipse.OffsetFigure(15, 33);
        
        Figure rectangle = new Rectangle();
        rectangle.PerimeterFigure(30, 40);
        rectangle.OffsetFigure(22, 18);
        
    }
}



// абстрактный класс, потому что неизвестно какие фигуры будут
abstract class Figure{
    
    private int koordX;
    private int koordY;
    
    // абстрактные методы, потому что неизвестно какие фигуры будут
    abstract public void PerimeterFigure(int r); 
    abstract public void PerimeterFigure(int db, int dm); 
    
    // просто метод, потому что соответствует любым фигурам
    public void OffsetFigure(int x,int y){
        koordX = koordX + x;
        koordY = koordY + y;
        System.out.println("Фигура сместилась:");
        System.out.println("По координате Х на " + koordX + "ед.");
        System.out.println("По координате Y на " + koordY + "ед. \n");
    }
}



class Circle extends Figure{
    
    @Override
    public void PerimeterFigure(int r){
        double pi = 3.14;
        double Perimeter = 2 * pi * r;
        System.out.printf("Периметр круга равен: %.1f \n", Perimeter);
    }
    
    @Override
    public void PerimeterFigure(int db, int dm) {}
}


class Ellipse extends Figure{
    @Override
    public void PerimeterFigure(int db, int dm){
        double pi = 3.14;
        double Perimeter = 2 * pi * Math.sqrt((db*db+dm*dm)/8);
        System.out.printf("Периметр эллипса равен: %.1f \n", Perimeter);
    }

    @Override
    public void PerimeterFigure(int r) {}
}


class Rectangle extends Figure{
    @Override
    public void PerimeterFigure(int storon1, int storon2){
        double Perimeter = (storon1 + storon2) * 2;
        System.out.printf("Периметр прямоугольника равен: %.1f \n", Perimeter);
    }

    @Override
    public void PerimeterFigure(int r) {}
}