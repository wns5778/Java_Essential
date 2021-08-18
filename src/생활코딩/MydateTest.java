package 생활코딩;
//hashCode()메소드를 구현
//날짜가 같으면 출력

class Mydate {
	int day;
	int month;
	int year;
	
	public Mydate (int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	@Override
	public int hashCode() {
		return day+month+year;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Mydate ) {
			Mydate date = (Mydate)obj;
			return (this.day == date.day);
		}
			
		return false;
	}
}

public class MydateTest {

	public static void main(String[] args) {
		
		Mydate date1 = new Mydate(22,7,2020);
		Mydate date2 = new Mydate(22,7,2020);

		System.out.println(date1.equals(date2)); //true
		
		System.out.println(date1.hashCode()); //2049
		System.out.println(date2.hashCode()); //2049
		
	}

}