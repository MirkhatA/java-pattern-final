package com.company.order.adapter;

import com.company.order.card.Card;

public class CardImplementation implements Card {
    private String cardNo;
    private String cardOwnerName;
    private String cardExpDate;
    private String cardCvv;
    private Double price;

    @Override
    public String getCardNo() {
        return cardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpDate() {
        return cardExpDate;
    }

    @Override
    public String getCardCvv() {
        return cardCvv;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    @Override
    public void setCardCvv(String cardCvv) {
        this.cardCvv = cardCvv;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }
}
