package main;


public class Main {
    public static void main(String[] args) {

        String str = "Java";

        // String → StringBuilder
        StringBuilder sb = new StringBuilder(str);
        // String → StringBuffer
        StringBuffer sbf = new StringBuffer(str);

        // StringBuilder → String
        String s1 = sb.toString();
        // StringBuffer → String
        String s2 = sbf.toString();

        // StringBuilder → StringBuffer
        StringBuffer sbf2 = new StringBuffer(sb.toString());
        // StringBuffer → StringBuilder
        StringBuilder sb2 = new StringBuilder(sbf.toString());

        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuffer: " + sbf);
        System.out.println("StringBuilder → String: " + s1);
        System.out.println("StringBuffer → String: " + s2);
        System.out.println("StringBuilder → StringBuffer: " + sbf2);
        System.out.println("StringBuffer → StringBuilder: " + sb2);

    }
}
