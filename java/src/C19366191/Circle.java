package C19366191;

import processing.core.*;

public class Circle extends PApplet {

    LinasVisuals lv;
    float intensity = 500;
    float smooth_size = 0;

    float width;
    float x = 100;
    float y = 200;

    public Circle(LinasVisuals lv)
    {
        this.lv = lv;
     
        
    }

    
    
    

    public void draw() 
    {
        lv.background(0);
        
        lv.colorMode(HSB);
        lv.noFill();

        // lv.calculateAverageAmplitude();

        lv.stroke(map(lv.getSmoothedAmplitude(), 0, 1, 0, 255)
            , 255
            , 255
        );

        // //lv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        // lv.translate(0, -100);
        
        
        // lv.stroke(map(lv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        //lv.strokeWeight(10);

        float size = 10 + (lv.getAmplitude() * intensity);
        smooth_size = lerp(smooth_size, size, 0.1f);

        lv.ellipse(x, y, smooth_size, smooth_size);
        
    }

  

  
    
}
