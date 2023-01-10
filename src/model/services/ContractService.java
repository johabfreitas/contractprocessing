package model.services;

import model.entities.Contract;


public class ContractService{
    
    private OnlinePaymentService onlinePaymentService;
    
    private Contract contract;

    public ContractService(){
    }
    

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    
    
    public void processContract(Contract contract, Integer months){
        double valueInstallment = contract.getTotalValue() / months;
        System.out.println(valueInstallment);
    }

    
}
