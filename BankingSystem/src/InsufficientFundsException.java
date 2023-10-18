public class InsufficientFundsException extends Exception{

    private String exceptionMessage;

    public InsufficientFundsException() {
        this.exceptionMessage = "Amount entered either 0 or less, or greater than balance.";
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String toString() {
        return "InsufficientFundsException{" +
                "exceptionMessage='" + exceptionMessage + '\'' +
                '}';
    }
}
