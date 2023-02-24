package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
	public static void main(String[] args) throws Exception {
		//UDP용 소켓이 있어야함
		DatagramSocket socket = new DatagramSocket();//전화기역할
		
		//UDP용 패킷이 있어야함 (데이터, 데이터 크기, ip, port)
		String s = "i am java programmer...";//내가 할말
		byte[] data = s.getBytes();//바이트로 보내야함
		//로컬호스트 본인 ip주소 127.0.0.1
		InetAddress ip = InetAddress.getByName("127.0.0.1");//ip주소
		
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8888);
		
		//소켓을 이용해서 패킷을 보낸다.
		socket.send(packet);
		socket.close();//전화기를 끊는다.
		
		
	}
}
