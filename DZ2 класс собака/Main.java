import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("������� ��� ����� ������");
        String name = in.next();
        
        // ����������� � ����� ����������
        Sobaka sobaka = new Sobaka(name);
        
        
        System.out.println("������� ������ ����� ������");
        String poroda = in.next();
        System.out.println("������� ��� ����� ������");
        String pol = in.next();
        
        // ����������� � ����� �����������
        sobaka = new Sobaka(poroda, pol);
        
        
        System.out.println("������� ��� ����� ������");
        name = in.next();
        System.out.println("������� ������� ����� ������");
        int vozrast = in.nextInt();
        System.out.println("������� ��� ����� ������");
        int ves = in.nextInt();
        
        // ����������� � ����� �����������
        sobaka = new Sobaka(name, vozrast, ves);
        
        
        
        
        System.out.println("����� ������ ������������� ������� \n");
        
        
        
        System.out.println("������� ������� ����� ������");
        vozrast = in.nextInt();
        
        // ������������� ����� � ����� ����������
        Sobaka sobaka2 = new Sobaka();
        sobaka2.Change(vozrast);
                   
        
        System.out.println("������� �� ������� ��� ���� ������ �����������");
        vozrast = in.nextInt();
        System.out.println("������� �� ������� ���������� �� ���");
        ves = in.nextInt();
        
        // ������������� ����� � ����� �����������
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
   
    // ����������� �� ��������� ������
    Sobaka(){}
    
    // ����������� 1
    Sobaka(String name){
        this.name = name;
        System.out.println("���� ������ ����� "+this.name);    
    }
    
    // ����������� 2
    Sobaka(String poroda, String pol){
        this.poroda = poroda;
        this.pol = pol;
        System.out.println("������ ����� ������ "+this.poroda+", ��� ����� ������ "+pol);    
    }
    
    // ����������� 3
    Sobaka(String name, int vozrast, int ves){
        this.name = name;
        this.vozrast = vozrast;
        this.ves = ves;
        System.out.println("���� ������ ����� "+this.name+", �� ������� " +this.vozrast+" ���," +
                " ��� ������ " + this.ves + "\n");    
    }
    
    
//    ������������� ������     -------------------------------------------------
    
    
    // ������ ����� 
    public void Change(int vozrast){
        this.vozrast = vozrast;
        System.out.println("������� ����� ������ "+this.vozrast+" ���");
    }  
    
    //  ������ ����� �������������
    public void Change(int vozrast, int ves){
        this.vozrast = this.vozrast + vozrast;
        this.ves = this.startVes + ves;
        System.out.println("������ ����������� �� "+vozrast+" ���, ������ �� ������� "+this.vozrast+" ���.");
        System.out.println("��������� ��� ������ ����� " + startVes);
        System.out.println("������ ��������� � ���� �� "+ves+" ��, ������ ��� ����� "+this.ves+" ��.");
    }  
    
}