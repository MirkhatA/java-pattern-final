package com.company.order.adapter;

import com.company.order.card.Card;
import com.company.order.cash.Cash;

public class CardToCashAdapter implements Cash {
    private Double totalPrice;

    private final Card card;

    public CardToCashAdapter(Card card) {
        this.card = card;
        setPop();
    }

    @Override
    public Double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private void setPop() {
        setTotalPrice(this.card.getPrice());
    }
}
