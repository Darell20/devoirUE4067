public class Cercle extends Formes {
    Cercle(Couleur color) {
        super(color);
    }
    public void colorIt() {
        System.out.print("Circle filled with ");
        color.fillColor();
    }
}
