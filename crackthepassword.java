import java.security.SecureRandom;
import java.util.Random;

public class CrackThePasswort {
    public static void main(String[] args) {
//        String chars = "0123456789!#$%&()*<=>?@[]^{|}~";
        String chars = "0123456789";
        System.out.println(chars);
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int len = 4;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        System.out.println("Random password: " + sb);

        boolean checked = true;

        int attempts = 0;

        for (int i = 0; i < chars.length() && checked; i++) {
            for (int j = 0; j < chars.length() && checked; j++) {
                for (int k = 0; k < chars.length() && checked; k++) {
                    for (int l = 0; l < chars.length() && checked; l++) {

                        attempts++;
                        if (chars.charAt(i) == sb.charAt(0) && chars.charAt(j) == sb.charAt(1) && chars.charAt(k) == sb.charAt(2) && chars.charAt(l) == sb.charAt(3)) {

                            System.out.println("Passwort:  " + chars.charAt(i) + chars.charAt(j) + chars.charAt(k) + chars.charAt(l));
                            checked = false;
                        }
                    }


                }
            }


        }
        System.out.println("Anzahl versuche: " + attempts);

    }
}



