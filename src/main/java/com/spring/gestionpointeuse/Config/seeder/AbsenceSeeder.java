package com.spring.gestionpointeuse.Config.seeder;


import com.spring.gestionpointeuse.Entity.Absence;
import com.vaadin.exampledata.DataType;
import com.vaadin.exampledata.ExampleDataGenerator;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.StopWatch;
import org.springframework.beans.factory.annotation.Autowired;
import com.spring.gestionpointeuse.Repository.AbsenceRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;



@Component
@Slf4j
public class AbsenceSeeder {
   /* @Autowired
    private AbsenceRepository absenceRepository;
    public Absence absence1;

    public Absence absence2;


    public void seed() {
        if(absenceRepository.findAll().isEmpty()) {
            log.info("Generating demo data...");

            var generator = new ExampleDataGenerator<>(Absence.class, LocalDateTime.now());
            generator.setData(Absence::setDesignation, DataType.COMPANY_NAME);
            StopWatch stopWatch = new StopWatch(); stopWatch.start();
            List<Absence> absences = generator.create(50, new Random().nextInt());

            absenceRepository.saveAll(absences);

            stopWatch.stop();
            log.info("Demo data generated in " + stopWatch.getTime() + "ms.");
        }
    }

    */
}
