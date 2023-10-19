package com.example.controller.base;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import tw.com.webcomm.advice.ResponseResultBodyAdvice;

@RestControllerAdvice
public class UnifiedResponseFormatAdvise extends ResponseResultBodyAdvice {
}
