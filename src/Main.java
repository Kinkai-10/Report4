public class Main {
    public static void main(String[] args){
        String str =null;
        try{
            System.out.println(str.length());
        }catch(NullPointerException error){
            System.out.println("エラーの種類: NullPointerException");
            System.out.println(error.getMessage());
        }

    }
}
