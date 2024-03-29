package com.crud.cards.projectcards.service;

import com.crud.cards.projectcards.model.Card;

import java.util.List;

public interface ICardService {
    public List<Card> findAll();
    public int save(Card card);
    public int update(Card card);
    public int delete(int id);
}
