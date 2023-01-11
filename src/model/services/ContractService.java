package model.services;

import java.time.LocalDate;
import model.entities.Contract;
import model.entities.Installment;


public class ContractService{
    
    private OnlinePaymentService onlinePaymentService;
    
    private Contract contract;

    public ContractService(){
    }
    

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
    
    public void processContract(Contract contract, int months){
        /*
        double valueInstallment = contract.getTotalValue() / months;
        System.out.println(valueInstallment); */
        
        contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
        contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));
    }

    
}
