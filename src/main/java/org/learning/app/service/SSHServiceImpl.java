/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package org.learning.app.service;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import org.learning.app.dto.PatchingRequest;
import org.springframework.stereotype.Service;

@Service
public class SSHServiceImpl implements SSHService {


    @Override
    public void downloadFile(PatchingRequest request) {
        String host="app1132.lab1.ariba.com";
        String user="anlq2";
        String password="Trx3qLJO0Zkx";
        String remoteScpCommand="scp /home/anlq2/DF72.zip";//   /home/anlq2/DF72.zip
        String directory = "/home/anlq2/DF72.zip";
        try{
            //scp anlq2@app1132.lab1.ariba.com:/home/anlq2/DF72.zip
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            Session session=jsch.getSession(user, host, 22);
                session.setPassword(password);
            session.setConfig(config);
            session.connect();
            System.out.println("Connected");

            Channel channel=session.openChannel("sftp");
            channel.connect();

            ChannelSftp sftp = (ChannelSftp) channel;
            sftp.cd(directory);
            sftp.get("/home/anlq2/DF72.zip","/Users/i350472/Downloads/DF72.zip");

            Boolean success = true;

            if(success){
                // The file has been succesfully downloaded
            }

            channel.disconnect();
            session.disconnect();

        }catch(Exception e){
            e.printStackTrace();
        }
    }




    /*public void downloadFile(PatchingRequest request) {
        String host="app1132.lab1.ariba.com";
        String user="anlq2";
        String password="Trx3qLJO0Zkx";
        String remoteScpCommand="scp /home/anlq2/DF72.zip";//   /home/anlq2/DF72.zip
        try{
            //scp anlq2@app1132.lab1.ariba.com:/home/anlq2/DF72.zip
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            Session session=jsch.getSession(user, host, 22);
            session.setPassword(password);
            session.setConfig(config);
            session.connect();
            System.out.println("Connected");

            Channel channel=session.openChannel("exec");
            ((ChannelExec)channel).setCommand(remoteScpCommand);


            channel.setInputStream(null);
            ((ChannelExec)channel).setErrStream(System.err);

            OutputStream out=channel.getOutputStream();
            InputStream in=channel.getInputStream();
            channel.connect();

            byte[] buf=new byte[1024];

            // send '\0'
            buf[0]=0;
            out.write(buf, 0, 1);
            out.flush();


            byte[] tmp=new byte[1024];
            while(true){
                while(in.available()>0){
                    int i=in.read(tmp, 0, 1024);
                    if(i<0)break;
                    System.out.print(new String(tmp, 0, i));
                }
                if(channel.isClosed()){
                    System.out.println("exit-status: "+channel.getExitStatus());
                    break;
                }
                try{Thread.sleep(1000);}catch(Exception ee){}
            }
            channel.disconnect();
            session.disconnect();
            System.out.println("DONE");
        }catch(Exception e){
            e.printStackTrace();
        }
    }*/
}
