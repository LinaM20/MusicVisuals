package C19366191;

import processing.core.*;


public class Rain extends PApplet{
    LinasVisuals lv;
    float intensity = 300;
    float smooth_size = 0;
    
   
    public Rain(LinasVisuals lv)
    {
        this.lv = lv;
    }


    public void render() {


        lv.colorMode(PApplet.HSB);
        lv.calculateAverageAmplitude();
     

        for (int i = 0; i < 50; i++)
        {
            float x = random(width);
            float y = random(height);
            float r = 48;
            lv.stroke(PApplet.map(i, 0, 50, 0, 255)
            , 255
            , 255
            );
            lv.noFill();
        

            //bottom edge
            lv.camera(100, 100, 100, 0, 0, 1, 1, 1, -1);
            lv.translate(0, 0, 0);
            lv.line(x, y, r, r);


            //top edge
            lv.camera(100, 100, 100, 0, 0, 1, 1, 1, 1);
            lv.translate(0, 0, 0);
            lv.line(x, y, r, r);


            lv.camera(100, 100, 0, 0, 0, 1, 1, 1, 1);
            lv.translate(0, 0, 0);
            lv.line(x, y, r*5, r*5);

          
        }
    }

    
}
