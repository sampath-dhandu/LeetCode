/**
 * 
 */
package practise;

/**
 * @author sampathdhand
 *
 */
public class StaircaseProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staircase(5);

	}

	private static void staircase(int n) {

//		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {

//			switch (i) {
//			case 1:
//				sb.append("#");
//				break;
//			case 2:
//				sb.append("\n"+"##");
//				break;
//			case 3:
//				sb.append("\n"+"###" );
//				break;
//			case 4:
//				sb.append("\n"+"####") ;
//				break;
//			case 5:
//				sb.append("\n"+"#####");
//				break;
//			default:
//				break;
//			}
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++)
				System.out.print("#");
			System.out.println();
		}
//
	}

}
