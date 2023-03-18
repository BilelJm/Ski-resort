package tn.spring.bilelproject.controller;

import tn.spring.bilelproject.Service.Inscription.IInscriptionServices;
import tn.spring.bilelproject.entities.Inscription;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name ="Registration Management")
@RestController
@RequestMapping("/inscription")
public class InscriptionController {
    @Autowired
    IInscriptionServices isInscription;

    @GetMapping
    public List<Inscription> findAllInscription()
    {
        return isInscription.retrieveAllInscriptions();
    }

    @PostMapping("/addInscription")
    public Inscription addInscription(@RequestBody Inscription inscription)
    {
        return isInscription.addInscription(inscription);
    }

    @PutMapping("/updateInscription")
    public Inscription updateInscription(@RequestBody Inscription inscription)
    {
        return isInscription.updateInscription(inscription);
    }

    @GetMapping("/GetInscriptionByid/{id}")

    public Inscription GetInscriptionByid(@PathVariable("id") Long id)
    {
        return isInscription.retrieveInscription(id);
    }

    @DeleteMapping("/deleteInscription/{id}")

    public void deleteInscription(@PathVariable("id") Long id)
    {
        isInscription.removeInscription(id);
    }


}
