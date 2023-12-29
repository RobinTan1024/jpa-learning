package com.learning.springboot.dto.common;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HttpStandardData<T> {

    private T data;
}
