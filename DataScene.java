import org.code.theater.*;

public class DataScene extends Scene {
//   //
//   //HERES MY LISTS
//   //I GOT THE DATA OUT FROM MY TXT FILES
//   //
  private String[] name; //this is a list for the college names.
  private String[] areas;//this is an empty list for the area
  private int[] fund;//this list is for the funds
  private int[] staffs;//this makes a list for the staff

  
  //2 NEW 1D ARRAYs THAT I MAKE BY READING DATA FROM FUNDS AND STAFF LIST
  private int[] schoolSizes;
  private double[] squareRoots;


public DataScene(String nameFile, String areasFile, String fundFile, String staffsFile){ 
  name = FileReader.toStringArray(nameFile);//this array is for the names
  areas = FileReader.toStringArray(areasFile);//this array is for the area of where each college is located.
  fund = FileReader.toIntArray(fundFile);//this array is for the funds
  staffs = FileReader.toIntArray(staffsFile);//this array is for the staff
  schoolSizes = new int[name.length]; //this makes a new array with the same length as the name array
  squareRoots = new double[name.length];//only needs 8 spots, which is the length of the name array.
}
  
  
//FIRST MULTI-SELECTION STATEMENT
//this determines sizes of the colleges.
public void chooseSizes(){
  for (int i = 0; i < name.length; i++) {//THIS USES A MULTI SELECTION STATEMENT!!
    if (fund[i] <= 10) {
      schoolSizes[i] = 8;
    } else if (fund[i] <= 20) {
      schoolSizes[i] = 15;
    } else if (fund[i] <= 30) {
      schoolSizes[i] = 25;
    } else {
      schoolSizes[i] = 30;
    }
  }
}

  //this starts the scene
  //it clears it, then selects a color based off of which school has the most funding
  //it takes the numbers of each school, then finds the max

  public void startScene(){
    int imageScene = 0;//variable to find size
    clear("white");
    drawText("Lets Find out some info ", 90, 100);//first line of text
    drawText("about Ivy League Colleges!", 90, 125);//second line of text
      for (int i = 0; i < staffs.length; i++) {
    if (staffs[i] <= 1500) {
      imageScene = 50;
    } else if (staffs[i] <= 2500) {
      imageScene = 85;
    } else if (staffs[i] <= 3300) {
      imageScene = 110;
    } else {
      imageScene = 150;
    }
        playSound("crowd-cheer-in-school-auditorium-236699-(1).wav");//PLAYS SOUND #1
     this.drawImage("Screenshot-2024-12-05-231306.png", 120, 200, imageScene);   //USES MULTI SELECTION TO DRAW A LOGO
  }
}



//THIS METHOD PUTS A HOUSE DOWN
//uses 3 examples of math.random
//ends by drawing the house
// Places a house on the scene randomly
public void placeRandomHouse() {
  int x1 = (int)(Math.random() * 300); //random x value that does not go into the water
  int y1 = (int)(Math.random() * 400); //random y value
  int size1 = (int)(Math.random() * 21) + 20; //random house size

  this.drawImage("house.png", x1, y1, size1); //draws house with the variables from above
}

//this next method places down all 8 colleges
//takes a certain x value and y value
//combines that with the funds class for the size
public void placeColleges() {
  
      drawText("Locations and Sizes ", 20, 100);//this adds the title for the second slide
 drawText("Based on Staff # ", 20, 125);//this adds the title for the second slide
    //first college that i will place is Brown University
    int x2 = 293; // x value
    int y2 = 241; // y value
    int size2 = schoolSizes[0]; //size of dot based on schoolSizesing 
    int width2 = size2; //Width same as size
    setFillColor("brown");//brown because it is their school color
    drawEllipse(x2, y2, size2, width2);    //draws a point with the variables from above
//_____________________________________________________________________________________
    //second college that i will place is Colombia University
    int x3 = 257; // x value 
    int y3 = 296; // y value
    int size3 = schoolSizes[1]; //size of dot based on schoolSizesing 
    int width3 = size3; //Width same as size
    setFillColor("blue");//blue because it is their school color
    drawEllipse(x3, y3, size3, width3);    //draws a point with the variables from above
//_____________________________________________________________________________________
    //third college that i will place is Cornell University
    int x4 = 174; // x value 
    int y4 = 258; // y value
    int size4 = schoolSizes[2]; //size of dot based on schoolSizesing 
    int width4 = size4; //Width same as size
    setFillColor("gray");//gray because it is their school color
    drawEllipse(x4, y4, size4, width4);    //draws a point with the variables from above
//_____________________________________________________________________________________
    //fourth college that i will place is Dartmouth
    int x5 = 251; // x value 
    int y5 = 170; // y value
    int size5 = schoolSizes[3]; //size of dot based on schoolSizesing 
    int width5 = size5; //Width same as size
    setFillColor("gray");//gray because it is their school color
    drawEllipse(x5, y5, size5, width5);    //draws a point with the variables from above
//_____________________________________________________________________________________
    //fifth college that i will place is Harvard University
    int x6 = 313; // x value 
    int y6 = 213; // y value
    int size6 = schoolSizes[4]; //size of dot based on schoolSizesing 
    int width6 = size6; //Width same as size
    setFillColor("red");//red because it is their school color
    drawEllipse(x6, y6, size6, width6);    //draws a point with the variables from above
//_____________________________________________________________________________________
    //sixth college that i will place is university of pennsylvania
    int x7 = 230; // x value 
    int y7 = 336; // y value
    int size7 = schoolSizes[5]; //size of dot based on schoolSizesing 
    int width7 = size7; //Width same as size
    setFillColor("red");//red because it is their school color
    drawEllipse(x7, y7, size7, width7);    //draws a point with the variables from above
//_____________________________________________________________________________________
    //seventh college that i will place is princeton
    int x8 = 240; // x value 
    int y8 = 325; // y value
    int size8 = schoolSizes[6]; //size of dot based on schoolSizesing 
    int width8 = size8; //Width same as size
    setFillColor("orange");//orange because it is their school color
    drawEllipse(x8, y8, size8, width8);    //draws a point with the variables from above
//_____________________________________________________________________________________
  
  //eigth college that i will place is yale
    int x9 = 280; // x value 
    int y9 = 275; // y value
    int size9 = schoolSizes[7]; //size of dot based on schoolSizesing 
    int width9 = size9; //Width same as size
    setFillColor("blue");//blue because it is their school color
    drawEllipse(x9, y9, size9, width9);    //draws a point with the variables from above
}

//this method will clear the scene after 10 seconds
//important because it makes sure i can include extra code
//after i call this i will display math values.
public void clearScene() {
    pause(10); //wait for 10 seconds
    clear("white"); //clear scene and make it white
}

//this next method uses multi selection statment
//it also uses the absolute value to print out the school with the most staff
  //plays my second sound

public void words(){
      drawText("The school with the most staff is:", 50, 100);//this adds the title for the last slide
  playSound("tadaa-47995.wav");//plays sound
  pause(3);
  for(int i = 0; i< name.length; i++){
boolean isHarvard = false;
 if (Math.abs(staffs[i]) < staffs[5]) {
            isHarvard = false;
        } else if (Math.abs(staffs[i]) > staffs[5]) {
            isHarvard = false;
        } else {
            isHarvard = true;
        }
  
      drawText(" Harvard!!!!!", 136, 185);//this adds the bottom text for the last slide


  }

  pause(3);
    clear("white");
}



//this next method also uses math to find the square root.
  //whichever square root is smaller will be correct
  //pauses for 3 sec between question and answer
  //will use multi-line selection statement at the end to ask a question
  //adds to my double string

public void trivia() {
    // First start by adding to my new list
    for (int i = 0; i < 8; i++) {
        squareRoots[i] = (int) Math.sqrt(staffs[i]);    // FIND THE SQUARE ROOTS TO COMPARE
    }
    // Display the question
  drawText("  Which is smaller: Brown or Cornell?", 40, 100);
  pause(5);

    // Use Math.min to compare the square roots of Brown and Cornell
    double minV = Math.min(squareRoots[0], squareRoots[2]); //FINDS THE SMALLER OF THE 2
    if (minV == squareRoots[0]) {
        drawText("Brown University!", 125, 185); // This adds the bottom text for the trivia slide
    } else {
    drawText("Cornell University!", 110, 185); // This adds the bottom text for the trivia slide
    }
  pause(3);
    clear("white");
//_____________________________________________
//now use math to find the max

  drawText("   Which is larger: Yale or Harvard?", 40, 100);
  pause(5);
    // Use Math.max to compare the square roots of yale and Harvard
    double maxV = Math.min(squareRoots[4], squareRoots[7]); //FINDS THE BIGGER OF THE 2
    if (maxV == squareRoots[7]) {
        drawText("Yale University!", 136, 185); // This adds the bottom text for the trivia slide
    } else {
    drawText("Harvard University!", 110, 185); // This adds the bottom text for the trivia slide
    }
  pause(3);
    clear("white");

//____________________________________________________________
  //now im going to ask them if they can guess how much money that princeton would have if their money was cubed

drawText(" Guess what Princeton's funds are cubed!", 12, 100);
  pause(5);
    // Use Math.pow to see princetons money cubed
    double MONEY = Math.pow(fund[6], 3); //takes princetons money and cubes it
    if (MONEY == 17576) {//this double checks to make sure the math is right
      drawText("It would be $17576", 116, 185); // This adds the bottom text for the trivia slide
    } else {
    drawText("oops! try again ", 110, 185); // This adds the bottom text for the trivia slide
    }
  pause(3);
    clear("white");


      drawText("Goodbye! Thanks for Watching!", 50, 185); // This adds the bottom text for the trivia slide
      drawText("Check the console to easily find my code!", 25, 245); // This adds the bottom text for the trivia slide

  
}







  
}