package CS201;

public class Char {

    public static void main(String[] args) {
        System.out.println(Character.getNumericValue('G'));
        Char myChar = new Char();

        myChar.nonStatic();
    }


    public void nonStatic(){
        System.out.println("\nnonstatic");
    }
}
