package C19366191;

import processing.core.*;


public class Pyramid extends PApplet {

    LinasVisuals lv;

    float theta = 0;
    float target;
    float smallerSphere = 0;
    float p;
    float t = 0;
 
    

    public Pyramid(LinasVisuals lv)
    {
        this.lv = lv;
    }

    public void render() {
        lv.colorMode(PApplet.HSB);

        lv.calculateAverageAmplitude();

        lv.stroke(PApplet.map(lv.getSmoothedAmplitude(), 0, 1, 0, 255)
            , 255
            , 255
        );

        lv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        lv.translate(0, 0, -250);

        p = 10 + (lv.getAmplitude() * 150);
        t = lerp(t, p, 0.1f); 

        target = 5 + (lv.getAmplitude() * 300);
        smallerSphere = lerp(smallerSphere, target, 0.05f); 

       
                
     
        lv.rotateX(theta);
        lv.rotateY(theta);
        lv.rotateZ(theta);
       

        lv.strokeWeight(2);
     
        
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
        //lv.translate(0, 0, -200);

        lv.endShape();
        
            
        
   
        

        theta += 0.025f;


    }

    


    

 
            


        
    
    
}

