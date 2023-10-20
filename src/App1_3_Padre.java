import java.io.IOException;

public class App1_3_Padre {
    public static void main(String[] args) {

        Process[] process = new Process[args.length];
        String [] letras = {"a","e","i","o","u"};
        try {
            for (int i = 0; i < process.length; i++) {
                ProcessBuilder pb = new ProcessBuilder();
                pb.command("py");
                pb.command("C:/Users/Usuario/python project/1_3Actividad.py");
                pb.command("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                pb.command(letras[i]);
                pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
                process[i] = pb.start();

            }
            for (int i = 0; i < process.length; i++) {
                int ec = process[i].waitFor();
                if (ec == 0) {
                    System.out.println("Proceso: " + i + " se ha ejecutado correctamente");
                } else {
                    System.err.println("Se a producido un error en el proceso: " + i);
                }
            }
        } catch (InterruptedException IE) {
            System.err.println("No se ha encontrado el programa ERROR:");
            System.exit(1);
        } catch (IOException IO) {
            System.err.println("Se ha interrupido el proceso ERROR: "+IO.getMessage());

        }
    }
}