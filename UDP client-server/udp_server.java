import java.net.*;
import java.io.*;

class udp_server{
	public static void main(String args[]){
		byte[] data=new byte[65507];
		try{
			DatagramSocket skt=new DatagramSocket(1000);
			DatagramPacket dp=new DatagramPacket(data,data.length);
			while(true){
				try{
					skt.receive(dp);
					String s=new String(dp.getData(),0,dp.getLength());
					System.out.println(s);
				}
				catch(IOException ae){
					System.out.println(ae);
				}
			}
		}
		catch(IOException ae){
			System.out.println(ae);
		}
	}
}
