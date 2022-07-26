public class Dog {
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
