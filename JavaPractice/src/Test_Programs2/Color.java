package Test_Programs2;

public class Color {
	public String colorCode ="Black";
	private Color(String colorCode){
		this.colorCode=colorCode;
		System.out.println(colorCode);
	}
	public static void main(String[] args) {
		Color colorClass= new Color("White"); 	
	//	System.out.println(colorCode);  // compilation error
	}
}
