#include <iostream>
double taylorSeries(double x, int n) {
    double result = 1.0;
    double term = 1.0;

    for (int i = 1; i < n; ++i) {
        term = term * x / i;
        result += term;
    }
    return result;
}

int main() {
    double x = 2.0;
    int n = 10;
    std::cout << "Taylor Series approximation of e^" << x << " with " << n << " terms is: " 
            << taylorSeries(x, n) << std::endl;
    return 0;
}
