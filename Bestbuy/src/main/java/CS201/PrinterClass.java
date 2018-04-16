package CS201;

public class Chapter_9_10_review {

        static int modify (int i) {
            i += 10;
            return i + 10;
        }
        public static void main(String[] args) {
            int i = 10;
            System.out.println(modify(i));
        }
}
