package C19366191;

import processing.core.*;


//import ie.tudublin.Visual;


public class Sphere extends PApplet
{   
    LinasVisuals lv;
    float angle = 0;
    float largerSphere = 0;
    float smallerSphere = 0;
    float tinySphere = 0;
    float boxSize;

    float theta = 0;
    float p;
    float t = 0;
    
    

    public Sphere(LinasVisuals lv)
    {
        this.lv = lv;
        
    }

   

    public void render()
    {

        
        lv.colorMode(PApplet.HSB);

        lv.calculateAverageAmplitude();

        lv.stroke(PApplet.map(lv.getSmoothedAmplitude(), 0, 1, 0, 255)
            , 255
            , 255
        );

        lv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        lv.translate(0, 0, -250);
        
        lv.noFill();
        
        //Makes the sphere spin
        boxSize = 10 + (lv.getAmplitude() * 500);
        largerSphere = lerp(largerSphere, boxSize, 0.1f);  
        
        boxSize = 10 + (lv.getAmplitude() * 300);
        smallerSphere = lerp(smallerSphere, boxSize, 0.025f); 
        
        boxSize = 10 + (lv.getAmplitude() * 100);
        tinySphere = lerp(tinySphere, boxSize, 0.025f);    

        lv.pushMatrix();

        lv.translate(0, 0, 0); //places sphere in the middle
        lv.rotateY(angle);
        lv.rotateX(angle);
        lv.rotateZ(angle);
        lv.strokeWeight(1);
        lv.sphere(largerSphere);

        lv.translate(0, 0, 0); //places sphere in the middle

        //changes the colour of the second sphere
        lv.stroke(PApplet.map(lv.getSmoothedAmplitude(), 0, 1, 200, 0)
            , 255
            , 255
        );
        lv.rotateY(angle);
        lv.rotateX(angle);
        lv.rotateZ(angle);
       
        
        lv.sphere(smallerSphere);


        lv.stroke(PApplet.map(lv.getSmoothedAmplitude(), 0, 1, 1000, 150)
            , 255
            , 255
        );
        lv.rotateY(angle);
        lv.rotateX(angle);
        lv.rotateZ(angle);
        lv.sphere(tinySphere);

        lv.popMatrix();

       

        angle += 0.01f; //rotates the sphere


        
    }


}
