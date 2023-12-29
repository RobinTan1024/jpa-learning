package com.learning.springboot.dto.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;

import java.util.Objects;

@Setter
@Getter
public class HttpStandardResponse<T> extends ResponseEntity<HttpStandardData<T>> {

    public HttpStandardResponse(@Nullable HttpStandardData<T> data, HttpStatusCode status) {
        super(data, status);
    }

    public HttpStandardResponse(T body, HttpStatusCode status) {
        this(new HttpStandardData<>(), status);
        Objects.requireNonNull(this.getBody()).setData(body);
    }
}
