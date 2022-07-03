package com.spring.gestionpointeuse.Config.seeder;


import com.spring.gestionpointeuse.Entity.ProfilCalendaire;
// import com.spring.gestionpointeuse.Repository.CompanyRepository;
import com.spring.gestionpointeuse.Repository.ProfilCalendaireRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Time;

@Component
@Slf4j
public class ProfilCalendaireSeeder {

    @Autowired
    private ProfilCalendaireRepository profilCalendaireRepository;

   /* @Autowired
    private CompanyRepository companyRepository;
*/
    public ProfilCalendaire profilCalendaire1;
    public ProfilCalendaire profilCalendaire2;



    public void seed() {
        if(profilCalendaireRepository.findAll().isEmpty()) {
            profilCalendaire1 = new ProfilCalendaire("Designation 1",
                    Time.valueOf("12:15:00"),
                    Time.valueOf("14:15:21"),
                    Time.valueOf("11:36:59"),
                    false
                   // ,companyRepository.findAll().get(0)
            );
            profilCalendaire2 = new ProfilCalendaire("Designation 2",
                    Time.valueOf("22:32:00"),
                    Time.valueOf("12:47:21"),
                    Time.valueOf("20:12:59"),
                    false
                   // ,companyRepository.findAll().get(2)
            );

            profilCalendaireRepository.save(profilCalendaire1);
            profilCalendaireRepository.save(profilCalendaire2);

        }
    }

}
