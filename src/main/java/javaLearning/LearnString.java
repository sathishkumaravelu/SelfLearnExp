package javaLearning;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnString obj = new LearnString();
		obj.learnString();
	}

	
	
	public void learnString() {
		
		String str = "abc";
		char data[] = {'a', 'b', 'c'};
		String str1 = new String(data);
		String str2 = new String("abc");
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str.charAt(0));
		//System.out.println(str.chars());
		int compareTo = str.compareTo(str2);
		System.out.println(compareTo);
		
		System.out.println("concate string : "+str.concat(str2));
		
		System.out.println("".concat(str2));
		
		boolean contains = str.contains("ac");
		System.out.println(contains);
		
	}
}
