package docker.demo.controller;

import docker.demo.model.Info;
import docker.demo.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InfoController {

    @Autowired
    private InfoRepository repository;


    @PostMapping
    public String saveInfo(@RequestBody Info info) {
        Info savedId = repository.save(info);
        return "Збережено id: " + savedId;
    }

    @GetMapping
    public List<Info> getInfo() {
        return repository.findAll();
    }
}
