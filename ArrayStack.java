/**
* Source     : arrayStack.java
* Author     : Bonilla, Raymart
* Url        : https://github.com/mattSandoval
* Updated_at : Aug 24, 2016
*
*/
public class ArrayStack {
    public int top;
    public int capacity;
    public String[] stack ;

    public ArrayStack(int arraySize) {
        capacity = arraySize;
        stack= new int[capacity];
        top = -1;
    }

    public void push(String value){
        if(top==size-1){
            System.out.println("stack is full");
        }
        else{
            top = top+1;
            stack[top] = value;
        }
    }

    public void pop(){
        if(!isEmpty())
            top = top-1;
        else{
            System.out.println("stack is empty");
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void display(){

        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }
	
   public static void main(String[] args) {
      ArrayStack sample = new ArrayStack(5);
	
      sample.push("Lorem");
      sample.push("Ipsum");
      sample.display();
      sample.pop();
   }
}
