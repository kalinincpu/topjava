
package cicle;


public class Cicle {

    
    public static void main(String[] args) {
        
        // создание массива
        int[] array = new int[10];
        
        // заполнение массива
        for(int i=0; i<10; i++){
            
            array[i] = i * 2;
        }
        
        // вывод массива
        for(int j=0; j<10; j++){
            
            System.out.print(j + ", ");
        }
        
    }
}
