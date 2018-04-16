package CS201;

public class SecondLine {
    public static void main(String[] args) {

        System.out.println(isEmailAddress(text));

    }
    public static String text = "AsdfafadsBAsfew@f3q4we3";

    public static Boolean isEmailAddress(String x) {
        int index1 = x.indexOf("@");
        if (!x.contains("@") || x.contains(" ") || x.contains("\t") || x.contains("\n")|| index1<x.lastIndexOf('@', x.length()))
        {
            return false;
        }
        else
            return true;
    }



}