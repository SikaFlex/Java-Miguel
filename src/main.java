import java.io.IOException;

public class main {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder(args);
        Process p = null;
        try{
            p = pb.start();
            int ec= p.waitFor();
            //si el programa ha ido bien se lo notificamos al usuario
            if (ec==0){
                System.out.println("Todo correcto");
            }
            else{//en caso contrario le avisamos de que ha habido un error
                System.err.println("Se a producido un error en el primer proceso de ejecutacion");
            }

        }catch (IOException IOE){
            System.err.println("No he encontrado ese programa ERROR: "+IOE);
            System.exit(1);
        } catch (InterruptedException e) {
            System.err.println("Se ha interrupido el proceso ERROR: "+e);
            System.exit(1);
        }
    }
}
