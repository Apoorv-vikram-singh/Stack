import java.util.*;
public class Stack1 
{
    Scanner nn=new Scanner(System.in);
    int man=nn.nextInt();
    int arr[]=new int[man];
    int top;
    Stack1()
    {
        top=-1;
    }
    boolean isEmpty()
    {
       if(top==-1)
       {
            return false;
       }
       else
       {
           return false;
       } 
    }
    boolean isFull()
    {
        if(top>=man-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack is overflow");
        }
        else
        {
            top++;
            arr[top]=x;
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack is underflow");
            return -1;
        }
        else
        {
            int x=arr[top];
            top--;
            return x;
        }
        
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is underflow");
            return -1;
        }
        else
        {
            int x=arr[top];
            return x;
        }
    }
    public static void main(String args[])
    {
        Stack1 obj=new Stack1();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            int number=sc.nextInt();
            obj.push(number);
        }
        System.out.println(obj.pop());
        System.out.println(obj.peek());
    }
}

