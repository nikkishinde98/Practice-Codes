package oop;

interface First 
{  
    default void display() 
    { 
        System.out.println("Class First"); 
    } 
} 
interface Second 
{  
    default void display() 
    { 
        System.out.println("Class Second"); 
    } 
}  
public class ClassOop implements First, Second 
{  
    public void display() 
    {  
        First.super.display(); 
        Second.super.display(); 
    } 
    public static void main(String args[]) 
    { 
        ClassOop op = new ClassOop(); 
        op.display(); 
    } 
}
