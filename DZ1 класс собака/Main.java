import java.util.Scanner;
import java.io.PrintStream;


public class Main {
    
    public static void main(String[] args) {
  
        String startName = "Альфа";
        int startWeight = 20;
        
        Sobaka sobaka1 = new Sobaka(startName, startWeight);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вес на который собака выростет");
        int weight = in.nextInt();
        sobaka1.Grow(weight);
        
        System.out.println("Еще раз введите вес на который собака выростет");
        weight = in.nextInt();
        sobaka1.Grow(weight);
        
        System.out.println("Введите имя для новой собаки");
        String name = in.next();
        Sobaka sobaka2 = new Sobaka(name, startWeight);
        
        System.out.println("Введите вес на который выростет новая собака");
        weight = in.nextInt();
        sobaka2.Grow(weight);
        
    }
}


class Sobaka{
    
    String name;
    int ves;
    
    // конструктор с двумя параметрами
    Sobaka(String name, int ves){
        this.name = name;
        this.ves = ves;
        System.out.println("Собаку зовут "+this.name+", ее начальный вес " +this.ves+" кг.");    
    }
    
    // метод grow по увелечению веса
    public void Grow(int ves){
        this.ves = this.ves + ves;
        System.out.println("Собака прибавила в весе на "+ves+" кг, теперь она весит "+this.ves+" кг.");
    }  
}
