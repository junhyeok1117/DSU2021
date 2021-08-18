package com.dsu2021.pj.domain.card.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Card {

    private Long cardIndex;
    private Long userIndex;
    private String cardName;

}
