class Palindrome{
    private String text;
    public Palindrome(String text){
        this.text=text;
    }

    public boolean palindromeCheck(){
        String cleanedText=text.replaceAll("[^a-zA-z0-9]", "");
        int left=0,right=cleanedText.length()-1;
        while (left<right) {
            if(cleanedText.charAt(left)!=cleanedText.charAt(right)){
                return false;
            }
            left++;
            right--;
           
        }
        return true;
    }

    public void displayResult(){
        if (palindromeCheck()) {
            System.out.println(text +" is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
   
}
public class PalindromeMain {
    public static void main(String[] args) {
        Palindrome checker1 = new Palindrome("madam");
        checker1.displayResult();
       
        Palindrome checker2 = new Palindrome("Hello");
        checker2.displayResult();
       
        Palindrome checker3 = new Palindrome("A man, a plan, a canal, Panama");
        checker3.displayResult();
    }
}
