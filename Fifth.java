public class Fifth {

    public static void main(String args[]){

        String name = new String("Sourav");
        // String name = "Sourav";
        name+= " Maji";
        System.out.println("Hello "+ name);
        System.out.println(name.concat(" Maji"));
        System.out.println(name.hashCode());
        System.out.println(name.charAt(3));

        StringBuffer sb = new StringBuffer("Sourav");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Maji");
        System.out.println(sb);

        // to convert StringBuffer to String

        String str = sb.toString();
        System.out.println(str);
        sb.deleteCharAt(2); // this will delete the char at index 2;
        System.out.println(sb);
    }
    
}
