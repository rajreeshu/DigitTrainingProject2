package kbcGame;

//import kbcGame.User;

public class Launch {

	public static void main(String[] args) {
		User player = new User();
		System.out.println("Please Enter your Name: ");
		player.setName();
		System.out.println("Welcome \033[1m"+ player.getName() +"\033[0m to Crorepati Game");
		
		Question que = new Question(player);
		que.question();
	}

}
