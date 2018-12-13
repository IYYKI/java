package Day15.worm;

public class WormPane {
    private Worm worm;

    public WormPane() {

    }

    public WormPane(Worm worm) {
        this.worm = worm;
    }

    public void print() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 40; j++) {
                if (i == 0 || i == 14) {
                    System.out.print("-");
                } else {
                    if (j == 0 || j == 19) {
                        System.out.print("|");
                    }else if (worm.contains(i,j)){
                        System.out.print("#");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}