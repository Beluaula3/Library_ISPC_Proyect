package com.library.library.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class BookDTO {
    private Long id;
    private String title;
    private LocalDate date;
    private String author;
    private String category;
    private String edit;
    private String lang;
    private String pages;
    private String description;
    private String copy;
    private Integer stock;
    private Integer available;
    private Boolean deleted;
}
