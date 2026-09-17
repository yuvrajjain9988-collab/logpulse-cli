package com.logpulse;
import com.logpulse.ui.TerminalFormatter;
import java.util.Scanner;

public class LogPulseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            TerminalFormatter.printHeader("LOGPULSE CLI");
            System.out.println("1. Analyze Log File");
            System.out.println("2. View System Telemetry Summary");
            System.out.println("3. Incident Management (Create/List)");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.println("Module loaded: Log Parser ready.");
                    break;
                case "2":
                    System.out.println("Module loaded: Telemetry ready.");
                    break;
                case "3":
                    System.out.println("Module loaded: Incidents ready.");
                    break;
                case "4":
                    System.out.println("Exiting LogPulse...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}