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
public class QueueArray {
    private final int N=4;
    private int front , rear, count ,qarray[];
    
    public QueueArray(){
        front = rear = count =0;
        qarray= new int[N];
    }
    public boolean empty(){
        return count <=0;
    }
    public boolean full(){
        return count >=N;
    }
    public void enqueue(int item){
        if (full()){
            throw new RuntimeException("Queue is full: item not enqueued");}
        else{
        qarray[rear]=item;
        rear=(rear+1)%N;
        count++;}
    }
    public int dequeue(){
        if (empty ()){
            throw new RuntimeException("Queue is empty");}
        else{
        int item =qarray[front];
        front =(front +1)%N;
        count--;
        return item;}
            
    }
    
    public static void main(String[] args) {
        QueueArray cola = new QueueArray();
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);
        cola.enqueue(4);
        System.out.println(cola.dequeue());
        cola.enqueue(8);
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.empty());
        
        
    }
}
