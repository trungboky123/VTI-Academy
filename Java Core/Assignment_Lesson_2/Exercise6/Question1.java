package Exercise6;

public class Question1 {
    public static void evenNumbersSmallerThan10(){
        System.out.println("All the even number smaller than 10 are: ");
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        evenNumbersSmallerThan10();
    }
}
