package C19366191;


import processing.core.*;

public class Cube extends PApplet {

    LinasVisuals lv;

    float angle = 0.5f;
    float boxSize = 300;
    float lerpVariable = 0;
    float size;
    

    public Cube (LinasVisuals lv)
    {
        this.lv = lv;
    }

    

    public void render() {
        
        lv.colorMode(PApplet.HSB);
        lv.calculateAverageAmplitude();

        lv.stroke(PApplet.map(lv.getSmoothedAmplitude(), 0, 1, 0, 255)
            , 200
            , 255
        );

        lv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        lv.translate(0, 0, -250);

        
        lv.rotateX(angle);
        lv.rotateY(angle);
        lv.rotateZ(angle);

        
        lv.noFill();
        lv.box(10 + lv.getSmoothedAmplitude() * boxSize);
        

        angle += 0.05f;

    }
    
}
