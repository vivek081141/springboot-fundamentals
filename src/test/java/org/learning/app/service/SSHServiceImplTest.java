/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.app.service;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SSHServiceImplTest {
    @Test
    public void sftpTest() {
        String username = "anlq2";
        String host = "app1132.lab1.ariba.com";
        String password ="Trx3qLJO0Zkx";
        String privateKeyFile = "/Users/i350472/.ssh/id_rsa";
        String knownHostsFile = "/Users/i350472/.ssh/known_hosts";
        String fileName = "/home/anlq2/DF72.zip";
        int port = 22;

        JSch jsch = new JSch();
        Session session = null;
        Channel channel = null;
        try {
           // jsch.addIdentity(privateKeyFile);
            jsch.setKnownHosts(knownHostsFile);
            session = jsch.getSession(username, host, port);
            session.setPassword(password);
            session.setTimeout(20 * 1000);
            session.connect();

            channel = session.openChannel("shell");
            channel.connect();
            ChannelSftp channelSftp = (ChannelSftp) channel;

            System.out.println("Starting File download");
            //channelSftp.
            InputStream is = channelSftp.get(fileName);
            IOUtils.copy(is, System.out);
            is.close();

        } catch (JSchException | SftpException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (channel != null) {
                channel.disconnect();
            }
            if (session != null) {
                session.disconnect();
            }
        }
    }

    @Test
    public void Test2(){
        ProcessBuilder processBuilder = new ProcessBuilder();

        // -- Linux --

        // Run a shell command
        processBuilder.command("bash", "-c", "scp anlq2@app1008.lab1.ariba.com:/home/anlq2/DF72.zip .");

        // Run a shell script
        //processBuilder.command("path/to/hello.sh");

        // -- Windows --

        // Run a command
        //processBuilder.command("cmd.exe", "/c", "dir C:\\Users\\mkyong");

        // Run a bat file
        //processBuilder.command("C:\\Users\\mkyong\\hello.bat");

        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(output);
                System.exit(0);
            } else {
                //abnormal...
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}