package com.coinnect.coinnect.service;

import com.coinnect.coinnect.modal.Coin;

import java.util.List;

public interface CoinService {
    List<Coin>getCoinList(int page) throws Exception;
    String getMarketChart(String coinId,int days) throws Exception;
     String getCoinDetails(String coinId) throws Exception;
     Coin findById(String coinId) throws Exception;
     String searchCoin(String keyword) throws Exception;
     String getTop50CoinByMarketCapRank() throws Exception;
     String GetTreadingCoins() throws Exception;
}
