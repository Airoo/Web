package shop.helpers;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component(value = "passwordHelper")
public class PasswordHelper implements PasswordEncoder {
    private MessageDigest md5;

    public PasswordHelper() {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String encode(CharSequence rawPassword) {
        if (md5 == null) {
            return rawPassword.toString();
        }
        md5.update(rawPassword.toString().getBytes());
        byte[] byteData = md5.digest();
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encode(rawPassword).equals(encodedPassword);
    }

    public static String hash(CharSequence rawPassword) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        if (md5 == null) {
            return rawPassword.toString();
        }
        md5.update(rawPassword.toString().getBytes());
        byte[] byteData = md5.digest();
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static void main(String[] args) {
        System.out.println(hash("user"));//ee11cbb19052e40b07aac0ca060c23ee
        System.out.println(hash("admin"));//21232f297a57a5a743894a0e4a801fc3
    }
}
