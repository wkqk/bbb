

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		/*System.out.println(" ?Ό     ?      ?       ?      λͺ?      κΈ?     ? ");
		System.out.println("___________________________");
		System.out.println(" 1   2   3   4   5   6   7");
		System.out.println(" 8   9  10  11  12  13  14");
		System.out.println("15  16  17  18  19  20  21");
		System.out.println("23  23  24  25  26  27  28");
		System.out.println("29  30  31");
		System.out.println();*/
/*
* ?? ?? ₯?λ©? κ·? ?¬?΄ λͺμΌλ‘? κ΅¬μ±??΄ ??μ§? μΆλ ₯?? ?λ‘κ·Έ?¨ ??±?κΈ?
?? ₯κ²°κ³Ό ??
?¬? ?? ₯??Έ?.
3 (??°)
3??? 31?ΌκΉμ? ??΅??€. 
*/	
    Scanner scan=new Scanner(System.in);
    int dal[]= {31,28,31,30,31,30,31,31,30,31,30,31,};
	while (true) {
		System.out.println("?¬? ?? ₯??Έ?.");
		int month = scan.nextInt();
		if(month==-1) {
			System.out.println("μ’λ£?©??€.");
			break;
		}
		System.out.printf("%d?  %d?ΌκΉμ? ??΅??€.\n", month, dal[month - 1]);
	}
  }
}
