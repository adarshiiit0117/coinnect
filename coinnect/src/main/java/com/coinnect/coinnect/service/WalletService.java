package com.coinnect.coinnect.service;

import com.coinnect.coinnect.modal.Order;
import com.coinnect.coinnect.modal.User;
import com.coinnect.coinnect.modal.Wallet;

public interface WalletService {
Wallet getUserWallet(User user);
Wallet addBalance(Wallet wallet,Long money);
Wallet findWalletById(Long id) throws Exception;
Wallet walletToWalletTransfer(User sender,Wallet recieverWallet,Long amount) throws Exception;
Wallet payOrderPayment(Order order, User user);

}
