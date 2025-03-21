package ClassAsParameter;

public class ShopRunner {
        public static void main(String[] args) {
            Shop shop = new Shop();
            Display display = new Display();
            shop.ads(display);
            shop.ads(null);     }
    }

