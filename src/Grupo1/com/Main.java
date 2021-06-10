package Grupo1.com;

import java.util.Scanner;
import java.io.*;

public class Main {

    static Scanner readStr = new Scanner(System.in);
    static Scanner readNum = new Scanner(System.in);
    static Alumnos[] Alumno = new Alumnos[100];
    static Profesores[]Profesor = new Profesores[20];
    static Cursos[] Curso = new Cursos[15];
    static int ContadorAlumnos = 0;
    static int ContadorProfesores = 0;
    static int ContadorCursos = 0;

    public static void main(String[] args) {
    Menu();
    }

    public static void Menu(){
    int op = 0;
             do {
                 System.out.println("==================MENÚ================");
                 System.out.println("||         1. Cargar Alumnos        ||");
                 System.out.println("||       2. Cargar Profesores       ||");
                 System.out.println("||         3. Cargar Cursos         ||");
                 System.out.println("||        4. Asignar Alumnos        ||");
                 System.out.println("||       5. Asignar Profesores      ||");
                 System.out.println("||          6. Cargar Notas         ||");
                 System.out.println("||   7. Agregar Usuario al Sistema  ||");
                 System.out.println("||         8. Cerrar Sesion         ||");
                 System.out.println("======================================");
                 System.out.print("Ingrese una opcion: ");
                 try {
                     op = readNum.nextInt();
                     switch (op) {
                         case 1:
                             System.out.println("");
                             System.out.println("<-------------------- Carga de Alumnos -------------------->");
                             CargaAlumnos();
                             break;
                         case 2:
                             System.out.println("");
                             System.out.println("<------------------- Carga de Profesores ------------------>");
                             CargaProfesores();
                         case 3:
                             System.out.println("");
                             System.out.println("<--------------------- Carga de Cursos --------------------->");
                             CargaCursos();
                             break;
                         case 4:
                             System.out.println("Asignación de Alumnos");
                             break;
                         case 5:
                             System.out.println("Asignación de Profesores");
                             break;
                         case 6:
                             System.out.println("Carga de Notas");
                             break;
                         case 7:
                             System.out.println("Creacion de nuevo usuario");
                             break;
                         case 8:
                             System.out.println("");
                             break;
                         default:
                             System.out.println("!!!Ingrese una opcion que esté contenida en el menú!!!");
                     }
                 } catch (Exception e) {
                     readNum.nextLine();
                     System.out.println("!!!Debes ingresar una opcion correcta!!!");
                 }
             }while (op != 8);
        }           //Funcion de Menú

    public static void CargaAlumnos(){
        String ruta;
        System.out.print("Ingrese la ruta de archivo csv de Alumnos: ");
        ruta = readStr.nextLine();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea = br.readLine();

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                String [] Datos = linea.split(",");
                int id = Integer.parseInt(Datos[0]);
                int carnet = Integer.parseInt(Datos[1]);
                String nombre = Datos[2];
                String fecha = Datos[3];
                String genero = Datos[4];

                Alumnos nuevo = new Alumnos(id, carnet, nombre, fecha, genero);
                Alumno[ContadorAlumnos] = nuevo;
                ContadorAlumnos++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
      }

    public static void CargaProfesores(){
        String ruta;
        System.out.print("Ingrese la ruta de archivo csv de Profesores: ");
        ruta = readStr.nextLine();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea = br.readLine();

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                String [] Datos = linea.split(",");
                int id = Integer.parseInt(Datos[0]);
                int registro = Integer.parseInt(Datos[1]);
                String nombre = Datos[2];
                String fechaNac = Datos[3];
                String fechaCont = Datos[4];
                String genero = Datos[5];
                Profesores nuevo = new Profesores(id, registro, nombre, fechaNac, fechaCont, genero);
                Profesor[ContadorProfesores] = nuevo;
                ContadorProfesores++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public static void CargaCursos(){
        String ruta;
        System.out.print("Ingrese la ruta de archivo csv de Profesores: ");
        ruta = readStr.nextLine();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea = br.readLine();

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                String [] Datos = linea.split(",");
                int id = Integer.parseInt(Datos[0]);
                int registro = Integer.parseInt(Datos[1]);
                String nombre = Datos[2];
                Cursos nuevo = new Cursos(id, registro, nombre);
                Curso[ContadorCursos] = nuevo;
                ContadorCursos++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    }

