import org.code.theater.*;

public class TheaterRunner {
    public static void main(String[] args) {
        //MAKES A NEW DATA SCENE
        DataScene scene = new DataScene("names.txt", "area.txt", "funds.txt", "staff.txt");

       scene.startScene();//opening scene
       scene.clearScene();//clears the scene
        scene.drawImage("map.png", 0, 0, 415);//prints out the map for the background
         scene.chooseSizes();//finds the sizes for every dot
       
         scene.placeRandomHouse();//puts the house down
         scene.placeColleges();//puts the house down
       scene.clearScene();//clears scene
       scene.words();//prints school  with most staff
scene.trivia();//final game
     Theater.playScenes(scene);//plays the scene
      System.out.println("_____________________________________________________________________________"+"\n"+"HERES ALL THE CODE TO BE GRADED"+"\n"+"_____________________________________________________________________________"+"\n"+"Four 1d arrays and 2 new 1d arrays on lines 8-14" + "\n" + "four methods that use 1d arrays and multi-selection statements start on lines 31, 49, 168, 199" + "\n"+"4 different uses of math class on lines  174, 202, 223, 238"+"\n"+"2 different cases of random numbers on lines 76, 77, and 78,"+"\n"+"2 sounds are on lines 64 and 170");
    }
}