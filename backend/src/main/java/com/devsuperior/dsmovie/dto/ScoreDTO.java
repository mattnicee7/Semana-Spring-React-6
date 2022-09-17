package com.devsuperior.dsmovie.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ScoreDTO {

    private Long movieId;
    private String email;
    private Double score;

}
