package JavaInterview;

import java.util.*;

public class testc {

	public String wineSeller(ArrayList<String[]> r) {

		String str = "";
		int tprice = 0;

		for (int i = 0; i < r.size(); i++) {
			if (Integer.parseInt(r.get(i)[3]) > Integer.parseInt(r.get(i)[2])) {
				str += "*" + r.get(i)[0] + " " + Integer.parseInt(r.get(i)[1]) + " price: "
						+ Integer.parseInt(r.get(i)[1]) * Integer.parseInt(r.get(i)[2]) + "\n";
				tprice += Integer.parseInt(r.get(i)[1]) * Integer.parseInt(r.get(i)[2]);

			} else {
				str += "*" + r.get(i)[0] + " " + Integer.parseInt(r.get(i)[2]) + " quantity too big" + "\n";
			}
		}

		return str + "\n" + "totol price: " + tprice;

	}// end wineSeller

	/*
	 * order = { ["Rautour Viejo","20","100","200"]
	 * ["Culung Garrafeira","30","10","9900"] ["Lirnolon Sec","200","2","1"] }
	 * 
	 * then wineSeller() returns:
	 * 
	 * Rautour Viejo 100 price:2000 Culung Garrafeira 10 price:30 Lirnolon Sec 2
	 * quantity too big
	 * 
	 * total price:2030
	 */

}
