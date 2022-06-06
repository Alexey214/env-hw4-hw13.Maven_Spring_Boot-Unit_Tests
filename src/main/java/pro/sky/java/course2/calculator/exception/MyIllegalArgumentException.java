package pro.sky.java.course2.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MyIllegalArgumentException extends IllegalArgumentException {
    public MyIllegalArgumentException() {
        System.out.println();
        System.out.println("На \"0\" делить нельзя!");
    }
}
