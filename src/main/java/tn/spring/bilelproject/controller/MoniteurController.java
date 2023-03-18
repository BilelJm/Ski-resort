package tn.spring.bilelproject.controller;

import tn.spring.bilelproject.Service.Moniteur.IMoniteurServices;
import tn.spring.bilelproject.entities.Moniteur;
import tn.spring.bilelproject.entities.Support;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name ="Instructor Management")
@RestController
@RequestMapping("/moniteur")
public class MoniteurController {

    @Autowired
    IMoniteurServices iMoniteurServices;

    @GetMapping
    public List<Moniteur> findAllMoniteur()
    {
        return iMoniteurServices.retrieveAllMoniteurs();
    }

    @PostMapping("/addMoniteur")
    public Moniteur addInscription(@RequestBody Moniteur moniteur)
    {
        return iMoniteurServices.addMoniteur(moniteur);
    }

    @PutMapping("/updateMoniteur")
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur)
    {
        return iMoniteurServices.updateMoniteur(moniteur);
    }

    @GetMapping("/GetMoniteurByid/{id}")

    public Moniteur GetMoniteurByid(@PathVariable("id") Long id)
    {
        return iMoniteurServices.retrieveMoniteur(id);
    }

    @DeleteMapping("/deleteMoniteur/{id}")

    public void deleteMoniteur(@PathVariable("id") Long id)
    {
        iMoniteurServices.removeMoniteur(id);
    }
    @GetMapping("/GetWeeksNumber/{support}/{nomM}")

    public Integer GetWeeksNumber(@PathVariable("support")Long moniteurnum, @PathVariable("nomM") Support support)
    {
        return iMoniteurServices.GetWeeksNumber(moniteurnum,support);
    }

    @PostMapping("/addMonitorAndAssignToCourse/{numCours}")
    public Moniteur addMonitorAndAssignToCourse(@RequestBody Moniteur moniteur,@PathVariable("numCours")Long numCours)
    {
        return iMoniteurServices.addMonitorAndAssignToCours(moniteur,numCours);
    }

}
