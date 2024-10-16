package tugas6;

public class B {

	public static void main(String[] args) {
 
        System.out.println("Deret bilangan genap dari 0 hingga 20:");
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

      
        System.out.println("\nDeret bilangan ganjil dari 0 hingga 20:");
        i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}
