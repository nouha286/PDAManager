package testDao;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.List;

import org.junit.jupiter.api.Test;

import entity.Etat;
import entity.Responsable;
import entity.Role;
import service.ResponsableService;
import service.ResponsableServiceImpl;

class addTest {

	ResponsableService  respo = new ResponsableServiceImpl();
	@Test
	
//	public void testaddResponsable() {
//		
//		Responsable rs = new Responsable();
//		rs.setNom("hamza");
//		rs.setPrenom("Laqraa");
//		rs.setTele("0887677");
//		rs.setDomaine("DEv");
//		rs.setType("formateur");
//		rs.setEtat(Etat.Active);
//		rs.setRole(Role.Responsable);
//		respo.add(rs);
//		
//		List<Responsable> responsable = respo.findAll();
//		rs.equals(responsable.get(0));
//	   assertEquals(rs.getNom() ,responsable.get(0).getNom());
//	}
	
	public void testUpateResponsable() {
		  	
		Responsable rs = new Responsable();
		rs.setId(43);
		rs.setNom("hamza");
		rs.setPrenom("Laqraa");
		rs.setTele("0887677");
		rs.setDomaine("IT");
		rs.setType("Formateur");
		rs.setEtat(Etat.Active);
		rs.setRole(Role.Responsable);
		respo.edite(rs);
		
		List<Responsable> responsable = respo.findAll();
		
		 assertEquals(rs.getNom() ,responsable.get(0).getNom());
	}

}
