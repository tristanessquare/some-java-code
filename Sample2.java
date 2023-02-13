

public static void main(String[] args) {

	User user = new User("Daniel");
	changeMe(user);

	System.out.println(user);
	// output?
	
}

public void changeMe(User user) {
	user = new User("Andy");
}