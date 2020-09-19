PImage face;
void setup() {
face = loadImage("download.jpeg");
size (800, 800);
face.resize(800,800);
}

void draw() {
  background(face);
  fill(#F7F2F2);
  ellipse(340, 168, 50, 70);
  fill(#050505);
  //ellipse(mouseX, mouseY, 5, 10);
  fill(#F7F2F2);
  ellipse(397, 129, 50, 70);
  fill(#050505);
  //ellipse(mouseX+57, mouseY-39, 5, 10);
  
  if( mouseX < (340 -25) || mouseX > (340 + 25) || mouseY < ( 168 - 35) || mouseY > (168 + 35)) {
     ellipse(340, 168, 5, 10);
  }
  else {
    ellipse(mouseX, mouseY, 5, 10);
  }
  
    if( mouseX < (340 -25) || mouseX > (340 + 25) || mouseY < (168 - 35) || mouseY > (168 + 35)) {
     ellipse(397, 129, 5, 10);
  }
  else {
    ellipse(mouseX+57, mouseY-39, 5, 10);
  }
}
