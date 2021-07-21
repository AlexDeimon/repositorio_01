package arrays;
import java.util.Random;
public class ArrayBidimensional {
	public static void main(String[] args) {
		int[][] array = new int[4][4];
		cargar(array);
		ver(array);
		}
	    static void cargar(int[][] a){
	         Random r = new Random();
	        for(int i=0;i<a.length;i++){
	            for(int j=0;j<a[i].length;j++){
	                a[i][j] = r.nextInt(16) + 1; 
	            }
	        }
	    }
	     
	    static void ver(int[][] a){
	        for(int i=0;i<a.length;i++){
	            for(int j=0;j<a[i].length;j++){
	                System.out.print(a[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }
}
