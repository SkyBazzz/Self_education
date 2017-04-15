package patterns.delegate.delegatePrinter;

import patterns.delegate.delegators.Graphics;

public class Painter {
    Graphics graphics;

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void draw(){
        graphics.draw();
    }
}
