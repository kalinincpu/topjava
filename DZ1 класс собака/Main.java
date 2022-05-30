import java.util.Scanner;


public class Main {
    
    static String startName = "Альфа";
    static int startWeight = 20;

    public static void main(String[] args) {
        
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
    int inweight;
    
    Sobaka(String name, int weight){
        this.name = name;
        this.inweight = weight;
        System.out.println("Собаку зовут "+this.name+", ее начальный вес " +this.inweight+" кг.");    
    }
    
    public void Grow(int weight){
        inweight = inweight + weight;
        System.out.println("Собака прибавила в весе на "+weight+" кг, теперь она весит "+inweight+" кг.");
    }  
}