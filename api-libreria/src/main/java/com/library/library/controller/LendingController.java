package com.library.library.controller;

import com.library.library.dto.LendingDTO;
import com.library.library.service.LendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("lendings")
public class LendingController {
    @Autowired
    private LendingService lendingService;
    @PostMapping("/{idUser}/books/{idBook}")
    public ResponseEntity<Void>bookReserve(@PathVariable Long idUser, @PathVariable Long idBook,
                                           @RequestBody LendingDTO lending)
    {
        lendingService.addReserve(idUser, idBook, lending);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @DeleteMapping("/{idLending}")
    public ResponseEntity<Void>deleteReserve(@PathVariable Long idLending)
    {
        lendingService.delete(idLending);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}