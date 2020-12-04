/**
 *@author Miriam Araujo
 *ID 2019430
 *GitHub --  https://github.com/miriamaraujo/
 */

package NorthPole;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		try {
			christmasList();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void christmasList() throws IOException {

		/*
		 * Reading the file
		 * 
		 * The String "path" stores the file which is later read and stored on the
		 * Scanner. With a while loop I read the file line by line and store each one
		 * into the ArraList "kids"
		 * 
		 */
		String path = "Christmas.txt";
		ArrayList<String> kids = new ArrayList<>();

		try (Scanner sc = new Scanner(new FileReader("Christmas.txt"))) {
			while (sc.hasNext()) {
				kids.add(sc.nextLine());
			}

		}
		/*
		 * Iterating through the file
		 * 
		 * With a for each loop I go through every line of the file and check which line
		 * belongs to boys and which one belongs to girls and assign each one of them to
		 * an array of toys, each array gets a random size defined in the integer "x",
		 * to prevent duplicates in the array I use a HashSet Collection. I randomically
		 * populate these arrays of toys from this arrays of strings in the class
		 * SantasFactory.
		 * 
		 */

		SantasFactory sf = new SantasFactory(); // Create new toy from the class SantasFactory
		FileWriter fw = new FileWriter("Deliveries.txt"); // I use FileWriter to writing into the file "Deliveries.txt"

		for (String kid : kids) {// iterating each line

			Random rd = new Random();
			int x = 1 + rd.nextInt(3);// generates a random number from 1 to 3

			Set<String> boystoys = new HashSet<>(); // Set collection
			while (boystoys.size() < x) { // Randomically assigning the size of the arrays

				boystoys.add(sf.getRandomBoyToy()); // Populating the array with random strings
			}

			if (kid.endsWith("M")) {// iterating lines that finish with M

				fw.write(kid + " (" + boystoys + ")\n\n"); // Writing each line to the file "Deliveries.txt"
			}

			/*
			 * For the girls I do the same as for the boys.
			 */
			Set<String> girlsToys = new HashSet<>();

			while (girlsToys.size() < x) {

				girlsToys.add(sf.getRandomGirlToy());
			}

			if (kid.endsWith("F")) {

				fw.write(kid + " (" + girlsToys + ")\n\n");
			}

		}

		fw.close();// Close the FileWriter 
	}
}

//											Thank you!