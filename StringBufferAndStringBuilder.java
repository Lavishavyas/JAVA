public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Reddy");
        System.out.println(sb);
        // sb.deleteCharAt(2);
        sb.insert(6, "Java ");
        sb.setLength(30);
        sb.ensureCapacity(100);
        System.out.println(sb);

        String str = sb.toString();

    }
}