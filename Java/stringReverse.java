import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String revA = new StringBuffer(A).reverse().toString();   
        System.out.println(A.equals(revA) ? "Yes": "No");
    }
}