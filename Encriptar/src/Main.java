import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Main {
    public static String encryptToSHA256(String input){
        try {
            //Crea una instanca de algoritmo SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            //Aplicar el algoritmo al texto ingresado
            byte[] hash = digest.digest(input.getBytes("UTF-8"));
            //Convertir el hash en una representacion hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1)
                hexString.append('0');
                hexString.append(hex);}
            return hexString.toString();
        }catch (Exception e){
            throw new RuntimeException("Error al encriptar con SHA-256, e");
        }
            }
            //Ejemplo de uso
    public static void main (String []args){
        String texto = "Hola Mundo";
        String hash = encryptToSHA256(texto);
        System.out.println("Texto original: "+ texto);
        System.out.println("Hash SHA-256: "+ hash);
    }
        }