package ivanio1.kafkaproducer.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import ivanio1.kafkaproducer.dto.CatDto;
import ivanio1.kafkaproducer.entity.Cat;
import ivanio1.kafkaproducer.repo.CatRepo;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "main_methods")

@RestController
@Slf4j
@RequiredArgsConstructor
public class Controller {

    private final CatRepo catRepo;

    @Operation(
            summary = "Add new cat to db")
    @PostMapping("/api/add")
    public void addCat(@RequestBody CatDto catDto) {

        log.info("New entity + ", catRepo.save(
                Cat.builder()
                        .age(catDto.getAge())
                        .weight(catDto.getWeight())
                        .name(catDto.getName())
                        .build()));

    }

    @GetMapping("/api/all")
    @SneakyThrows
    public List<Cat> getAll() {
        return catRepo.findAll();
    }

    @GetMapping("api")
    public Cat getCat(@RequestParam int id) {
        return catRepo.findById(id).orElseThrow();
    }

    @DeleteMapping("/api")
    public void deleteCat(@RequestParam int id) {
        catRepo.deleteById(id);
    }


}
