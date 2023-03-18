package tn.spring.bilelproject.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import tn.spring.bilelproject.Repository.ISkieurRepository;
import tn.spring.bilelproject.Service.Skieur.ISkieurServices;
import tn.spring.bilelproject.entities.Skieur;
import tn.spring.bilelproject.entities.TypeAbonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Skier Management")
@RestController
@RequestMapping("/skieur")
public class SkieurController {
    @Autowired
    ISkieurServices iSkieurServices;
    @Autowired
    private ISkieurRepository iSkieurRepository;

    @GetMapping
    public List<Skieur> findAllSkieur()
    {
        return iSkieurServices.retrieveAllSkieurs();
    }

    @GetMapping("/GetSkieurByid/{id}")
    public Skieur GetSkieurByid(@PathVariable("id") Long id)
    {
        return iSkieurServices.retrieveSkieur(id);
    }

    @PostMapping("/addSkieur")
    public Skieur addSkieur(@RequestBody Skieur skieur)
    {
        return iSkieurServices.addSkieur(skieur);
    }

    @PutMapping("/updateSkieur")
    public Skieur updateInscription(@RequestBody Skieur skieur)
    {
        return iSkieurServices.updateSkieur(skieur);
    }

    @DeleteMapping("/deleteSkieur/{id}")
    public void deleteInscription(@PathVariable("id") Long id)
    {
        iSkieurServices.removeSkieur(id);
    }

    @PostMapping("/addSkieurAndAssignToCourse/{numCours}")
    public Skieur addSkierAndAssignToCourse(@RequestBody Skieur skieur,@PathVariable("numCours")Long numCours)
    {
        return iSkieurServices.addSkieurAndAssignToCourse(skieur,numCours);
    }

    @GetMapping("retrieveSkiersBySubscriptionType/{type}")
    public List<Skieur> retrieveSkiersBySubscriptionType(@PathVariable("type") TypeAbonnement typeAbonnement){
        return iSkieurServices.retrieveSkiersBySubscriptionType(typeAbonnement);

    }
    @PostMapping("assignSkieurToPiste/{idSkieur}/{idPiste}")
    public Skieur assignSkieurToPiste (@PathVariable("idSkieur") Long idSkieur, @PathVariable("idPiste") Long idPiste)
    {
        return iSkieurServices.assignSkieurToPiste(idSkieur,idPiste);
    }
}
