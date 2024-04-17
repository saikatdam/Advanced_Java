package sourceJava;

interface sample{
 void display(int value);
}


public class lamda{
    public static void main(String args[]){

    sample obj=( val)->{System.out.println("The value is " + val);

    };
    obj.display(100);
    }

}