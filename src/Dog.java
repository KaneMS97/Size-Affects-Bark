public class Dog {
    int size;
    String name;

    void bark(){
        if (size>60){
            System.out.println("Woof! Woof!");
        }else if (size>14){
            System.out.println("Roof! Roof!");
        }else{
            System.out.println("Yip! Yip!");
        }
    }
}
