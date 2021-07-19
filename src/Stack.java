public class Stack{

    int MAX_STACK_SIZE = 10;
    int top = -1;
    char[] stack = {};

    public Stack(int MAX_STACK_SIZE){
        this.MAX_STACK_SIZE = MAX_STACK_SIZE;
        this.top = -1;
        stack = new char[MAX_STACK_SIZE];
    }

    void push(char val){
        if(isFull() == true){
            System.out.println("Stack is full!!"); 
        }else{
        stack[++top] = val;
        }
    }

    void pop(){
        if(isEmpty() == true){
            System.out.println("stack is empty!!");
        }
        --top;
    }

    char peek(){
        return stack[top];
    }

    boolean isFull(){
        if(top == MAX_STACK_SIZE){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    void pirntAllElements(){
        if(isEmpty() == true){
            System.out.println("stack is empty!!");
        }else{
        for(int i = 0; i<=top; i++){
            System.out.print(stack[i]);
        }
        System.out.println();
    }
    }

    void pushString(String text){ //문자열을 하나씩 잘라서 스택에 저장하는 함수
        int len = text.length();
        char[] charText = text.toCharArray();
        if(len == MAX_STACK_SIZE){
            System.out.println("Test length is over the MAX SIZE!");
        }else{
            for(int i = 0; i<len; i++){
                this.push(charText[i]);
            }
        }
    }

    void popContinue(int times){ //주어진 횟수대로 pop() 호출 함수
        for(int i =0; i<=times; i++){
            this.pop();
        }
    }

    public static void main(String[] args){
        Stack stack1 = new Stack(10);
        stack1.pushString("Hello!");
        stack1.pirntAllElements();

        System.out.println(stack1.peek());
        stack1.popContinue(3);

        stack1.pirntAllElements();
    }
}
