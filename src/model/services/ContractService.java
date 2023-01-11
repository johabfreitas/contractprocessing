package model.services;

import java.time.LocalDate;
import model.entities.Contract;
import model.entities.Installment;


public class ContractService{
    
    private OnlinePaymentService onlinePaymentService;
    
    private Contract contract;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
    
    public void processContract(Contract contract, int months){
        
        double valueInstallment = contract.getTotalValue() / months;
        
        for(int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            
            double interest = onlinePaymentService.interest(valueInstallment, i);
            double fee = onlinePaymentService.paymentFee(valueInstallment + interest);            
            double quota = valueInstallment + interest + fee;
            
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }

    
}
