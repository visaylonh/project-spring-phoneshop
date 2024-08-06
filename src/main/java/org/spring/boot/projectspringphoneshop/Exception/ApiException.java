package org.spring.boot.projectspringphoneshop.Exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;


@Data
@RequiredArgsConstructor
public class ApiException extends RuntimeException{

    private final HttpStatus status;
    private final String message;

}
