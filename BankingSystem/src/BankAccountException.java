public class BankAccountException extends Exception{

    private String exceptionMessage;


    public BankAccountException() {
        this.setExceptionMessage("Amount entered less than 0");
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    @Override
    public String toString() {
        return "BankAccountException{" +
                "exceptionMessage='" + exceptionMessage + '\'' +
                '}';
    }
}
