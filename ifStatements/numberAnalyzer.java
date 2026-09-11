package ifStatements;
public class numberAnalyzer {
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        for(int i=1; i <= 10; i++){
            if(isEven(i)){
                System.out.println(i + " is even.");
            }else{
                System.out.println(i + " is odd.");
            }
        }
    }
}
