package tugas6;

public class A {

	 public static void main(String[] args) {
	      
	        System.out.println("Deret bilangan prima dari 0 hingga 20:");
	        for (int i = 0; i <= 20; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	        
	        
	        System.out.println("\nDeret bilangan bukan prima dari 0 hingga 20:");
	        for (int i = 0; i <= 20; i++) {
	            if (!isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println();
	    }

	 
	    public static boolean isPrime(int n) {
	        if (n < 2) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    
	    }}