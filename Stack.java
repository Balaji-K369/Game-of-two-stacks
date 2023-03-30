Game of two stacks:
------------------


import java.util.*;
public class Stack{
    public static void main(String[] args){
        int sum=0;
        Stack<Integer> s=new Stack<>();
        Stack<Integer> sk=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        sk.push(1);
        sk.push(2);
        sk.push(3);
        while(!(s.empty() && sk.empty())){
            sum=s.peek()+sk.peek();
        if(sum<10){
        s.pop();
        sk.pop();
        System.out.println("popped");
        }else
        break;
    }}
}