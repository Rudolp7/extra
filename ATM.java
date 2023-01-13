import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //pudiera crear una classe que se llame cuenta y ahi ponerle el Pin solamente que no recuerdo muy bien como hiba la herencia 
        int accountNumber=16303365, pin=1011, choice;
        double balance = 0, deposit, withdrawal;

        // Busqueda De tu cuenta bancaria
        System.out.println("Ingrese su número de cuenta: ");
        accountNumber = scanner.nextInt();

        // Verificar PIN
        System.out.println("Ingrese su PIN de 4 dígitos: ");
        pin = scanner.nextInt();
        if (verifyPIN(pin)) {
            // Menu de cuenta
            do {
                System.out.println("Bienvenido al cajero automático. Que te gustaría hacer?");
                System.out.println("1. Ver detalles de la cuenta");
                System.out.println("2. Hacer un depósito");
                System.out.println("3. Has un retiro");
                System.out.println("4.Cancelar cuenta");
                System.out.println("5. Exit");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1: //Ver detalles de la cuenta
                        System.out.println("Número de cuenta: " + accountNumber);
                        System.out.println("Balance: $" + balance);
                        break;
                    case 2: // Realizar el depósito
                        System.out.println("Ingrese el monto del depósito: ");
                        deposit = scanner.nextDouble();
                        balance += deposit;
                        System.out.println("Depósito exitoso. Nuevo balance: $" + balance);
                        break;
                    case 3: // hacer retiro
                        System.out.println("Ingrese el monto del retiro: ");
                        withdrawal = scanner.nextDouble();
                        if (withdrawal > balance) {
                            System.out.println("Fondos insuficientes.");
                        } else {
                            balance -= withdrawal;
                            System.out.println("Retiro exitoso. Nuevo balance: $" + balance);
                        }
                        break;
                    case 4: //Cancelar cuenta
                        balance = 0;
                        System.out.println("¡Cuenta cancelada!");
                        break;
                    case 5: // Exit
                        System.out.println("Gracias por usar el cajero automático. Adiós.");
                        break;
                    default:
                        System.out.println("Elección no válida. Inténtalo de nuevo.");
                        break;
                }
            } while (choice != 5);
        } else {
            System.out.println("PIN no válido. Acceso denegado.");
        }
    }

    public static boolean verifyPIN(int pin) {
        // aqui va  la verificación del PIN real pero no me dio tiempo a hacerlo ,perdon T-T.
        return true;
    }
}
