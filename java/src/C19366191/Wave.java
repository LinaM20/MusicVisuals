package C19366191;

import processing.core.*;

public class Wave
{
    LinasVisuals lv;
    float cy = 0;

    public Wave(LinasVisuals lv)
    {
        this.lv = lv;
        cy = this.lv.width / 2;
    }

    public void render()
    {
        lv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        lv.translate(-75, 0, -100);


        lv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < 200; i ++)
        {
            lv.stroke(
                PApplet.map(i, 0, 200, 0, 255)
                , 255
                , 255
            );
            lv.line(-25 + i , 0, -25 + i,  30 * lv.getAudioBuffer().get(i));
        }
    }
}