package StringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sali ram");
        System.out.println(sb);

        // charAt index
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0,'B');
        System.out.println(sb);

        // insert
        sb.insert(2,'l');
        System.out.println(sb);

        // delete extra 'l'
        sb.delete(2,3); // insert range to from
        System.out.println(sb);

//        StringBuilder sb = new StringBuilder("H");
//        sb.append("e");
//        sb.append("l");
//        sb.append("l");
//        sb.append("o");
//        System.out.println(sb);
//        System.out.println(sb.length());


    }
}
