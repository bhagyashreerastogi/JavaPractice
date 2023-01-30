package Test_Programs2;

public class Q1 {

	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			if(i==2){
				continue;
			}
			switch (i){
			case 0:
				break;
			case 1:
				System.out.println("one");
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
			default:
				System.out.println("zero");
			}
		}
	}
}

// output : one two