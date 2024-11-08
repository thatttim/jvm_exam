import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Homework4 {
    private static final Logger logger = LogManager.getLogger(Homework4.class);

    public static void main(String[] args) {
        // 1. String length
        String hello = "Hello world!";
        logger.info("Length of the string 'Hello world!': " + hello.length());

        // 2. String concatenation
        String str1 = "Hello";
        String str2 = "world!";
        String concatenated = str1 + " " + str2;
        logger.info("Concatenated string: " + concatenated);

        // 3. String comparison
        logger.info("String comparison result: " + compareStrings(str1, str2));

        // 4. First word of a text
        logger.info("First word in text: " + getFirstWord("This is a test string"));

        // 5. Third word of a text
        logger.info("Third word in text: " + getThirdWord("This is a test string for third word extraction"));

        // 6. Split string into array
        String fruits = "apple,banana,orange";
        String[] fruitArray = splitStringToArray(fruits);
        logger.info("Array of strings: " + String.join(", ", fruitArray));

        // 7. Reverse a string
        logger.info("Reversed string: " + reverseString("Reverse me"));

        // 8. Convert string to uppercase
        logger.info("Uppercase: " + toUpperCase("convert me to upper"));

        // 9. Convert string to lowercase
        logger.info("Lowercase: " + toLowerCase("CONVERT ME TO LOWER"));

        // 10. Count words in a string
        logger.info("Word count: " + countWords("Count the number of words here"));

        // 11. Trim whitespace
        logger.info("Trimmed text: '" + trimSpaces("      this is a text          ") + "'");

        // 12. Replace character
        logger.info("Replacing 'a' with '-': " + replaceCharacter("apple banana orange", 'a', '-'));

        // 13-20. Working with map
        Map<String, Integer> people = new HashMap<>();
        people.put("გიორგი", 16);
        people.put("ვაჟა", 20);
        people.put("მერაბი", 30);
        people.put("ნუცა", -21);
        people.put("ნიკა", 25);

        logger.info("Vaja's age: " + people.get("ვაჟა"));
        logger.info("Map size: " + people.size());

        incrementAges(people);
        logger.info("Map after incrementing ages: " + people);

        printNegativeAges(people);

        removeNegativeAges(people);
        logger.info("Map after removing negative ages: " + people);
    }

    // 3. Compare two strings
    public static String compareStrings(String s1, String s2) {
        return s1.equals(s2) ? "equals" : "not equals";
    }

    // 4. Get the first word from a string
    public static String getFirstWord(String text) {
        return text.split(" ")[0];
    }

    // 5. Get the third word from a string
    public static String getThirdWord(String text) {
        String[] words = text.split(" ");
        return words.length >= 3 ? words[2] : "";
    }

    // 6. Split a comma-separated string into an array
    public static String[] splitStringToArray(String text) {
        return text.split(",");
    }

    // 7. Reverse a string
    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // 8. Convert a string to uppercase
    public static String toUpperCase(String text) {
        return text.toUpperCase();
    }

    // 9. Convert a string to lowercase
    public static String toLowerCase(String text) {
        return text.toLowerCase();
    }

    // 10. Count the number of words in a string
    public static int countWords(String text) {
        return text.trim().split("\\s+").length;
    }

    // 11. Trim leading and trailing whitespace from a string
    public static String trimSpaces(String text) {
        return text.trim();
    }

    // 12. Replace a character in a string
    public static String replaceCharacter(String text, char oldChar, char newChar) {
        return text.replace(oldChar, newChar);
    }

    // 17. Increment each person's age in the map by 1
    public static void incrementAges(Map<String, Integer> people) {
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            people.put(entry.getKey(), entry.getValue() + 1);
        }
    }

    // 19. Print names of people with a negative age
    public static void printNegativeAges(Map<String, Integer> people) {
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            if (entry.getValue() < 0) {
                logger.info("Negative age found for: " + entry.getKey());
            }
        }
    }

    // 20. Remove people with a negative age from the map
    public static void removeNegativeAges(Map<String, Integer> people) {
        people.entrySet().removeIf(entry -> entry.getValue() < 0);
    }
}
