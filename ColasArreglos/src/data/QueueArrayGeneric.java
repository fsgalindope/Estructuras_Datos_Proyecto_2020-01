/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author FABIa
 */
public class QueueArrayGeneric<T> {
    private final int N=4;
    private int front, rear , count;
    private T[] qarray;
    
    public QueueArrayGeneric (){
        front= rear= count =0;
        qarray = (T[]) new Object [N];
    }
    public T dequeue (){
        if (empty())
            throw new RuntimeException();
        T item = qarray[front];
        front = (front +1)%N;
        count--;
        return item;
    }
    public void enqueue (T item){
        if (full())
            throw new RuntimeException();
        qarray[rear]=item;
        rear=(rear+1)%N;
        count++;
        
    }
    public boolean empty (){
        return count <=0;
        
    }
    public boolean full (){
        return count >= N;
    }
    
}
