package com.visitmed.auth;

public class SecurityConstants {

    public static final String SECRET_KEY = "SecretKeyToGenJWTs";

    public static final long EXPIRATION_TIME = 864_000_000;

    public static final String HEADER_AUTHORIZATION = "Authorization";

    public static final String BEARER_TOKEN = "Bearer";

}
