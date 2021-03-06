package com.bytatech.ayoos.appointment.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.Optional;

import com.bytatech.ayoos.appointment.security.oauth2.AuthorizationHeaderUtil;

public class TokenRelayRequestInterceptor implements RequestInterceptor {

    public static final String AUTHORIZATION = "Authorization";

    private final AuthorizationHeaderUtil authorizationHeaderUtil;

    public TokenRelayRequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil) {
        super();
        this.authorizationHeaderUtil = authorizationHeaderUtil;
    }

    @Override
    public void apply(RequestTemplate template) {
        Optional<String> authorizationHeader = authorizationHeaderUtil.getAuthorizationHeaderFromOAuth2Context();
        if (authorizationHeader.isPresent()) {
            template.header(AUTHORIZATION, authorizationHeader.get());
        }
    }
}
