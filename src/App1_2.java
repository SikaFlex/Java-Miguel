import java.io.IOException;

public class App1_2 {
    public static void main(String[] args)  {

        Runtime runtime = Runtime.getRuntime();

        try{
            int ec= runtime.exec(args).waitFor();
            if (ec==0){
                System.out.println("El proceso a sido un exito");
            }
            else {
                System.err.println("Tu proceso a sido interrumpido");
            }

        }catch (InterruptedException ie){
            System.err.println("ha habido un error durante la ejecucion ERROR: " +ie);
            System.exit(1);
        }
        catch (ArrayIndexOutOfBoundsException AIB){
            System.err.println("No se han encontrado argumentos ERROR: " + AIB);
            System.exit(1);
        }
        catch (IOException IOE){
            System.err.println("El programa que intenta ejecutar no existe");
            System.exit(1);
        }

    }
}
