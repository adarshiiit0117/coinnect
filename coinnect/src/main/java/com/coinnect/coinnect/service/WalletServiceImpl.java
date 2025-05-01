package com.coinnect.coinnect.service;

import com.coinnect.coinnect.modal.Order;
import com.coinnect.coinnect.modal.User;
import com.coinnect.coinnect.modal.Wallet;
import com.coinnect.coinnect.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class WalletServiceImpl  implements WalletService{
      @Autowired
      private WalletRepository walletRepository;

    @Override
    public Wallet getUserWallet(User user) {
        Wallet wallet=walletRepository.findByUserId(user.getId());
        if(wallet==null){
            wallet=new Wallet();
            wallet.setUser(user);

        }
        return wallet;
    }

    @Override
    public Wallet addBalance(Wallet wallet, Long money) {
        BigDecimal balance=wallet.getBalance();
        BigDecimal newBalance=balance.add(BigDecimal.valueOf(money));
        wallet.setBalance(newBalance);

        return walletRepository.save(wallet);
    }

    @Override
    public Wallet findWalletById(Long id) throws Exception {
        Optional<Wallet>wallet=walletRepository.findById(id);
        if(wallet.isPresent()){
            return wallet.get();
        }
        throw new Exception("wallet not found");
    }

    @Override
    public Wallet walletToWalletTransfer(User sender, Wallet recieverWallet, Long amount) throws Exception {
        Wallet senderWallet=getUserWallet(sender);
        if(senderWallet.getBalance().compareTo(BigDecimal.valueOf(amount<0))){
            throw new Exception("Insufficient balance...");
        }
        BigDecimal senderBalance=senderWallet
                .getBalance()
                .subtract(BigDecimal.valueOf(amount));
        senderWallet.setBalance(senderBalance);
        walletRepository.save(senderWallet);
        BigDecimal receiverBalance=recieverWallet
                .getBalance().add(BigDecimal.valueOf(amount));
        recieverWallet.setBalance(receiverBalance);
        walletRepository.save(recieverWallet);
        return senderWallet;

    }

    @Override
    public Wallet payOrderPayment(Order order, User user) {
         Wallet wallet=getUserWallet(user);
         if(order.getOrder)
        return null;
    }
}
