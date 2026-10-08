package enumD;

public enum MyErrors {

    ERROR1("Error1","is not a valid username"),
    ERROR2("Error2","Enter valid password");


    private String errorID;
    private String errorMessage;

    public String getErrorID() {
        return errorID;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    private MyErrors(String errorID, String errorMessage) {
        this.errorID = errorID;
        this.errorMessage = errorMessage;
    }
}
