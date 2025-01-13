/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package izquierdo.albora;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario 1
 */
public class Bank {

    public static void main(String[] args) {

        // PARTE 1 //
        ArrayList<Account> cuenta = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println(" << BIENVENID@ >>");

        //añadimos titular 1
        System.out.println(" << INGRESE EL NOMBRE DEL TITULAR 1 >>");
        String titular1 = sc.nextLine();
        System.out.println(" << INGRESE EL SALDO INICIAL DE LA CUENTA 1 >>");
        double balance1 = sc.nextDouble();

        //cuenta titular 1
        Account cuenta1 = new Account(balance1, titular1);

        //cuenta1.getNumber();
        cuenta1.setBalance(balance1);
        cuenta1.setHolder(titular1);

        cuenta.add(cuenta1);

        //for(Account a : cuentas){
        //System.out.println(a.getBalance());
        //System.out.println(a.getHolder());
        //}
        //Aañadimos titular 2
        Scanner pc = new Scanner(System.in);
        System.out.println(" << INGRESE EL NOMBRE DEL TITULAR 2 >>");
        String titular2 = pc.nextLine();
        System.out.println(" << INGRESE EL SALDO INICIAL DE LA CUENTA 2 >>");
        double balance2 = sc.nextDouble();

        //cuenta del titular 2
        Account cuenta2 = new Account(balance2, titular2);
        //cuenta2.getNumber() ;
        cuenta2.setBalance(balance2);
        cuenta2.setHolder(titular2);

        cuenta.add(cuenta2);

        // PARTE 2 //
        ArrayList<Integer> menu = new ArrayList<Integer>();
        int opc;

        do {

            opc = menu(menu);
            switch (opc) {

                case 1:
                    consultarSaldo(cuenta);
                    break;
                case 2:
                    ingresarDinero(cuenta);
                    break;
                case 3:
                    sacarDinero(cuenta);
                    break;
                case 4:
                    realizarTrasferencia(cuenta);
                    break;
                case 5:

                    break;

            }
        } while (opc != 5);

    }

    public static int menu(ArrayList<Integer> menu) {

        System.out.println(" << ----------------------- >>");
        System.out.println();
        System.out.println(" << INGRESE UNA OPCIÓN >>");

        System.out.println(" << ----------------------- >>");
        System.out.println();
        System.out.println(" << 1.Consultar saldo >>");
        System.out.println(" ");
        System.out.println(" << 2.Ingresar saldo >>");
        System.out.println(" ");
        System.out.println(" << 3.Sacar dinero >>");
        System.out.println(" ");
        System.out.println(" << 4.Realizar transferencia >>");
        System.out.println(" ");
        System.out.println(" << 5.Salir >>");

        Scanner sc = new Scanner(System.in);
        int menucito = sc.nextInt();
        if (menucito == 1) {

            System.out.println("Has seleccionado [1] -->");
            System.out.println(" ");

        } else if (menucito == 2) {
            System.out.println("Has seleccionado [2] --> ");
            System.out.println("  ");

        } else if (menucito == 3) {

            System.out.println("Has seleccionado [3] --> ");

            System.out.println(" ");
        } else if (menucito == 4) {

            System.out.println("Has seleccionado [4] --> ");
            System.out.println("  ");
        } else if (menucito == 5) {

            System.out.println("Has seleccionado [5] --> ");
            System.out.println(" <<GRACIAS POR USAR NUESTRO BANCO >> ");
        }
        return menucito;
    }

    public static void consultarSaldo(ArrayList<Account> cuenta) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un nombre");
        String ponNombre = sc.nextLine();

        Account account = null;
        for (int i = 0; i < cuenta.size(); i++) {
            if (cuenta.get(i).getHolder().equals(ponNombre)) {

                account = cuenta.get(i);
                break;
            } 

        }
        
        if(account != null){
            System.out.println(" << El saldo de la cuenta es : >>" + account.getBalance());

        }else{
            System.err.println(" << ERROR >>");
        }

    }

    public static void ingresarDinero(ArrayList<Account> cuenta) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un nombre");
        String ponNombre = sc.nextLine();
        
        
        Account account = null;
        
        for (int i = 0; i < cuenta.size(); i++) {
            
            Account accTemp = cuenta.get(i); 
            if (accTemp.getHolder().equals(ponNombre)) {
                System.out.println(" << TU SALDO ACTUAL ES DE : >>" + accTemp.getBalance());
                System.out.println(" ");
                System.out.println(" << CUANTO QUIERES AÑADIR : >>");
                double numSuma = sc.nextDouble();

                double suma = accTemp.getBalance() + numSuma;
               
               accTemp.setBalance(suma);
               System.out.println(" ");
               System.out.println(" << TU SALDO ACTUALIZADO ES DE : >>" + accTemp.getBalance());
               
               System.out.println(" ");

                //imagina que mi getBalnce es de 1000 y mi numSuma es 500 = que salga de reaultado = 1500
                /*yo haría algo asi para sumar = getBalance + suma -> que suma es lo que mete el cliente desde terminal*/
            } else if (!cuenta.get(i).getHolder().equals(ponNombre)) {

                System.out.println(" << ERROR >>");

            }

        }

    }

    public static void sacarDinero(ArrayList<Account> cuenta) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un nombre");
        String ponNombre = sc.nextLine();
        
                for (int i = 0; i < cuenta.size(); i++) {
            
            Account accTemp = cuenta.get(i); 
            if (accTemp.getHolder().equals(ponNombre)) {
                System.out.println(" << TU SALDO ACTUAL ES DE : >>" + accTemp.getBalance());
                System.out.println(" ");
                System.out.println(" << CUANTO QUIERES SACAR : >>");
                double numResta = sc.nextDouble();

                double suma = accTemp.getBalance() - numResta;
               
               accTemp.setBalance(suma);
                              System.out.println(" << HAS SACADO : >>" + numResta);

               System.out.println(" ");
               System.out.println(" << TU SALDO ACTUALIZADO ES DE : >>" + accTemp.getBalance());
               
               System.out.println(" ");

                //imagina que mi getBalnce es de 1000 y mi numSuma es 500 = que salga de reaultado = 1500
                /*yo haría algo asi para sumar = getBalance + suma -> que suma es lo que mete el cliente desde terminal*/
            } else if (!cuenta.get(i).getHolder().equals(ponNombre)) {

                System.out.println(" << ERROR >>");

            }

        }


        

    }
public static void realizarTrasferencia(ArrayList<Account> cuenta) {
    Scanner sc = new Scanner(System.in);

    // Solicitar cuenta origen
    System.out.println("Ingresa un nombre");
    String nombreOrigen = sc.nextLine();

    // Buscar la cuenta origen
    Account cuentaOrigen = null;
    for (Account account : cuenta) {
        if (account.getHolder().equalsIgnoreCase(nombreOrigen)) {
            cuentaOrigen = account;
            break;
        }
    }

    if (cuentaOrigen == null) {
        System.out.println(" << ERROR >>");
        return;
    }

    System.out.println("<< TU SALDO ACTUAL ES DE: >> " + cuentaOrigen.getBalance());
    System.out.println("<< CUÁNTO QUIERES MANDAR: >>");
    double cantiadadTransferencia = sc.nextDouble();
    sc.nextLine(); // Consumir el salto de línea restante

    // Validar cantidad a transferir
    if (cantiadadTransferencia <= 0 || cantiadadTransferencia > cuentaOrigen.getBalance()) {
        System.out.println(" << ERROR >>");
        return;
    }

    // Solicitar cuenta destino
    System.out.println("<< A QUÉ CUENTA QUIERES ENVIARLO >>");
    String nombreDestino = sc.nextLine();

    // Buscar la cuenta destino
    Account cuentaDestino = null;
    for (Account account : cuenta) {
        if (account.getHolder().equalsIgnoreCase(nombreDestino)) {
            cuentaDestino = account;
            break;
        }
    }

    if (cuentaDestino == null) {
        System.out.println(" << ERROR >>");
        return;
    }

    // Realizar la transferencia
    cuentaOrigen.setBalance(cuentaOrigen.getBalance() - cantiadadTransferencia);
    cuentaDestino.setBalance(cuentaDestino.getBalance() + cantiadadTransferencia);

    // Mostrar resultados
    System.out.println("<< TRANSFERENCIA EXITOSA >>");
    System.out.println("<< NUEVO SALDO DE " + cuentaOrigen.getHolder() + ": " + cuentaOrigen.getBalance() + " >>");
    System.out.println("<< NUEVO SALDO DE " + cuentaDestino.getHolder() + ": " + cuentaDestino.getBalance() + " >>");
}


        }
        
        
        
    

