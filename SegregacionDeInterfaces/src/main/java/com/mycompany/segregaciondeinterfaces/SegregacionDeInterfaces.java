
package com.mycompany.segregaciondeinterfaces;

public class SegregacionDeInterfaces {

    public static void main(String[] args) {
        GmailAccount account = new GmailAccount("señor Juan", "Juanito123@gmail.com");
        EmailSender.sendEmail(account, "Hello from Java!");
    }
}
