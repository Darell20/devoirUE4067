public class Rectangle extends Formes {
    Rectangle(Couleur color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Rectangle filled with ");
        color.fillColor();
    }
}
