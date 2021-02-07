package com.app.thread;

import com.app.thread.generated.Expense;
import com.app.thread.generated.ExpenseService;
import com.app.thread.generated.ExpenseService_Service;
import com.app.thread.generated.SaveExpenseRequest;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class ExpenseClient {
    private static ExpenseService expenseService;

    static {
        expenseService = new ExpenseService_Service().getExpensePort();
    }

    public void saveExpense(SaveExpenseRequest request, SimpleDateFormat formatter) {
        System.out.println("S Start:      " + Thread.currentThread().getName()+"---"+ formatter.format(System.currentTimeMillis()));
        try{
            expenseService.saveExpense(request);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("S End:        " + Thread.currentThread().getName()+"---"+ formatter.format(System.currentTimeMillis()));
    }
}
