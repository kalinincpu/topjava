/*
ДОМАШНЕЕ ЗАДАНИЕ:
1. Создать собственную аннотацию - 
2. доступ к аннотациям во времени исполнения. 
Аннотация с двумя полями - типа int (уровень доступа) и String (сообщение), 
3. целевое использование TYPE, 
4. аннотировать класс, 
5. создать статический метод по получению данных об этой аннотации, 
используя внутри стандартный метод по получению данных об используемой аннотации 
6. вывести данные полей аннотации в консоль. 
7. Продемонстрировать работу метода в main 
*/
package myannotation;


import java.lang.annotation.*;


// 1. Создать собственную аннотацию
// 2. доступ к аннотациям во времени исполнения.
@Retention(RetentionPolicy.RUNTIME)
// 3. целевое использование TYPE,
@Target(ElementType.TYPE)
@interface MyAnnotati {
    String str();
    int value();
}


// 4. аннотировать класс
@MyAnnotati(str = "Пример Моей Аннотации", value = 12345)
class MyClass{

    // 5. создать статический метод по получению данных об этой аннотации,
    public static void myMethod() {
       
        MyClass myClass = new MyClass();

	MyAnnotati myAnnotation = myClass.getClass().getAnnotation(MyAnnotati.class);
        
        // 6. вывести данные полей аннотации в консоль.
        System.out.println("Первый параметр аннотации 1 = " + myAnnotation.str());
	System.out.println("Второй параметр аннотации 2 = " + myAnnotation.value());
          
    }
}



// 7. Продемонстрировать работу метода в main 
public class MyAnnotation {

    public static void main(String[] args) {
        
        MyClass.myMethod();
        
    }
    
}
