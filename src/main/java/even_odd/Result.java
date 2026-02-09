package even_odd;

public class Result {
public static String check(int m) {
	if(m<0) {
		return "invalid";
	}
	else if(m%2 ==0){
		return "Even";
	}else {
		return "Odd";
	}
}
public static void main(String[] args) {
System.out.println(check(2));	
}
}
