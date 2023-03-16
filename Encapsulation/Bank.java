import java.util.Scanner;
public class Bank {
	
	private int atmpin;
	
	public int getAtmpin() {
		return atmpin;
	}
	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
	}
	
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
		Bank bb = new Bank();
		bb.setAtmpin(1234);
    
    System.out.println("Enter Pin: ");
    int p= s.nextInt();
    if(p==bb.getAtmpin())
    {
		System.out.println("Success!!");
    }else
    {
      System.err.println("Incorrect Pin!!");
    }

	}
}
