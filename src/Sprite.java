import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Sprite {
    private Image image;
    private int x, y;
    private int dx, dy;

    public Sprite(String imageFile) {
        loadImage(imageFile);
    }

    private void loadImage(String imageName) {

        ImageIcon i = new ImageIcon(imageName);
        image = i.getImage();
    }

    public void move() {}

    private void loadImage() {}

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
