package july1.hackerrank;

import java.util.Scanner;

public class Anagrams2 {
	
    static boolean isAnagram(String a, String b) {
        // Complete the function
    	String asd = "asdfhjFDKJ34209";
        int bucketA[] = new int[10000];
        for(int i = 0; i < a.length(); i++){
        	bucketA[a.toLowerCase().charAt(i)]++;
        }
        int bucketB[] = new int[10000];
        for(int i = 0; i < b.length(); i++){
        	bucketB[b.toLowerCase().charAt(i)]++;
        }
        boolean isAng = true;
        for(int i = 0; i < 10000; i++){
            if(bucketA[i] != bucketB[i]){
                isAng = false;
                break;
            }
        }
        return isAng;
    }
	
	public static void main(String ar[]){
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
