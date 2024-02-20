package practise;

public class StringTest {
    public static void main(String[] args) {
        String str = "ABC";
        StringBuilder sb= new StringBuilder("ABC");
        System.out.println(str.contentEquals(sb));
        System.out.println(returnString());

        double d1=5f;
        double d2=5.0;
        float f=5f;
      //  float f2=5.0;
    }


    private  static String returnString(){
        try{
             return "hello";
        }catch (Exception e){

        }finally {
            System.out.println("finally called ");
        }
        return null;
    }
}


