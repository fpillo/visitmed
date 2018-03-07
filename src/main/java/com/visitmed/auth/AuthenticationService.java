package com.visitmed.auth;

import com.visitmed.gateways.UserGateway;
import com.visitmed.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements UserDetailsService {

    private final UserGateway userGateway;

    @Autowired
    public AuthenticationService(final UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public UserDetails loadUserByUsername(final String userName) throws UsernameNotFoundException {
        final User user = userGateway.findByUserName(userName).orElseThrow(() -> new UsernameNotFoundException(userName));

        return new AuthUser(user.getId(), user.getUserName(), user.getPassword());
    }
}
