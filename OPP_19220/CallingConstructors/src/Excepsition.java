class InvalidCredentialsException extends java.lang.Exception {


    private final String message;

    InvalidCredentialsException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "Everything is invalid!";

    }

    public String getMessageEmail() {
        return "This email is invalid!";

    }

    public String getMessageAge() {
        return "This age is invalid!";
    }

    public String getMessageRight() {
        return "Everything is right!";
    }

    public String getMessageName() {
        return "This name is invalid!";
    }


}
