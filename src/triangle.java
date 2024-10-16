class Triangle {
    double a, b, c;

    Triangle(double Aside, double Bside, double Cside) {
        a = Aside;
        b = Bside;
        c = Cside;
    }
    // Метод для вычисления площади по формуле Герона
    double area() {
        double p = (a + b + c) / 2;  // Полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}