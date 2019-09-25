public class InputScanner{ 
    public static void main(String[] args){ 
		final String youngsister = "YOUNGER";
		final String oldersister = "OLDER";
		final String sister = "SECRET";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the age of your sister:");
		int age = scan.nextInt();
		
		String nickname = sister;
		if(age < 15){
		    nickname = youngsister;
		}
		
		if(age > 15){
		    nickname = oldersister;
		}
		
		switch(nickname){
		    case youngsister:
			     System.out.println("you are young");
				 break;
				 
			case oldersister:
			     System.out.println("you are old");
				 break;
				 
			case sister:
			     System.out.println("it is a secret");
				 break;
				 
			default:
			     System.out.println("Please try again");
		
		}
    } 
} 
