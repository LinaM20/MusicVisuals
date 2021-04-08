package C19366191;

import processing.core.*;

public class Circle extends PApplet{

    LinasVisuals lv;
    int i = 0;
    float intensity = 300;
    float smooth_size = 0;
    
    float angle = 0.5f;

    public Circle(LinasVisuals lv)
    {
        this.lv = lv;
     
    }

    public void render ()
    {
        lv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        lv.noFill();
        lv.colorMode(HSB);
        lv.strokeWeight(2); 
    
        lv.calculateAverageAmplitude();
       
        float size = 10 + (lv.getSmoothedAmplitude() * intensity);
        smooth_size = lerp(smooth_size, size, 0.51f);
        
        for(int i = 0 ; i < lv.getAudioBuffer().size() ; i ++)
        {
            
            lv.ellipse(i , i, smooth_size, smooth_size);
            lv.translate(-1 , 0, -25);
            lv.stroke(PApplet.map(lv.getSmoothedAmplitude(), 0, 1, i*10, 255-i) //reduces the colour of the inner circles
                , 255
                , 255
                );
                
           
        }     
                  
           
    }
    
}
