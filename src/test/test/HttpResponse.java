package test.test;

public class HttpResponse {
	
	final Converter converter;
	
	public HttpResponse(Converter converter) {
		this.converter = converter;
	}
	
	public String parse(byte[] data) {
		return converter.convert(data);
	}

}
