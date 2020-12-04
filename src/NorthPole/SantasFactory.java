/**
 *@author Miriam Araujo 
 *ID 2019430
 *GitHub --  https://github.com/miriamaraujo/
 */

package NorthPole;

import java.util.Random;

public class SantasFactory {
	Random rd = new Random();

	// Array of strings of toys for boys
	private String[] boysToys = { "Lump of coal", "Car", "Barbie", "Frying pan", "Masks", "Makeup", "Bike", "Kite",
			"skate", "Cooking kit", "Computer", "Cat", "G.I. Joe", "Max Steel", "Futball", "PS5", "Xbox", "Smartphone",
			"Skateboard", "Art Books", "Bass"};

	// Array of strings of toys for boys
	private String[] girlsToys = { "Lump of coal", "Cup of Tea", "Helmet", "Alcohol in gel", "Art Kit", "Air Jordans",
			"Rollerblades", "Dollhouse", "Telescope", "kitten", "Poly", "My little Poney", "Earings", "Dress", "Ipad",
			"Camera", "Surfing board", "Painting Set", "Guitar", "Ted Bear"};

	// Generating random toys with the methods "getRandomBoyToy()" and "getRandomBoyToy()"
	public String getRandomBoyToy() {

		String boyToyGenerator = boysToys[rd.nextInt(boysToys.length)]; 
		return boyToyGenerator;

	}

	public String getRandomGirlToy() {

		String girlToyGenerator = girlsToys[rd.nextInt(girlsToys.length)];
		return girlToyGenerator;

	}

}