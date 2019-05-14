import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int array[];
        do{
            System.out.println("Enter size:");
            size = scanner.nextInt();
            if (size >30){
                System.out.println("Size should not exceed 30");
            }
        } while (size >30);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter a mark of student " + (i + 1)+ ":");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("List of marks:");
        for (int j = 0 ; j < array.length ; j++){
            System.out.print(array[j] + "\t");
            if (array[j] >=5 && array[j] <= 10){
                count++;
            }
        }
        System.out.println("\n The students passed the exam are " + count);


    }
}
