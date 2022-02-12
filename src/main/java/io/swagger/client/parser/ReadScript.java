package io.swagger.client.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadScript {

    public void readBashScript() {
        try {
            Process proc = Runtime.getRuntime().exec("src/main/java/io/swagger/client/resources/script.sh");
            BufferedReader read = new BufferedReader(new InputStreamReader(
                    proc.getInputStream()));
            try {
                proc.waitFor();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            while (read.ready()) {
                System.out.println(read.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
