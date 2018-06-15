public class RecursionLab {

private long [] fibArray;    
    
public int gcd(int x, int y) {
if(y == 0) {return x;}
else {
return gcd(y,x%y);
}
}

public void fibonacci(int n) {
fibArray = new long[n];
fibonacci(n,0,0);
}


private void fibonacci (int n,int count,  long... array1) {
long [] array;
array = java.util.Arrays.copyOf(array1,n+1);

if(count<=n) {
if(count == 0) {array[count] = 0;
fibonacci(n,count+1,array);}
else if(count == 1) {array[count] = 1;
fibonacci(n,count+1,array);}
else if (count > 1) {
array[count] = array[count-1]+array[count-2];
fibonacci(n,count+1,array);
}}

if(count == n) {
    fibArray = java.util.Arrays.copyOf(array,array.length);
    System.out.println(java.util.Arrays.toString(array));
    
}
}

public boolean reverse(String str) {
String orig = str.toLowerCase().replaceAll("\\W", "");;
StringBuilder revised = new StringBuilder();
revised = reverse(orig,revised);
return revised.toString().equals(orig);

}

private StringBuilder reverse(String str, StringBuilder revised) {
if (str.length() > 0) { reverse(str.substring(0,str.length()-1), revised.append(str.charAt(str.length()-1)));}
return revised;
}

}





