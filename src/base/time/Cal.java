package base.time;

/*
Calendar클래스
달력을 표현하는 추상클래스 
날짜와 시간을 계산하는 방법이 지역과 문화에 따르기 때문에
특정 역법에 따르는 달력은 자식클래스로 구현하도록 되어 있습니다
특별한 역법을 사용하는 경우가 아니라면 직접 하위클래스를 만들 필요가 없고
Calendar클래스 의 정적메소드인 getInstance()메소드를 이용하면
컴퓨터에 설정되어 있는 시간대 TimeZone을 기준으로 Calendar하위 객체를
얻을수 있습니다

Calendar now = Calendar.getInstance();
Calendar제공하는 날짜와 시간에 대한 정보를 얻기 위해서는 get()메소드를 이용한다
Calendar에 정의된 상수를 주면 상수가 의미하는 값을 리턴한다
*/
import java.util.Calendar;
/*각나라마다 시차에 따른 다른시간을 TimeZone*/
//1) import
import java.util.TimeZone;

public class Cal {

	public static void main(String[] args) {
		//2) 타입존 클래스를 객체 설정
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance(timeZone);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null; //strWeek초기화
		
		switch(week){//요일설정
		 case Calendar.MONDAY: strWeek = "월"; break;
		 case Calendar.TUESDAY: strWeek = "화"; break;
		 case Calendar.WEDNESDAY: strWeek = "수"; break;
		 case Calendar.THURSDAY: strWeek = "목"; break;
		 case Calendar.FRIDAY: strWeek = "금"; break;
		 case Calendar.SATURDAY: strWeek = "토"; break;
		 default: strWeek = "일";
		}
		
		//오전오후
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		//시초분
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year+"년");
		System.out.println(month+"월");
		System.out.println(day+"일");
		System.out.println(strWeek+"요일");
		System.out.println(strAmPm+" ");
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(second+"초");
		
		//배열로 사용할수 있는 타임존 아이디 출력
		System.out.println("=============");
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
