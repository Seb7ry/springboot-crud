package com.crud.cards.projectcards.service;

import com.crud.cards.projectcards.model.Card;
import com.crud.cards.projectcards.repository.ICardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService implements ICardService {

    @Autowired
    private ICardRepository iCardRepository;

    @Override
    public List<Card> findAll() {
        List<Card> list;
        try{
            list = iCardRepository.findAll();

        }catch(Exception e){
            throw e;
        }
        return list;
    }

    @Override
    public int save(Card card) {
        int row;
        try{
            row = iCardRepository.save(card);

        }catch(Exception e){
            throw e;
        }
        return row;
    }

    @Override
    public int update(Card card) {
        int row;
        try{
            row = iCardRepository.update(card);

        }catch(Exception e){
            throw e;
        }
        return row;
    }

    @Override
    public int delete(int id) {
        int row;
        try{
            row = iCardRepository.delete(id);

        }catch(Exception e){
            throw e;
        }
        return row;
    }
}
