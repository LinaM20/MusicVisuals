package C19366191;

import processing.core.*;


//import ie.tudublin.Visual;


public class Sphere extends PApplet
{   
    LinasVisuals lv;
    float angle = 0;
    float  insideSphere = 0;
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
        
        boxSize = 10 + (lv.getAmplitude() * 500);

        insideSphere = lerp(insideSphere, boxSize, 0.1f);    

        //Makes the sphere spin
        p = 5 + (lv.getAmplitude() * 100);
        t = lerp(t, p, 0.05f); 
        
        lv.pushMatrix();

        lv.rotateX(theta);
        lv.rotateY(theta);
        lv.rotateZ(theta);
        //lv.translate(0,0, 0);
        //lv.noFill();

        lv.strokeWeight(3);
        
        lv.beginShape();
        
        
        lv.vertex(-t, -t, -t);
        lv.vertex(t, -t, -t);
        lv.vertex(   0,    0,  t);

        lv.vertex(t, -t, -t);
        lv.vertex( t,  t, -t);
        lv.vertex(   0,    0, t);

        lv.vertex( t, t, -t);
        lv.vertex(-t, t, -t);
        lv.vertex(   0,   0,  t);

        lv.vertex(-t,  t, -t);
        lv.vertex(-t, -t, -t);
        lv.vertex(   0,    0,  t);
        lv.endShape();

        theta += 0.01f;

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
