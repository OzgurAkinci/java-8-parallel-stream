package com.app.thread;

import com.app.thread.generated.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableAsync
public class ThreadApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ThreadApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("**********************************************START**********************************************");
	}

	@Autowired
	ExpenseClient expenseClient;

	@Bean
	CommandLineRunner lookup() {
		return args -> {
			SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy 'at' HH:mm:ss.SSS");
			SaveExpenseRequest saveExpenseRequest = new SaveExpenseRequest();

			/** Fill Data **/
			List<Expense> expenses = new ArrayList<>();
			for(int i=0; i<50000; i++) {
				Expense expense = new Expense();
				expense.setExpenseType("ExpenseType-"+i);
				expense.setQuantity(new BigDecimal(i));
				expenses.add(expense);
			}

			/** Single Thread : Average 13.3 min. **/
			/*String start = formatter.format(System.currentTimeMillis());
			for(int i=0; i<expenses.size(); i++) {
				Expense expense = new Expense();
				expense.setExpenseType("ExpenseType");
				expense.setQuantity(new BigDecimal(0));
				saveExpenseRequest.setExpense(expense);
				expenseClient.saveExpense(saveExpenseRequest, formatter);
			}
			System.out.println("S:  " + start);
			System.out.println("E:  " + formatter.format(System.currentTimeMillis()));*/

			/** Parallel Stream : Average 1.29 min. **/
			String startParallelStream = formatter.format(System.currentTimeMillis());
			expenses.parallelStream().forEach(e -> {
				Expense expense = new Expense();
				expense.setExpenseType("ExpenseType");
				expense.setQuantity(new BigDecimal(0));
				saveExpenseRequest.setExpense(expense);
				expenseClient.saveExpense(saveExpenseRequest, formatter);
			});
			System.out.println("PS-S:  " + startParallelStream);
			System.out.println("PS-E:  " + formatter.format(System.currentTimeMillis()));





		};
	}

}
