public class Dessert {
    int flavor;
    int price;
    public Dessert(int a,int b){
        flavor=a;
        price=b;
        numDesserts+=1;
    }
    public static int numDesserts;
    public void printDessert(){
        System.out.println(flavor+" "+price+" "+numDesserts);
    }
    public static void main(String[] args){
        System.out.println("I love dessert!");
    }
}
