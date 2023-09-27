public class StringMethods {

    public static void main(String[] args) {
        String a = "GeeksForGeeks";
        String b = "Good";

        // length(): Returns the number of characters in the String.
        System.out.println(a.length());

        // charAt(int i): Returns the character at ith index.
        System.out.println(a.charAt(3));

        // substring (int i): Return the substring from the ith  index character to end.
        System.out.println(a.substring(2));

        // substring (int i, int j): Returns the substring from i to j-1 index.
        System.out.println(a.substring(2, 7));

        // concat( String str): Concatenates specified string to the end of this string.
        System.out.println(a.concat(" Me"));

        // indexOf (String s): Returns the index within the string of the first occurrence of the specified string.
        System.out.println(a.indexOf("For"));

        // indexOf (String s, int i): Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
        System.out.println(a.indexOf("ee", 2));

        // lastIndexOf( String s): Returns the index within the string of the last occurrence of the specified string.
        System.out.println(a.lastIndexOf("e"));

        // lastIndexOf( String s): Returns the index within the string of the last occurrence of the specified string.
        System.out.println(a.equals("Geeks"));

        // compareTo( String anotherString): Compares two string lexicographically.
        System.out.println(a.compareTo(b));   // This returns difference s1-s2. If :
                                             // out < 0  // s1 comes before s2
                                             // out = 0  // s1 and s2 are equal.
                                             // out > 0   // s1 comes after s2.

        // compareToIgnoreCase( String anotherString): Compares two string lexicographically, ignoring case considerations.
        System.out.println(a.compareToIgnoreCase("GeeksForgeeks"));     // This returns difference s1-s2. If :
                                                                            // out < 0  // s1 comes before s2
                                                                            // out = 0   // s1 and s2 are equal.
                                                                            // out > 0   // s1 comes after s2.

        // String toLowerCase(): Converts all the characters in the String to lower case.
        System.out.println(a.toLowerCase());

        // String toUpperCase(): Converts all the characters in the String to upper case.
        System.out.println(a.toUpperCase());

        //  String replace (char oldChar, char newChar): Returns new string by replacing all occurrences of oldChar with newChar.
        System.out.println(a.replace("e", "T"));

        // .toString : conver one string value into the other string value. 
        String s2 = b.toString(); // like that mans String b ni value string s2 ma transfer kari b.toString() ni madad thi.
        System.out.println(s2);

        // str.toCharArray() : use to convert a String to Array.
        char []C = a.toCharArray();
    }
    
}
