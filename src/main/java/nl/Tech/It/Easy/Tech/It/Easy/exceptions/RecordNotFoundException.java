package nl.Tech.It.Easy.Tech.It.Easy.exceptions;




public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException() {
        super();
    }

    public RecordNotFoundException(String message) {
        super(message);
    }
}
