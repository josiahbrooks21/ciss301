/*
	This file uses the GUI_Demo to show studnets how to create an GUI that can be used in a application.
*/
import java.awt.event.*;

public class StoryTeller{
	GUI_Demo SDGUI = new GUI_Demo();			// creating the SDGUI as the GUI_Demo class
	int CurrentStoryPoint = 0;								// this controles what question you are on
	String UserName = new String();					// keeping track of the users name
	String UserFavColor = new String();			// keeping track of the users favorite color
	String UserAge = new String();					// keeping track of the users age
	String UserFavFood = new String();			// keeping track of the users favorite food
	String UserFavDrink = new String();				// keeping track of the users favorite drink
	String UserSchool = new String();			// keeping track of the users school
	String UserMajor = new String();				// keeping track of the users major
	String UserJob = new String();				// keeping track of the users job
	String UserPet = new String();					// keeping track of the users pet
	String UserFact = new String();				// keeping track of the users fact
	
	
	public static void main(String args[]) {
		new StoryTeller();
	}
	
	// constructor for this class, buids the gui, adds a listener and kicks off the story teller.
	public StoryTeller() {
		SDGUI.ConstructGUI();
		
		// problem here because references object directly
		SDGUI.user_input.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER)  {
					StoryLogic() ;
				}
			}
		});
		StoryLogic() ;
	}
	
	public void StoryLogic() {
		if(CurrentStoryPoint == 0){
			SDGUI.PrependToTextArea("Hello, my name is Eli.\nWhat is your name?\n");
			CurrentStoryPoint = 1;
		}
		
		else if(CurrentStoryPoint == 1){
			UserName = SDGUI.getUserText();
			SDGUI.PrependToTextArea("Okay " + UserName + ", what is your favorite color?\n");
			SDGUI.setUserText("");
			CurrentStoryPoint = 2;
		}
		
		else if(CurrentStoryPoint == 2){
			UserFavColor = SDGUI.getUserText();
			SDGUI.PrependToTextArea(UserName + ", I don't like " + UserFavColor
			+ ", green is much better. " + UserName + ", how old are you?" + '\n');
			SDGUI.setUserText("");
			CurrentStoryPoint = 3;
		}
		
		else if(CurrentStoryPoint == 3){
			UserAge = SDGUI.getUserText();
			SDGUI.PrependToTextArea(UserName + ", No way I'm " + UserAge
			+ ", too. " + UserName + ", What is your favorite food?" + '\n');
			SDGUI.setUserText("");
			CurrentStoryPoint = 4;
		}
		
		else if(CurrentStoryPoint == 4){
			UserFavFood = SDGUI.getUserText();
			SDGUI.PrependToTextArea("I eat " + UserFavFood
			+ " that sometimes. " + UserName + ", Do you have a favorite drink?" + '\n');
			SDGUI.setUserText("");
			CurrentStoryPoint = 5;
		}
		
		else if(CurrentStoryPoint == 5){
			UserFavDrink = SDGUI.getUserText();
			SDGUI.PrependToTextArea("Ewwwww " + UserFavDrink
			+ ", Coke is way better. " + UserName + ", Where do you go to school?" + '\n');
			SDGUI.setUserText("");
			CurrentStoryPoint = 6;
		}
		
		else if(CurrentStoryPoint == 6){
			UserSchool = SDGUI.getUserText();
			SDGUI.PrependToTextArea("Whoa, I thought of going to " + UserSchool
			+ ", but I decided to stay home. " + UserName + ", do you have a job?" + '\n');
			SDGUI.setUserText("");
			CurrentStoryPoint = 7;
		}
		
		else if(CurrentStoryPoint == 7){
			UserJob = SDGUI.getUserText();
			SDGUI.PrependToTextArea("A " + UserJob
			+ " that is really cool! " + UserName + ", what is your major?" + '\n');
			SDGUI.setUserText("");
			CurrentStoryPoint = 8;
		}
		
		else if(CurrentStoryPoint == 8){
			UserMajor = SDGUI.getUserText();
			SDGUI.PrependToTextArea(UserMajor + ", that must be hard to do. "
			+ UserName + ", do you have any pets?" + '\n');
			SDGUI.setUserText("");
			CurrentStoryPoint = 9;
		}
		
		else if(CurrentStoryPoint == 9){
			UserPet = SDGUI.getUserText();
			SDGUI.PrependToTextArea("I love " + UserPet + ", they are the best dogs. " + UserName + ", last question, what is a fun fact about you?" + '\n');
			SDGUI.setUserText("");
			CurrentStoryPoint = 10;
		}
		
		else if(CurrentStoryPoint == 10){
			UserFact = SDGUI.getUserText();
			SDGUI.PrependToTextArea("You're a " + UserFact + ", that means you are fast." + '\n');
			SDGUI.setUserText("");
			SDGUI.PrependToTextArea("Type 'Good talk' to quit.\n");
			CurrentStoryPoint = 11;
		}
		
		else if(CurrentStoryPoint == 11 && new String("Good talk").equals(SDGUI.getUserText())){
			System.exit(1); 
		}
		
	}
	
}
