import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws AnyCheckedException {
        throw new AnyCheckedException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws AnyCheckedException {
        throw new AnyCheckedException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        throw new AnyUncheckedException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new AnyUncheckedException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
    try {
        int value = Integer.parseInt(integer);
        return Optional.of(value);
    } catch (NumberFormatException e) {
        return Optional.empty();
    }
}
}


class AnyCheckedException extends Exception {
    public AnyCheckedException() {
        super();
    }

    public AnyCheckedException(String message) {
        super(message);
    }
}


class AnyUncheckedException extends RuntimeException {
    public AnyUncheckedException() {
        super();
    }

    public AnyUncheckedException(String message) {
        super(message);
    }
}

class CustomCheckedException extends RuntimeException {
    public CustomCheckedException() {
        super();
    }

    public CustomCheckedException(String message) {
        super(message);
    }
}

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException() {
        super();
    }

    public CustomUncheckedException(String message) {
        super(message);
    }
}

