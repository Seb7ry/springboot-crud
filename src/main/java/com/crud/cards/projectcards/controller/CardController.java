package com.crud.cards.projectcards.controller;

import com.crud.cards.projectcards.model.Card;
import com.crud.cards.projectcards.model.ServiceResponsive;
import com.crud.cards.projectcards.service.ICardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/card")
@CrossOrigin("*")
public class CardController {

    @Autowired
    private ICardService iCardService;

    @GetMapping("/list")
    public ResponseEntity<List<Card>> list(){
        var result = iCardService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ServiceResponsive> save(@RequestBody Card card){
        ServiceResponsive serviceResponsive = new ServiceResponsive();
        int result = iCardService.save(card);
        if(result == 1){
            serviceResponsive.setMessage("Item saved with success!");
        }
        return new ResponseEntity<>(serviceResponsive, HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<ServiceResponsive> update(@RequestBody Card card){
        ServiceResponsive serviceResponsive = new ServiceResponsive();
        int result = iCardService.update(card);
        if(result == 1){
            serviceResponsive.setMessage("Item updated with success!");
        }
        return new ResponseEntity<>(serviceResponsive, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<ServiceResponsive> update(@PathVariable int id){
        ServiceResponsive serviceResponsive = new ServiceResponsive();
        int result = iCardService.delete(id);
        if(result == 1){
            serviceResponsive.setMessage("Item removed with success!");
        }
        return new ResponseEntity<>(serviceResponsive, HttpStatus.OK);
    }
}
