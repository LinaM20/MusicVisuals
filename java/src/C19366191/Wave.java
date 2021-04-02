package C19366191;

import processing.core.PApplet;

// This is an example of a visual that renders the waveform
public class Wave extends PApplet
{
    LinasVisuals lv;
    float cy = 0;

    public Wave(LinasVisuals lv)
    {
        this.lv = lv;
        cy = this.lv.height ;
    }

        

    

    public void render()
    {
        lv.colorMode(PApplet.HSB);
        for(int i = 0 ; i < lv.getAudioBuffer().size() ; i++)
        {
            lv.stroke(PApplet.map(i, 0, lv.getAudioBuffer().size(), 0, 255), 255, 255);

            lv.line(i, cy, i, cy * lv.getAudioBuffer().get(i));
            lv.line(i, cy, i, cy + cy * lv.getAudioBuffer().get(i));
        }
    }
}