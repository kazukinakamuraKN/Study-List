package study7;

public class Human {
	String name;
	int birthday;
	int remainingPhysicalStrength;
	String timeZone;

	void eating(){
		System.out.println(this.name + "ご飯を食べました");
		remainingPhysicalStrength += 50;
	}

	void sleepinp(){
		System.out.println("寝ました");
		remainingPhysicalStrength += 200;
	}

	Human(String name, int birthday, int remainingPhysicalStrength, String timeZone){
		System.out.println("引数4.1");
		this.name = name;
		this.birthday = birthday;
		this.remainingPhysicalStrength = remainingPhysicalStrength;
		this.timeZone = timeZone;
		System.out.println("引数4.2");
		//thisを使ってこのインスタンスのフィールドにアクセスしている。
	}
	Human(String name, int birthday, int remainingPhysicalStrength){
		this(name, birthday, remainingPhysicalStrength,"無");
		System.out.println("引数3.2");
	}

	Human(String name, int birthday){
		this(name, birthday, 150);
		System.out.println("引数2.2");
	}

	Human(String name){
		this(name, 00000000);
		System.out.println("引数1.2");
	}

	Human(){
		this("不明");
		System.out.println("引数0");
	}
}