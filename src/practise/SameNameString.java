/**
 * 
 */
package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author sampathdhand
 *
 */
public class SameNameString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> namesList = new ArrayList<List<String>>();
		List<String> johnNames = new ArrayList<String>();
		List<String> johnNames1 = new ArrayList<String>();
		List<String> maryNames = new ArrayList<String>();
		List<String> johnNames2 = new ArrayList<String>();
		johnNames.add("John");
		johnNames.add("john@mail.com");
		johnNames.add("john2@mail.com");

		johnNames1.add("John");
		johnNames1.add("john@mail.com");
		johnNames1.add("john3@mail.com");

		maryNames.add("Mary");
		maryNames.add("mary@mail.com");
		maryNames.add("john3@mail.com");

		johnNames2.add("John");
		johnNames2.add("john4@mail.com");

		namesList.add(johnNames);
		namesList.add(johnNames1);
		namesList.add(maryNames);
		namesList.add(johnNames2);

		System.out.println(namesList);

		List<List<String>> outputnamesList = new ArrayList<List<String>>();

		Map<String, Object> tempMap = new HashMap<String, Object>();

//		namesList.forEach(names -> {
//			List<String> outName =null;
//			names.forEach(name -> {
//				System.out.println(name);
//				if (null != tempMap.get(name) && tempMap.get(name).toString().toLowerCase().contains(name.toLowerCase())) {
//					outName = new ArrayList<String>();
//					outName.add(name);
//				} else {
//					tempMap.put(name, name);
//				}
//				outputnamesList.add(outName);
//			});
//		});
//
//	}
		Set<String> seen = new HashSet<String>();
		for (List<String> names : namesList) {
			List<String> outName = new ArrayList<String>();
			for (String name : names) 
				// System.out.println(name);
//				if (null != tempMap.get(name)
//						&& tempMap.get(name).toString().toLowerCase().contains(name.toLowerCase())) {
//					//System.out.println("inside map");
//					//System.out.println(name);
//					if (!outName.contains(name)) {
//						outName.add(name);
//					}
//				} else {
//					tempMap.put(name, name);
//					outName.add(name);
//				}
				if (seen.add(name))
					outName.add(name);
				outputnamesList.add(outName);

			
			System.out.println(tempMap);
			//outputnamesList.add(outName);

		}

		System.out.println(outputnamesList);
	}
}
