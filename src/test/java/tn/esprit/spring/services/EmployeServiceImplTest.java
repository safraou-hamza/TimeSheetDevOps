package tn.esprit.spring.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {
    @Autowired
    IEmployeService ems;
    @Test
    public void ajouterEmploye() {
        Employe e = new Employe("hamza","safraou","hamza.safraou@esprit.tn",true,Role.CHEF_DEPARTEMENT);
        assertTrue(e.getRole().equals(Role.CHEF_DEPARTEMENT));
        ems.ajouterEmploye(e);
    }
    @Test
    public void mettreAjourEmailByEmployeIdTest() {
        ems.mettreAjourEmailByEmployeId("hamza_safraou@esprit.tn",6);
	}
    
    //trigger jenkins please
    // go work please
}
