package week9;

public class ExceptionTest {

    public static void main(String[] args) {

        System.out.println("1. start");
        ExceptionTest exceptionTest = new ExceptionTest();

        try{
            exceptionTest.something();
        }catch (Exception e){
            System.out.println("5. exception");
            e.printStackTrace();
        }

    }

    private void something(){
        System.out.println("2. start");
        try{
            occursExcept();
        }finally{
            System.out.println("4.finally");
        }
    }

    private void occursExcept(){
        System.out.println("3. start");
        String code = null;
        code.length();
    }


}
