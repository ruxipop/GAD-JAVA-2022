package curs5.exception;

public class Main {
    public  static  void execptionMethod(int i) throws java.io.IOException{
        if(i==1)
               throw  new java.io.IOException();
    }
    public  static int test(){
        try{
            System.out.println(-1);

          execptionMethod(1);
        }catch (  java.io.IOException e){
            System.out.println(1);
            return 1;
        }finally { //tot timpul
            System.out.println(2);
          //  return 2;
        }

        System.out.println("after finaly");
        return 2;
    }
    public  static void main(String[] args){
        System.out.println("result"+test());
    }
}
