package test.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//파싱해야할 데이터
		byte[] data = new byte[0];
		
		//Json이 필요한경우
		new HttpResponse(new JsonConverter()).parse(data);
		
		//xml이 필요한 경우
		new HttpResponse(new XmlConverter()).parse(data);
		
		/*
		 * 위처럼 인터페이스를 주입하여 고수준 모듈인 HttpResponse에서의 추상 타입인 Converter를
		 * 저수준 모듈인 JsonConverter로 정의하느냐 XmlConverter로 정의하느냐에 따라 결과가 달라진다.
		 * 
		 * 이처럼 저수준모듈(Converter)이 고수준 모듈(HttpResponse)에서 정의한 추상타입을 
		 * 무엇으로 정의하느냐(Json이냐 Xml이냐)에 의존하는것을 의존역전이라한다. 
		 */
	}

}
