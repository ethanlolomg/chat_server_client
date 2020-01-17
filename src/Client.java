import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
//create scanner
//call thread on the Output within Client

public class Client {

    class Output implements Runnable{

        @Override
        public void run() {

        }
    }
    Socket conn;
    DataInputStream in;
    DataOutputStream out;

    public Client(){
        try {
            conn = new Socket("127.0.0.1", 9090);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
