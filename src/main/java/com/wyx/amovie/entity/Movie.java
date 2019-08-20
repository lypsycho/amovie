package com.wyx.amovie.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private Integer id;
    private String name;
    private String duration;
    private String directors;
    private String actors;
    private Date releaseDate;
    private String categoryIds;
    private Integer status;
    private String plot;
    private String poster;
    private String country;
}
