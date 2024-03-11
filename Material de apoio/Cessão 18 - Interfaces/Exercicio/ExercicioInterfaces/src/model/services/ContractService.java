package model.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract, Integer months){
        for(int i = 0; i < months; i++){
            double totalAfter = contract.getTotalValue()/months;

            double valueOfInstallment = totalAfter + onlinePaymentService.interest(totalAfter, i+1);

            valueOfInstallment += onlinePaymentService.paymentFree(valueOfInstallment);

            Installment installment = new Installment(contract.getDate().plusMonths(i +1), valueOfInstallment);

            contract.addInstallment(installment);
        }
    }
}
