package individualProject;

import javafx.scene.control.TextArea;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * This is a GUI program that when given the criteria, it selects and prints 
 * houses that satisfy those criteria
 * 
 * @author Emmanuel 
 */

public class RealEstateAgent extends Application
{   
	//Declare all the GUI components as instance variables
	//Don't create the objects at this point
	//First we need a gridPane
    private GridPane  pane;
    

    //Create text field variables for bedrooms, areas, and prices
     TextField minPrice, maxPrice, minArea, maxArea, minBedroom, maxBedroom;

    //Create button variables for search and quit button
     Button Search, Quit;
    
    //Create text area variable
    TextArea textBox;

    //Create a scene
    private Scene scene;

//--------------------------------------------------
//create GUI components
    private void createGUIComponents()
    {
    	//Create GUI objects
        pane = new GridPane();
        

        //create the text fields
    	minPrice  = new TextField();
    	maxPrice = new TextField();
    	minArea = new TextField();
    	maxArea = new TextField();
    	minBedroom = new TextField();
    	maxBedroom = new TextField();

        //create the buttons
    	Search = new Button("Search");
    	Quit = new Button("Exit");
    	
    	//create the text area
    	textBox = new TextArea();
        
        //Add all of the components to the pane
    	pane.add(new Label("Criteria"), 0,0);
    	pane.add(new Label("Minimum"), 1, 0);
    	pane.add(new Label("Maximum"), 2, 0);
    	pane.add(new Label("Price"), 0, 1);
    	pane.add(new Label("Area"), 0, 2);
    	pane.add(new Label("Bedroooms"), 0, 3);
    	pane.add(Search, 0, 4);
    	pane.add(minPrice, 1,1);
    	pane.add(maxPrice, 2, 1);
    	pane.add(minArea,1,2);
    	pane.add(maxArea,2,2);
    	pane.add(minBedroom,1,3);
    	pane.add(maxBedroom,2,3);
    	pane.add(Quit, 2, 4);
    	pane.add(textBox, 1, 4);
    	
    	//Set the horizontal and vertical gap to 10
    	pane.setHgap(10);
    	pane.setVgap(10);
    	
    	//Align pane to the middle of the screen
    	pane.setAlignment(Pos.CENTER);
    	
    	//Set the padding to 10
    	pane.setPadding(new Insets(10));
    	
    	//Make the text box immutable
    	textBox.setEditable(false);
    }

//--------------------------------------------------
    
    /**
     * Start the stage and combine all components
     * 
     * @param Stage
     */
	public void start(Stage primaryStage)
	{
	    createGUIComponents();
	    attachHandlers();
		
	    //Create a scene and place it on stage
	    scene = new Scene(pane);
	    
	    //Set the properties of the stage
	    primaryStage.setTitle("Real Estate Agent App ");
	    primaryStage.setWidth(800);
	    primaryStage.setHeight(400);
	    primaryStage.setScene(scene);
	    primaryStage.show();
	}
//----------------------------------------------------------
	/**
	 * Launch application
	 * @param args
	 */
	public static void main(String[] args)
	{
		Application.launch(args);
	}

//--------------------------------------------------

    public void attachHandlers()
    {
        Quit.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
            	Platform.exit();
            }
        }
        ); 
        
        Search.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
            	double minP = Double.parseDouble(minPrice.getText()); 
            	double maxP = Double.parseDouble(maxPrice.getText());    	
            	double minA = Double.parseDouble(minArea.getText());    	
            	double maxA = Double.parseDouble(maxArea.getText()); 
            	int minBed = Integer.parseInt(minBedroom.getText());    	
            	int maxBed = Integer.parseInt(maxBedroom.getText());    	

            	Criteria c = new Criteria(minP, maxP, minA, maxA, minBed, maxBed);
            	
            	HouseList oHouse = new HouseList("C:\\\\Users\\\\emman\\\\Downloads\\\\CSC205\\\\CSC205\\\\src\\\\houses.txt");
            	 textBox.setText(oHouse.getHouses(c));
            }
        }
        );
    }
}
