package jonathan;

public class nestedif5c {

	public static void main(String[] args) {
		int age=10;
		String voterid="yes";
		if(age>=18)
		{
			if(voterid=="yes")
			{
				System.out.println("you can vote");
			}
		}
		else
			System.out.println("you cannot vote");
	}

}
