public class print_Index {
    public static void printIndexed(String l){
        int len=l.length();
        for(int i=0;i<len;i++){
            System.out.print(l.charAt(i));
            System.out.print(len-1-i);
        }
    }
    public static void main(String[] args){
        String s="ZELDA";
        print_Index.printIndexed(s);
    }

}
