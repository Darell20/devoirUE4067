public class Carré extends Formes {
    Carré(Couleur color) {
        super(color);
    }

    public void colorIt() {
        System.out.print("Square filled with ");
        color.fillColor();
    }
}
