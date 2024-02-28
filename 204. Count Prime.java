 
class Main{
    public static  void Function(int n){
        int start = 0;
        int end = n;
        boolean a = false;
        int count;
        for (int i = 2; i < end; i++) {
            for (int j = 2; j <i-1 ; j++) {
                if(j%i == 0 ){
                    a = false;
                 }else{
                 a = true;}
            }

        }
    }
    public static void main(String[] args) {
        Function(10);
    }
}
