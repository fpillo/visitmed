package com.visitmed.usecases;

import com.visitmed.models.Home;
import com.visitmed.models.Subsidiary;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GetHome {

    private final SubsidiaryCRUD subsidiaryCRUD;

    public GetHome(final SubsidiaryCRUD subsidiaryCRUD) {
        this.subsidiaryCRUD = subsidiaryCRUD;
    }

    public Home getHome(final UUID userId) {
        final Subsidiary subsidiary = subsidiaryCRUD.findByManagerId(userId);
        final Home home = new Home(subsidiary.getCompany(), subsidiary);

        return home;
    }



}
