package com.visitmed.usecases;

import com.visitmed.gateways.UserGateway;
import com.visitmed.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCRUD {

    private final UserGateway userGateway;

    @Autowired
    public UserCRUD(final UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User create(final User user) {
        //validate(user);
        //return userGateway.create(user);
        return null;
    }

//    public void validate(final User user) {
//        if (userGateway.existsByUserName(user.getUserName())) {
//            throw new ResourceAlreadyExistsException();
//        }
//    }

}
