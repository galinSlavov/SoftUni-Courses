package viceCity.models.guns;
//created by J.M.

public class Rifle extends BaseGun {

    private static final int BULLETS_PER_BARREL = 50;
    private static final int TOTAL_BULLETS = 500;

    public Rifle(String name) {

        super(name, BULLETS_PER_BARREL, TOTAL_BULLETS);
    }

    @Override
    public int fire() {
        this.setTotalBullets(this.getTotalBullets()-5);
        return 5;
    }
}
