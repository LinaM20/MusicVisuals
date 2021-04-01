package C19366191;

import processing.core.PApplet;

//import processing.core.*;
//import ie.tudublin.Visual;


public class Sphere extends PApplet
{   
    LinasVisuals lv;
    float angle = 0;
    float  insideSphere = 0;
    float boxSize;

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
        
        boxSize = 10 + (lv.getAmplitude() * 500);

        insideSphere = lerp(insideSphere, boxSize, 0.1f);    

        
        lv.pushMatrix();

        lv.translate(0, 0, 0); //places sphere in the middle
        lv.rotateY(angle);
        lv.rotateX(angle);
        lv.rotateZ(angle);
        lv.strokeWeight(1);
        lv.sphere(insideSphere);

        lv.popMatrix();

        angle += 0.01f; //rotates the sphere
        
    }


}
