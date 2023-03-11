package day29exceptionmaps;

public class IllegalAgeException extends RuntimeException{

    public IllegalAgeException(String message){
        super(message);
    }

    public IllegalAgeException(){
        super();
    }

}
