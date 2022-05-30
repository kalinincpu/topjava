import java.util.Scanner;
import java.io.PrintStream;


public class Main {
    
    public static void main(String[] args) {
  
        String startName = "�����";
        int startWeight = 20;
        
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
    int ves;
    
    // ����������� � ����� �����������
    Sobaka(String name, int ves){
        this.name = name;
        this.ves = ves;
        System.out.println("������ ����� "+this.name+", �� ��������� ��� " +this.ves+" ��.");    
    }
    
    // ����� grow �� ���������� ����
    public void Grow(int ves){
        this.ves = this.ves + ves;
        System.out.println("������ ��������� � ���� �� "+ves+" ��, ������ ��� ����� "+this.ves+" ��.");
    }  
}
