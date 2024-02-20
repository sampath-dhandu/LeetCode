/**
 * 
 */
package practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sampathdhand
 *
 */
public class DateUtil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(new SimpleDateFormat("dd-MMM-yyyy")
					.format(generateDate()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static Date generateDate() throws Exception {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String todayDate = formatter.format(new Date());
		Date formattedDate = null;
		try {
			formattedDate = formatter.parse(todayDate);
		} catch (ParseException e) {
			//logger.error("Error in generateDate", e);
			throw new Exception("Failed to parse date.", e);
		}

		return formattedDate;
	}
}
