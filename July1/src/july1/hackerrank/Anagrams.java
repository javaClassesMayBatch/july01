package july1.hackerrank;

import java.util.Scanner;

public class Anagrams {
	
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int bucket[] = new int[26];
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == 'a'){
                bucket[0]++;
            }else if(a.charAt(i) == 'b'){
                bucket[1]++;
            }else if(a.charAt(i) == 'c'){
                bucket[2]++;
            }else if(a.charAt(i) == 'd'){
                bucket[3]++;
            }else if(a.charAt(i) == 'e'){
                bucket[4]++;
            }else if(a.charAt(i) == 'f'){
                bucket[5]++;
            }else if(a.charAt(i) == 'g'){
                bucket[6]++;
            }else if(a.charAt(i) == 'h'){
                bucket[7]++;
            }else if(a.charAt(i) == 'i'){
                bucket[8]++;
            }else if(a.charAt(i) == 'j'){
                bucket[9]++;
            }else if(a.charAt(i) == 'k'){
                bucket[10]++;
            }else if(a.charAt(i) == 'l'){
                bucket[11]++;
            }else if(a.charAt(i) == 'm'){
                bucket[12]++;
            }else if(a.charAt(i) == 'n'){
                bucket[13]++;
            }else if(a.charAt(i) == 'o'){
                bucket[14]++;
            }else if(a.charAt(i) == 'p'){
                bucket[15]++;
            }else if(a.charAt(i) == 'q'){
                bucket[16]++;
            }else if(a.charAt(i) == 'r'){
                bucket[17]++;
            }else if(a.charAt(i) == 's'){
                bucket[18]++;
            }else if(a.charAt(i) == 't'){
                bucket[19]++;
            }else if(a.charAt(i) == 'u'){
                bucket[20]++;
            }else if(a.charAt(i) == 'v'){
                bucket[21]++;
            }else if(a.charAt(i) == 'w'){
                bucket[22]++;
            }else if(a.charAt(i) == 'x'){
                bucket[23]++;
            }else if(a.charAt(i) == 'y'){
                bucket[24]++;
            }else if(a.charAt(i) == 'z'){
                bucket[25]++;
            }
        }
        int bucketB[] = new int[26];
        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) == 'a'){
                bucketB[0]++;
            }else if(b.charAt(i) == 'b'){
                bucketB[1]++;
            }else if(b.charAt(i) == 'c'){
                bucketB[2]++;
            }else if(b.charAt(i) == 'd'){
                bucketB[3]++;
            }else if(b.charAt(i) == 'e'){
                bucketB[4]++;
            }else if(b.charAt(i) == 'f'){
                bucketB[5]++;
            }else if(b.charAt(i) == 'g'){
                bucketB[6]++;
            }else if(b.charAt(i) == 'h'){
                bucketB[7]++;
            }else if(b.charAt(i) == 'i'){
                bucketB[8]++;
            }else if(b.charAt(i) == 'j'){
                bucketB[9]++;
            }else if(b.charAt(i) == 'k'){
                bucketB[10]++;
            }else if(b.charAt(i) == 'l'){
                bucketB[11]++;
            }else if(b.charAt(i) == 'm'){
                bucketB[12]++;
            }else if(b.charAt(i) == 'n'){
                bucketB[13]++;
            }else if(b.charAt(i) == 'o'){
                bucketB[14]++;
            }else if(b.charAt(i) == 'p'){
                bucketB[15]++;
            }else if(b.charAt(i) == 'q'){
                bucketB[16]++;
            }else if(b.charAt(i) == 'r'){
                bucketB[17]++;
            }else if(b.charAt(i) == 's'){
                bucketB[18]++;
            }else if(b.charAt(i) == 't'){
                bucketB[19]++;
            }else if(b.charAt(i) == 'u'){
                bucketB[20]++;
            }else if(b.charAt(i) == 'v'){
                bucketB[21]++;
            }else if(b.charAt(i) == 'w'){
                bucketB[22]++;
            }else if(b.charAt(i) == 'x'){
                bucketB[23]++;
            }else if(b.charAt(i) == 'y'){
                bucketB[24]++;
            }else if(b.charAt(i) == 'z'){
                bucketB[25]++;
            }
        }
        boolean isAng = true;
        for(int i = 0; i < 26; i++){
            if(bucket[i] != bucketB[i]){
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
