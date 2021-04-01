package C19366191;




import processing.core.PApplet;

public class Pryamid extends PApplet {

    LinasVisuals lv;

    // float size = random (25, 100);
    // float x = random(width);
    // float y = random(height);
    // float angle = 0;
    float theta = (float) 0.0;
    float p;
    float t = 100;

    

    public Pryamid(LinasVisuals lv)
    {
        this.lv = lv;
    }

    public void draw() {
        lv.colorMode(PApplet.HSB);

        lv.calculateAverageAmplitude();

        lv.stroke(PApplet.map(lv.getSmoothedAmplitude(), 0, 1, 0, 255)
            , 255
             , 255
        );
        lv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        lv.translate(0, 0, -300);

        p = 10 + (lv.getAmplitude() * 500);

        t = lerp(t, p, 0.1f); 
                
        

        lv.translate(width/2, height/2, 0);
        //lv.stroke(255);
        lv.rotateX(theta);
        lv.rotateY(theta);
        lv.translate(0,100, 10);
        //lv.noFill();

        
        
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

        theta += 0.05;

    }


    

 
            


        
    
    
}
