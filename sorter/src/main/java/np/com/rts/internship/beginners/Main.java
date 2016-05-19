package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

	String[] strings = new String[] {
			"hello",
			"mello",
			"mell",
			"1mell",
			"hmmm",
			"h2mmm",
			"zxcvb",
			"asdf",
			"%$compli"
	};

	public Main() {
		int n=strings.length;
		String greatest=strings[0];
		for(int j=0; j<n;j++)
		{
			for (int i=j+1 ; i<n; i++)
			{
				if(strings[i].trim().compareTo(strings[j].trim())<0)
				{
					String temp= strings[j];
					strings[j]=strings[i];
					strings[i]=temp;
				}
			}
		}
		for(int j=0; j<n;j++)
		{
			System.out.println(strings[j]);

		}
//		String actgreatest=strings[];

	}

	public static void main(String[] args) {
		new Main();
	}
}