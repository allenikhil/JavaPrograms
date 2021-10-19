import java.util.Random;

public class StrongPasswordGenerationBasedOnLength {
public static void main(String[] args) {
	System.out.println("8 Digit Password:::"+generatePassword(8));
	System.out.println("9 Digit Password:::"+generatePassword(9));
	System.out.println("10 Digit Password:::"+generatePassword(10));
	System.out.println("11 Digit Password:::"+generatePassword(11));
	System.out.println("12 Digit Password:::"+generatePassword(12));
	}
private static String generatePassword(int length) {
    String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    String specialCharacters = "!@#$";
    String numbers = "1234567890";
    String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
    Random random = new Random();
    char[] password = new char[length];

    password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
    password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
    password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
    password[3] = numbers.charAt(random.nextInt(numbers.length()));
 
    for(int i = 4; i< length ; i++) {
       password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
    }
    
    return String.valueOf(password);
}
}
