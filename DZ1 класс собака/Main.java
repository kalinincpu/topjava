import java.util.Scanner;


public class Main {
    
    static String startName = "�����";
    static int startWeight = 20;

    public static void main(String[] args) {
        
        Sobaka sobaka1 = new Sobaka(startName, startWeight);
        
        Scanner in = new Scanner(System.in);
        System.out.println("������� ��� �� ������� ������ ��������");
        int weight = in.nextInt();
        sobaka1.Grow(weight);
        
        System.out.println("��� ��� ������� ��� �� ������� ������ ��������");
        weight = in.nextInt();
        sobaka1.Grow(weight);
        
        System.out.println("������� ��� ��� ����� ������");
        String name = in.next();
        Sobaka sobaka2 = new Sobaka(name, startWeight);
        
        System.out.println("������� ��� �� ������� �������� ����� ������");
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
        System.out.println("������ ����� "+this.name+", �� ��������� ��� " +this.inweight+" ��.");    
    }
    
    public void Grow(int weight){
        inweight = inweight + weight;
        System.out.println("������ ��������� � ���� �� "+weight+" ��, ������ ��� ����� "+inweight+" ��.");
    }  
}