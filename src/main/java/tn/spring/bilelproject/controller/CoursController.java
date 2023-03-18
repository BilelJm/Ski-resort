package tn.spring.bilelproject.controller;

import tn.spring.bilelproject.Service.Cours.ICoursServices;
import tn.spring.bilelproject.entities.Cours;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name ="Course Management")
@RestController
@RequestMapping("/cours")
public class CoursController {
    @Autowired
    ICoursServices iCoursServices;
@GetMapping
    public List<Cours> findAllCours(){return iCoursServices.retrieveAllCourses() ;}

    @PostMapping("/addCours")
    public Cours AddCours(@RequestBody Cours cours)
    {
        return iCoursServices.addCours(cours);
    }

    @PutMapping("/updateCours")
    public Cours updateCours(@RequestBody Cours cours)
    {
        return iCoursServices.updateCours(cours);
    }
    @PostMapping("/GetCoursByid/{id}")
    public Cours GetCoursByid(@PathVariable("id") Long id)
    {
        return iCoursServices.retrieveCours(id);
    }

    @DeleteMapping("/deleteCours/{id}")
    public void deleteCours(@PathVariable("id") Long id)
    {
        iCoursServices.removeCours(id);
    }
}
