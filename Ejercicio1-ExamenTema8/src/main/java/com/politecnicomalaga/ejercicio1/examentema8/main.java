package com.politecnicomalaga.ejercicio1.examentema8;

import java.util.Scanner;

/**
 *
 * @author xxrax
 */
public class main {

    public static void main(String[] args) {

        Oficina ofi = new Oficina();
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Programa prototipo de gestion bancaria:");
            System.out.println("0. Salir");
            System.out.println("1. Crear oficina/Modificar datos de oficina.");
            System.out.println("2. Dar de alta una cuenta.");
            System.out.println("3. Cerrar una cuenta.");
            System.out.println("4. Buscar una cuenta");
            System.out.println("5. Listar todas las cuentas");
            System.out.println("Introduzca la opcion que desee ejecutar");

            int op = scan.nextInt();

            if (op == 0) {
                break;
            } else if (op == 1) {
                System.out.println("Introduce la direccion");
                String a = scan.nextLine();
                String direccion = scan.nextLine();
                System.out.println("Introduce el codigo de la oficina");
                String codOfi = scan.nextLine();
                System.out.println("Introduce el telefono");
                String tlf = scan.nextLine();
                System.out.println("Introduce el email");
                String email = scan.nextLine();
                System.out.println("Introduce el codigo postal");
                String cp = scan.nextLine();
                System.out.println("Introduce la ciudad");
                String ciudad = scan.nextLine();
                ofi = new Oficina(direccion, codOfi, tlf, email, cp, ciudad);

            } else if (op == 2) {
                System.out.println("Que tipo de cuenta desea crear");
                System.out.println("1. Ahorro");
                System.out.println("2. Hipoteca");
                System.out.println("3. Deposito");
                int opC = scan.nextInt();
                String tipo = null;
                if (opC == 1) {
                    tipo = "ahorro";
                } else if (opC == 2) {
                    tipo = "hipoteca";
                } else if (opC == 3) {
                    tipo = "deposito";
                }
                System.out.println("Escriba el DNI del propietario");
                String a = scan.nextLine();
                String dni = scan.nextLine();
                System.out.println("Escriba el nombre del propietario");
                String nombre = scan.nextLine();
                System.out.println("Escriba el email del propietario");
                String email = scan.nextLine();
                System.out.println("Escriba el telefono del propietario");
                String tlf = scan.nextLine();
                System.out.println("Escriba el iban");
                String iban = scan.nextLine();

                CuentaBancaria cuenta = new CuentaBancaria(dni, nombre, email, tlf, iban, tipo);
                ofi.darAlta(cuenta);

            } else if (op == 3) {
                System.out.println("Introduce el iban de la cuenta que quieras borrar");
                String iban = scan.nextLine();
                ofi.cerrarCuenta(ofi.buscarCuenta(iban));
            } else if (op == 4) {
                System.out.println("Indroduzca el iban de la cuenta");
                String iban = scan.nextLine();
                CuentaBancaria cuenta = ofi.buscarCuenta(iban);
                if (ofi.isEncontrada()) {
                    ofi.setEncontrada(false);
                    while (true) {
                        System.out.println("IBAN: "+iban+ "Saldo: "+ cuenta.getSaldo());
                        System.out.println("Operacion a realizar: ");
                        System.out.println("    0. Volver atras");
                        System.out.println("    1. Retirar dinero de nuestra cuenta");
                        System.out.println("    2. Ingresar dinero en nuestra cuenta");
                        System.out.println("    3. Transferir dinero de nuestra cuenta a otra");
                        System.out.println("    4. Recibir dinero de otra cuenta a la nuestra");
                        System.out.println("    5. Ajustar intereses");
                        System.out.println("    6. Calcular retencion mensual hipoteca");

                        int opc = scan.nextInt();
                        
                        if(opc == 0){
                            
                        }else if(opc == 1){
                            System.out.println("Introduce la fecha de la operacionen este formato 02032000 que significaria");
                            System.out.println("02 el dia 03 el mes y 2000 el año");
                            int fecha = scan.nextInt();
                            System.out.println("Introduce la hora");
                            String hora = scan.nextLine();
                            System.out.println("Introduce el iban de la cuenta origen");
                            String ibanOrigen = scan.nextLine();
                            System.out.println("Introduce la cantidad a operar");
                            int cantidadOperada = scan.nextInt();
                            
                            cuenta.crearOperacion(fecha, hora, ibanOrigen, "efectivo", cantidadOperada);
                            cuenta.retirar(cantidadOperada);
                            
                        }else if(opc == 2){
                            System.out.println("Introduce la fecha de la operacionen este formato 02032000 que significaria");
                            System.out.println("02 el dia 03 el mes y 2000 el año");
                            int fecha = scan.nextInt();
                            System.out.println("Introduce la hora");
                            String hora = scan.nextLine();
                            System.out.println("Introduce el iban de la cuenta origen");
                            String ibanOrigen = scan.nextLine();
                            System.out.println("Introduce la cantidad a operar");
                            int cantidadOperada = scan.nextInt();
                            
                            cuenta.crearOperacion(fecha, hora, ibanOrigen, "efectivo", cantidadOperada);
                            cuenta.ingresar(cantidadOperada);
                            
                        }else if(opc == 3){
                            System.out.println("Introduce la fecha de la operacionen este formato 02032000 que significaria");
                            System.out.println("02 el dia 03 el mes y 2000 el año");
                            int fecha = scan.nextInt();
                            System.out.println("Introduce la hora");
                            String hora = scan.nextLine();
                            System.out.println("Introduce el iban de la cuenta origen");
                            String ibanOrigen = scan.nextLine();
                            System.out.println("Introduce el iban de la cuenta destino");
                            String ibanDestino = scan.nextLine();
                            System.out.println("Introduce la cantidad a operar");
                            int cantidadOperada = scan.nextInt();
                            
                            cuenta.crearOperacion(fecha, hora, ibanOrigen, ibanDestino, cantidadOperada);
                            if(cantidadOperada >= 0){
                                
                                CuentaBancaria cuentaDestino = ofi.buscarCuenta(ibanDestino);
                                if(ofi.isEncontrada()){
                                    ofi.setEncontrada(false);
                                    cuenta.retirar(cantidadOperada);
                                    cuentaDestino.ingresar(cantidadOperada);
                                }else{
                                    System.out.println("Cuenta no encontrada");
                                }
                                
                            }
                            
                            
                        }else if(opc == 4){
                            System.out.println("Introduce la fecha de la operacionen este formato 02032000 que significaria");
                            System.out.println("02 el dia 03 el mes y 2000 el año");
                            int fecha = scan.nextInt();
                            System.out.println("Introduce la hora");
                            String hora = scan.nextLine();
                            System.out.println("Introduce el iban de la cuenta origen");
                            String ibanOrigen = scan.nextLine();
                            System.out.println("Introduce el iban de la cuenta destino");
                            String ibanDestino = scan.nextLine();
                            System.out.println("Introduce la cantidad a operar");
                            int cantidadOperada = scan.nextInt();
                            
                            cuenta.crearOperacion(fecha, hora, ibanOrigen, ibanDestino, cantidadOperada);
                            if(cantidadOperada <= 0){
                                
                                CuentaBancaria cuentaDestino = ofi.buscarCuenta(ibanDestino);
                                if(ofi.isEncontrada()){
                                    ofi.setEncontrada(false);
                                    cuenta.ingresar(cantidadOperada);
                                    cuentaDestino.retirar(cantidadOperada);
                                }else{
                                    System.out.println("Cuenta no encontrada");
                                }
                                
                            }else{
                                System.out.println("El valor de cantidad a operar tiene que ser positivo");
                            }
                        }else if(opc == 5){
                            
                        }else if(opc == 6){
                            System.out.println(cuenta);
                        }
                    }
                }
            } else if (op == 5) {
                System.out.println(ofi.listarCuentas().toString());
            }

        }

    }
}
