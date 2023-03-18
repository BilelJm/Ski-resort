package tn.spring.bilelproject.controller;

import tn.spring.bilelproject.Service.Abonnement.IAbonnementServices;
import tn.spring.bilelproject.entities.Abonnement;
import tn.spring.bilelproject.entities.TypeAbonnement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Tag(name ="Subscription Management")
@RestController
@RequestMapping("/abonnement")
public class AbonnementController {

    @Autowired
    IAbonnementServices iAbonnementServices;

    @GetMapping
    public List<Abonnement> findAllAbonnement(){
        return iAbonnementServices.retrieveAllAbonnements();
    }

    @PostMapping("/addAbonnement")

    public Abonnement AddAbonnement(@RequestBody Abonnement abonnement)
    {
        return iAbonnementServices.addAbonnement(abonnement);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAbonnement(@PathVariable ("id")Long id)
    {
         iAbonnementServices.removeAbonnement(id);
    }
    @GetMapping("/GetAbonnementByid/{id}")
    public Abonnement GetAbonnementByid(@PathVariable("id")Long id)
    {
        return iAbonnementServices.retrieveAbonnement(id);
    }

    @PutMapping("/updateAbonnement")
    public Abonnement UpdateAbonnement(@RequestBody Abonnement abonnement)
    {
        return iAbonnementServices.updateAbonnement(abonnement);
    }
    @GetMapping("/GetAbonnementByType/{type}")
    public List<Abonnement> RetreiveAbonnByType(@PathVariable("type")TypeAbonnement typeAbonnement)
    {
        return iAbonnementServices.GetAbonnementByType(typeAbonnement);
    }

    @GetMapping("/getAbonnementByDateDebut/{dateDeb}/{dateFin}")
    public List<Abonnement> RetreiveAbonnByType(@PathVariable("dateDeb") String datedeb, @PathVariable("dateFin")String dateFin) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dated = dateFormat.parse(datedeb);
        Date datef = dateFormat.parse(dateFin);

        return iAbonnementServices.GetListAbonnementBy2Date(dated,datef);
    }

}
