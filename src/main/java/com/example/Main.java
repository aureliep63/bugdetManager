package com.example;

import java.time.LocalDate;

public class Main {

    public static void main( String[] args )
    {
    	System.out.println("Bienvenue dans le Gestionnaire de Budget !");
    	
    	 BudgetManager budgetManager = new BudgetManager();

         // Ajouter plusieurs dépenses
         Expense depense1 = new Expense("Courses", 50.0, LocalDate.of(2024, 10, 1));
         Expense depense2 = new Expense("Transport", 15.0, LocalDate.of(2024, 10, 2));

         budgetManager.addExpense(depense1);
         budgetManager.addExpense(depense2);

         // Afficher le résumé des dépenses
         budgetManager.printSummary();
     }
}