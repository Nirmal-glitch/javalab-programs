package pack;

public class arp {

    interface arpe {
        float area(float x, float y);
        float perimeter(float a, float b);
    }

    public class rectangle implements arpe {
        public float area(float x, float y) {
            return x * y;
        }

        public float perimeter(float a, float b) {
            return 2 * (a + b);
        }
    }

    public class circle implements arpe {
        public float area(float r, float pi) {
            return pi * r * r;
        }

        public float perimeter(float r, float pi) {
            return 2 * pi * r;
        }
    }
}