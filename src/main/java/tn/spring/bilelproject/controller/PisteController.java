package tn.spring.bilelproject.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import tn.spring.bilelproject.Service.Piste.IPisteServices;
import tn.spring.bilelproject.entities.Couleur;
import tn.spring.bilelproject.entities.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Track Management")
@RestController
@RequestMapping("/Piste")
public class PisteController {

    @Autowired
    IPisteServices iPisteServices;

    @GetMapping
    public List<Piste> findAllPiste()
    {
        return iPisteServices.retrieveAllPistes();
    }


    @PostMapping("/addPiste")
    public Piste addPiste(@RequestBody Piste piste)
    {
        return iPisteServices.addPiste(piste);
    }

    @PutMapping("/updatePiste")
    public Piste updatePiste(@RequestBody Piste piste)
    {
        return iPisteServices.updatePiste(piste);
    }

    @GetMapping("/GetPisteid/{id}")

    public Piste GetPisteByid(@PathVariable("id") Long id)
    {
        return iPisteServices.retrievePiste(id);
    }

    @DeleteMapping("/deletePiste/{id}")

    public void deletePiste(@PathVariable("id") Long id)
    {
        iPisteServices.removePiste(id);
    }

    @GetMapping("findByNomPisteAndCouleur/{nom}/{couleur}")
    public Piste findByNomPisteAndCouleur(@PathVariable("nom") String nom, @PathVariable("couleur")Couleur couleur)
    {
        return iPisteServices.findByNomPisteAndCouleur(nom,couleur);
    }

}
