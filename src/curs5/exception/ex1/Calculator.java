package curs5.exception.ex1;

public class Calculator {
    private int interOp(int i) throws curs5.exception.ex1.WrongInputException {
        if(i%2==0){
            throw new curs5.exception.ex1.WrongInputException(i);

        }
        if(i==5)
            throw  new FatalException();
        return i*3;
    }
    public  int calculateResult(int param){
        int result=0;
        try {
            result=interOp(param);
        }catch (WrongInputException ex){
            ex.printStackTrace();
        }
        return result;
    }
}
