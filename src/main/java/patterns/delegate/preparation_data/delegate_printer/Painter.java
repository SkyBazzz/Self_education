package patterns.delegate.preparation_data.delegate_printer;

import patterns.delegate.preparation_data.delegators.Graphics;

public class Painter {
    Graphics graphics;

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public void draw(){
        graphics.draw();
    }
}
