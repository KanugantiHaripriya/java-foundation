package p15.Strings;

public class StringBuilderandStringBuffer {

    StringBuffer st1 = new StringBuffer();
    StringBuilder st2 = new StringBuilder();

    String s1 = "raju";
    String s2 = new String("raju");


    public static void main(String[] args) {

        StringBuilderandStringBuffer sb = new StringBuilderandStringBuffer();

        sb.s2 = sb.s2 + "raju";
        
        System.out.println(sb.s1);
        System.out.println(sb.s2);
    }

}
