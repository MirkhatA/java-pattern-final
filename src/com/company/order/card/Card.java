package com.company.order.card;

public interface Card {
    public String getCardNo();
    public String getCardOwnerName();
    public String getCardExpDate();
    public String getCardCvv();
    public Double getPrice();

    public void setCardNo(String cardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpDate(String cardExpDate);
    public void setCardCvv(String cardCvv);
    public void setPrice(Double price);
}
