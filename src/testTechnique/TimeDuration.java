package testTechnique;

public class TimeDuration {
	public int s;
	
	TimeDuration(int a){
		if(a>0) {
			s=a;
		}
				
	}
	
	public String toString() {
		int min;
		int h;		
		if (s>=3600) {
			h=s/3600;
			min= (s%3600)/60;
			s=(s%3600)%60;
			System.out.println(h+"h "+min+"min "+s+"s");
			return "ok";
		}
		else {
			if (s>=60){		
			min=s/60;
			s=s%60;
			System.out.println(min+"min "+s+"s");
			return "ok";
			}
		}
		
		System.out.println(s+"s");
		
		return "ok";
	}

}
