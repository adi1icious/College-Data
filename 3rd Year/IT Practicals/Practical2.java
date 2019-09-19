package practical2;

/**
  @author Aditya
 */
import java.util.*;

abstract class Stack{
    abstract void push(int x);
    abstract void pop();
    abstract void display();
}

class StaticStack extends Stack{
    int arr[]= new int[50];
    int pos=0;
    
    void push(int x){
        arr[pos]=x;
        System.out.println("In Static Pushed "+x);
        pos+=1;
    }
    
    void pop(){
        System.out.println("In Static Popped "+arr[pos-1]);
        pos-=1;
    }
    
    void display(){
        System.out.println("The StaticStack is: ");
        for (int i=0;i<pos;i++){
            System.out.println(arr[i]+"  ");
        }
    }
}

class DynamicStack extends Stack{
    ArrayList<Integer> arr= new ArrayList<Integer>();
    
    void push(int x){
        System.out.println("In Dynamic Pushed "+x);
        arr.add(x);
    }
    
    void pop(){
        System.out.println("In Dynamic Popped "+arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
    }
    
    void display(){
        System.out.println("The DynamicStack is: ");
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
public class Practical2 {
    public static void main(String[] args) {
        StaticStack s= new StaticStack();
        DynamicStack d=new DynamicStack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        d.push(0);
        d.push(1);
        d.push(2);
        d.push(3);
        s.pop();
        d.pop();
        s.display();
        d.display();
        s.pop();
        d.pop();
        s.display();
        d.display();
    }   
}
