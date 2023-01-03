package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Tutorial;
import com.example.demo.TutorialRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")//every request should follow after /api/
public class TutorialController {

  @Autowired
  TutorialRepository repo;

  @GetMapping("/tutorials")
  public List<Tutorial> getAllTutorials() {
	  return repo.findAll();
  }

  @GetMapping("/tutorials/{id}")
  public Optional<Tutorial> getTutorialById(@PathVariable("id") long id) {
    return repo.findById(id);
  }

  @PostMapping("/tutorials")
  public Tutorial createTutorial(@RequestBody Tutorial tutorial) {
    repo.save(tutorial);
    return tutorial;
  }

  @PutMapping(path="/tutorials/{id}", consumes= {"application/json"})
  public Tutorial updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
    repo.save(tutorial);
    return tutorial;
  }

  @DeleteMapping("/tutorials/{id}")
  public Tutorial deleteTutorial(@PathVariable("id") long id) {
    Tutorial t1=repo.getOne(id);
    repo.delete(t1);
    return t1;
  }

  @DeleteMapping("/tutorials")
  public Tutorial deleteAllTutorials() {
	  repo.deleteAll();
	  return (Tutorial) repo;
  }

  @GetMapping("/tutorials/published")
  public List<Tutorial> findByPublished() {
	  return repo.findByPublished(true);
}}