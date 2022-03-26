package DVInterface.exercicio.service;

import java.util.Calendar;
import java.util.Date;

import DVInterface.exercicio.entites.Contract;
import DVInterface.exercicio.entites.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}


	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;
		for(int x = 1; x <= months; x++){
			
		    double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, x);
		    
		    double fullQuota = updateQuota + onlinePaymentService.paymentFee(updateQuota);
		    
		    Date dueDate = addMonths(contract.getData(), x);
		    
		    contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
}
