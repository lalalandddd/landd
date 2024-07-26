package study;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void sendEmail(String fromEmail, String title, String content) {
// ���Ǳ� ��ϵǸ� ������ �̸��Ϸ� �����ϱ�
// static���� ����� ��ü�� ���� �ʿ䰡 ����...
		final String adminEmail="plexion0@naver.com";
		final String password="3UZUDVS7C3NX";
// ���̹� 2�ܰ� ��й�ȣ ���� �ɷ� �ؾ� ��(���̹� ����� �ƴ�)
// ������ �̸��� ȯ�漳�� ���
		Properties prop=new Properties();
		prop.put("mail.smtp.host","smtp.naver.com");  // smtp ������
		prop.put("mail.smtp.port","587");  // smtp ��Ʈ��ȣ
		prop.put("mail.smtp.starttls.enable", "true");  // tls ��뿩��
		prop.put("mail.smtp.auth", "true");  // smtp ���� ����
// ���Ǳ��� ��ϵǸ� ������ �̸��Ϸ� ���۵Ǿ�� �Ѵ�. ������ ����� �޴� ����� �ʿ��ѵ�,
// ������ ����� Ŭ���̾�Ʈ������ ���� Ŭ���̾�Ʈ ���Ͽ��� �߼۵Ǵ°� �ƴϰ� �ڹٿ��� �߼��ϴ� ���̱� ������
// �����ڰ� ������ �ް� �ؾ� �Ѵ�.
		Session adminAuth=Session.getInstance(prop,new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(adminEmail,password);
			}
		});  // ������ �̸��� �α��� ����    52/15
// ������ ������ ���̹Ƿ� 5�� �߿��� Session.mail�� import�ؾ� �Ѵ�.
		try {
			MimeMessage msg=new MimeMessage(adminAuth);
			msg.setFrom(new InternetAddress(adminEmail));  // ������ �̸��� �ּ�
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(adminEmail));  // �޴� �̸��� �ּ�
			msg.getHeader("Content-Type","text/html;charset=utf-8");
			msg.setSubject("���� �� ��� [ "+title+" ]-"+fromEmail);  // �̸��� ����
			msg.setContent("<h3>���� ����</h3><b>"+content+
				"<b><div><a href='http://localhost:8080/java_jsp/study/?part=inquiry'>"+
				"���Ǳ� Ȯ��</a></div>","text/html;charset=utf-8");  // �̸��� ����
			Transport.send(msg);  // ���� ����
		}catch(MessagingException e) {
			e.printStackTrace();
			System.out.println("�̸��� ���� ����");
		}
	}
}
