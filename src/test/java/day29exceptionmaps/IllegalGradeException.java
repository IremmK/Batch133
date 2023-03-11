package day29exceptionmaps;

public class IllegalGradeException extends Exception{

    public IllegalGradeException(String message){
        super(message);
    }

    public IllegalGradeException(){
        super();
    }

}
