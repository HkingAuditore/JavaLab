package LabFour;

public class AverageException extends Exception {
    public final int errorCode;
    public AverageException(int errorCode,String errorLog){
        super("[ERROR]:" + errorLog);
        this.errorCode = errorCode;
    }


}
