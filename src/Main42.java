public class Main42 {
    public  static  String factorPrime(int n){
        String result=n+"="+" ";
        int factor=2;
        while (n>=factor){
            if(n%factor==0){
                result+=factor+"x";
                n=n/factor;// n/=factor;
            }else {
                factor++;
            }
        }
        return  result.substring(0,result.length()-1);
    }
    public static void main(String[] args) {
        System.out.println(factorPrime(125));
        System.out.println(factorPrime(45512));
        System.out.println(factorPrime(5487));
    }
}
