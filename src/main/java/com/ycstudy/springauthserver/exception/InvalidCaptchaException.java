package com.ycstudy.springauthserver.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author yuanchuang
 * @date 2024-04-19
 */
public class InvalidCaptchaException extends AuthenticationException {
    public InvalidCaptchaException(String msg) {
        super(msg);
    }
}
