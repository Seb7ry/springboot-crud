package com.crud.cards.projectcards.model;

import lombok.Data;

@Data
public class Card {
    private int id_card;
    private String name;
    private String number;
    private String type;
    private int cvv;
    private int status;
}
