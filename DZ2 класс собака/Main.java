import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("Введите имя вашей собаки");
        String name = in.next();
        
        // конструктор с одним параметром
        Sobaka sobaka = new Sobaka(name);
        
        
        System.out.println("Введите породу вашей собаки");
        String poroda = in.next();
        System.out.println("Введите пол вашей собаки");
        String pol = in.next();
        
        // конструктор с двумя параметрами
        sobaka = new Sobaka(poroda, pol);
        
        
        System.out.println("Введите имя вашей собаки");
        name = in.next();
        System.out.println("Введите возраст вашей собаки");
        int vozrast = in.nextInt();
        System.out.println("Введите вес вашей собаки");
        int ves = in.nextInt();
        
        // конструктор с тремя параметрами
        sobaka = new Sobaka(name, vozrast, ves);
        
        
        
        
        System.out.println("ДАЛЕЕ РАБОТА ПЕРЕГРУЖЕННЫХ МЕТОДОВ \n");
        
        
        
        System.out.println("Введите возраст вашей собаки");
        vozrast = in.nextInt();
        
        // перегруженный метод с одним параметром
        Sobaka sobaka2 = new Sobaka();
        sobaka2.Change(vozrast);
                   
        
        System.out.println("Введите на сколько лет ваша собака повзраслела");
        vozrast = in.nextInt();
        System.out.println("Введите на сколько увеличился ее вес");
        ves = in.nextInt();
        
        // перегруженный метод с двумя параметрами
        sobaka.Change(vozrast, ves);
        
    }
}




class Sobaka{
    
    String poroda;
    String name;
    String pol;
    int vozrast;
    int ves;
    
    final private int startVes = 3;
   
    // конструктор по умолчанию пустой
    Sobaka(){}
    
    // конструктор 1
    Sobaka(String name){
        this.name = name;
        System.out.println("Вашу собаку зовут "+this.name);    
    }
    
    // конструктор 2
    Sobaka(String poroda, String pol){
        this.poroda = poroda;
        this.pol = pol;
        System.out.println("Порода вашей собаки "+this.poroda+", пол вашей собаки "+pol);    
    }
    
    // конструктор 3
    Sobaka(String name, int vozrast, int ves){
        this.name = name;
        this.vozrast = vozrast;
        this.ves = ves;
        System.out.println("Вашу собаку зовут "+this.name+", ее возраст " +this.vozrast+" лет," +
                " вес собаки " + this.ves + "\n");    
    }
    
    
//    ПЕРЕГРУЖЕННЫЕ МЕТОДЫ     -------------------------------------------------
    
    
    // делаем метод 
    public void Change(int vozrast){
        this.vozrast = vozrast;
        System.out.println("Возраст вашей собаки "+this.vozrast+" лет");
    }  
    
    //  делаем метод перегруженным
    public void Change(int vozrast, int ves){
        this.vozrast = this.vozrast + vozrast;
        this.ves = this.startVes + ves;
        System.out.println("Собака позвраслела на "+vozrast+" лет, теперь ее возраст "+this.vozrast+" лет.");
        System.out.println("Начальный вес собаки равен " + startVes);
        System.out.println("Собака прибавила в весе на "+ves+" кг, теперь она весит "+this.ves+" кг.");
    }  
    
}