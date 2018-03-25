
public class ForLoopGauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 777; i++) {
		if(i%7==0) {
			System.out.println(i);
		}
	}
	int x=0;
	for (int i = 2002; i < 2019; i++) {
		x++;
		System.out.println("In " + i + " I was " + x + " years old");
	}
	
	int x = 0; 
	for (int i = 0; i < 3; i++) {
		x++;
		
		System.out.print(i + x);
	}
}
}
