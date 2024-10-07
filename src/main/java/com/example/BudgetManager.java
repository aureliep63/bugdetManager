package com.example;


import java.util.ArrayList;
import java.util.List;

public class BudgetManager {
    private List<Expense> expenses;

    public BudgetManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public void printSummary() {
        System.out.println("Résumé des dépenses:");
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
        System.out.println("Total des dépenses: " + getTotalExpenses());
    }
}
