package C19366191;

import processing.core.*;

public class Circle extends PApplet {

    LinasVisuals lv;
    float intensity;
    float smooth_size;

    float width;
    float x;
    float y;

    public Circle(LinasVisuals lv, float x, float y, float width, float intensity)
    {
        this.lv = lv;
        this.x = x;
        this.y = y;
        this.width = width;
        this.intensity = intensity;
        
    }

    public void render() 
    {
        lv.colorMode(HSB);
    lv.noFill();

        lv.calculateAverageAmplitude();

        lv.stroke(map(lv.getSmoothedAmplitude(), 0, 1, 0, 255)
            , 255
            , 255
        );

        // lv.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        // lv.translate(-0, 0, -250);
        
        
        // lv.stroke(map(lv.getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
        //lv.strokeWeight(10);

        float size = width + (lv.getAmplitude() * intensity);
        smooth_size = lerp(smooth_size, size, 0.5f);

        lv.ellipse(x, y, smooth_size, smooth_size);
        
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setIntensity(float intensity) {
        this.intensity = intensity;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getIntensity() {
        return intensity;
    }

  
    
}
