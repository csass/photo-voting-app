package com.photo.voting.controller;

import com.photo.voting.model.Winner;
import com.photo.voting.repository.WinnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WinnerController {
    @Autowired
    WinnerRepository repository;

    @RequestMapping(value="/winners", method= RequestMethod.GET)
    @ResponseBody
    public List<Winner> getWinners(){
        return repository.findAll();
    }

    @RequestMapping(value="/winners", method=RequestMethod.POST)
    public void addWinner(@RequestBody Winner winner) {
        repository.save(winner);
    }

}
