/*Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target. Letters also wrap around.
Input : ch='z' ; letters= ['a', 'b']
Output : a

Input : ch = 'a' ; letters = ['c', 'd', 'j']
Output : c
 * 
 */
import java.util.*;
class GC4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the target character");
        char ch = sc.nextLine().charAt(0); //target character
        List < Character > arr = new ArrayList < > ();
        System.out.println("Enter the letters");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++)
            arr.add((s.charAt(i)));
        arr.add((ch));
        Collections.sort(arr);
        int ind = arr.indexOf(ch);
        System.out.print("The closest letter : ");
        if (ind == (arr.size() - 1))
            System.out.println((arr.get(0)));
        else
            System.out.println((arr.get(ind + 1)));
    }

}
/* Sample input and output : 
 * Enter the target character
a
Enter the letters
cdf
The closest letter : c
Enter the target character
z
Enter the letters
abc
The closest letter : a
 Time Complexity : O(n)
 Space Complexity : O(1)
 */