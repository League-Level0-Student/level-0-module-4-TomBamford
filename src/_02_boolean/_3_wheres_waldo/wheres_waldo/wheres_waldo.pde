
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
boolean canPlaySounds = false;
PImage waldo;
boolean isFound = false;
void setup() {
  
  //Find a Where's Waldo picture and drop it into this sketch.     
  waldo = loadImage("waldo.jpeg"); // Change this to match your file name.
  size(600, 400); 
  waldo.resize(600,400);
 
  // Resize your waldo picture to the same size as the sketch
  
  // Make the waldo image your sketch background
  // Do range and domain
}

void draw() {
  background(waldo);

  if (mousePressed) {
    if (mouseX>= 370 && mouseX <= 420) {
      if (mouseY>= 195 && mouseY <= 280) {
      isFound = true;
      }
      else {
      isFound = false;
      }
    }
    else {
      isFound = false;
    }
  }
  
  
  if(isFound) {
    fill(#120E0E);
    text("Waldo Found!",20,30);
  }
  else {
    fill(#120E0E);
    text("Waldo is not Found!",20,30);
  }
      // If the user presses the mouse .......
  
          // Use this print statement to help you find the location of Waldo to use in the code below
          // println("X: " + mouseX + " Y: " + mouseY); 
    
          // Check if the location of the mouse is anywhere on the image of Waldo.
          // If it is, print “Waldo found!”  Use the text() command to write it on the sketch.

    
          // However, if the mouse is not on Waldo, print "Not here!" 
          // Use the text() command to write it on the sketch.                    
                
}

/*********************  This code is needed to play sounds. ********************
              Remove the comment markers below, but DON'T CHANGE THE CODE */
              

/*
import ddf.minim.*;
Minim minim = new Minim(this); 

AudioSample woohoo;
void playWoohoo() {
     if (woohoo == null) 
         woohoo = minim.loadSample("homer-woohoo.wav");
     woohoo.stop();
     woohoo.trigger();
}

AudioSample doh;
void playDoh() {
     if (doh == null)
         doh = minim.loadSample("homer-doh.wav"); 
     doh.stop();
     doh.trigger();
}
*/
