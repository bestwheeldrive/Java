package jonathan;
public class stringmanipulation72 {
	public static void main(String[] args){
		String str="The Wolverine";
		System.out.println("Length of string:"+str.length());
		System.out.println("Character at position 5:"+str.charAt(5));
		System.out.println("Index of character 'S':"+str.indexOf('S'));
		System.out.println("Convert to Lowercase:"+str.toLowerCase());
		System.out.println("Convert to UpperCase:"+str.toUpperCase());
		System.out.println("Compare to 'Astar':"+str.compareTo("Astar"));
		System.out.println("Compare to 'rockstar':"+str.compareTo("Rockstar"));
		System.out.println("Replace The with The invincible"+str.replace("the","Invincible "));
	}
}