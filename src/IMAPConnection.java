import javax.net.ssl.SSLSocket;

public class IMAPConnection extends Connection {
	ImapProcessor processor = new ImapProcessor();

	public IMAPConnection(SSLSocket connection) {
		super(connection);
	}

	@Override
	String handleResult(byte[] command) {
		return processor.processBytes(command);
	}
	
}
