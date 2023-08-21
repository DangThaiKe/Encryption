package GK_ThaiKe;

public class HoanVi {
	//start encryption method
		public StringBuilder encryption(String InputPlainText, String InputKey) {

			String plainText = InputPlainText.toUpperCase();
			StringBuilder msg = new StringBuilder(plainText);

			String keyword = InputKey.toUpperCase();

			// specify numbers to keywords from method keywordNumberSpecify()
			int[] keywordNumberList = keywordNumberSpecify(keyword);

			// in case characters don't fit the entire grid perfectly.
			int Letters = msg.length() % keyword.length(); // Step 2 write the text in the grid
			int Characters = keyword.length() - Letters;
			if (Letters != 0) {
				for (int i = 0; i < Characters; i++) {
					msg.append(".");
				}
			} // end Step 2

			int numberOfRows = msg.length() / keyword.length();

			// Converting message into a grid
			char[][] array = new char[numberOfRows][keyword.length()];

			int counter = 0;
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < keyword.length(); j++) {
					array[i][j] = msg.charAt(counter);
					counter++;
				}

			}

			// cipher text generation
			StringBuilder cipherText = new StringBuilder();

			// getting locations of numbers
			String NumberLocation = getNumberLocation(keyword, keywordNumberList);

			// Step 4  //for (int i = 0, k = 0; i < numberOfRows; i++, k++)
				for (int i = 0, key = 0; i < numberOfRows; i++, key++) {
				int Value;
				if (key == keyword.length()) {
					break;
				} else {
					Value = Character.getNumericValue(NumberLocation.charAt(key));
				}
				for (int j = 0; j < numberOfRows; j++) {
					cipherText.append(array[j][Value]);
				}
			}
			
			return cipherText;

		} //end encryption method
		
	   //start decryption method
		public StringBuilder decryption(String InputCipherText, String InputKey) {

			String CipherText = InputCipherText.toUpperCase();
			String keyword = InputKey.toUpperCase();

			int numberOfRows = CipherText.length() / keyword.length(); // Step 5 than Step 3

			// array with values
			char[][] array = new char[numberOfRows][keyword.length()];

			// specify numbers to keywords from method keywordNumberSpecify()
			int[] keywordNumberList = keywordNumberSpecify(keyword);

			String numLoc = getNumberLocation(keyword, keywordNumberList);

			for (int i = 0, key = 0; i < CipherText.length(); i++, key++) { // step 6
				int Value = 0;
				if (key == keyword.length()) {
					key = 0;
				} else {
					Value = Character.getNumericValue(numLoc.charAt(key));
				}

				for (int j = 0; j < numberOfRows; j++, i++) {
					array[j][Value] = CipherText.charAt(i);
				}
				--i;
			}

			StringBuilder ClearText = new StringBuilder(); // Step 7
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < keyword.length(); j++) {
					ClearText.append(array[i][j]);
				}
			}

			return ClearText;

		} //end decryption function

		
		private String getNumberLocation(String keyword, int[] keywordNumberList) { // Step 3 getting location of numbers on keyword
			String NumberLocation = "";
			for (int i = 1; i < keyword.length() + 1; i++) {
				for (int j = 0; j < keyword.length(); j++) {
					if (keywordNumberList[j] == i) {
						NumberLocation += j;
					}
				}
			}
			return NumberLocation;
		} //end getting number location method
		

		private int[] keywordNumberSpecify(String keyword) { // Step 1 Keyword conv to number
			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
			int[] keywordNumberList = new int[keyword.length()];

			int init = 0;
			for (int i = 0; i < alphabet.length(); i++) {
				for (int j = 0; j < keyword.length(); j++) {
					if (alphabet.charAt(i) == keyword.charAt(j)) {
						init++;
						keywordNumberList[j] = init;
					}
				}
			} 
			
			return keywordNumberList;
		} 


}
