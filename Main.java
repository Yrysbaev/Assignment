import java.util.ArrayList ;
import java.util.Random ;
import java.util.Scanner;

class Randomqueue<T>{

    private ArrayList<T> items;
    private Random random;

    public Randomqueue(){
        items = new ArrayList<>();
        random = new Random();
    }

    public void adding(T per){
        items.add(per);
    }
    public T removing(){
        if (!items.isEmpty()) {
            int randomIndex = random.nextInt(items.size());
            return items.remove(randomIndex);
        } else {
            throw new IllegalStateException("Array is empty");
        }
    }


    public static void main(String[] args) {
        Randomqueue<Integer> Items = new Randomqueue<>();

        Items.adding(1);
        Items.adding(2);
        Items.adding(3);
        Items.adding(4);


        while(!Items.items.isEmpty()){
            System.out.println("What you wanna do?\n 1.Add \n 2.Remove");
            Scanner com = new Scanner(System.in);

            int command = com.nextInt();

            if (command == 1){
                System.out.println("Write the Integer for Array: ");
                int addings = com.nextInt();
                Items.adding(addings);
            }else{
                int item;
                item = Items.removing();
                System.out.println("Removed: " + item);
            }
        }

    }

}