import math

def maclaurin_exp(x, n):
    result = 0.0
    for i in range(n):
        term = (x ** i) / math.factorial(i)
        result += term
    return result

# Example usage
x = 2  # Value of x
n = 10  # Number of terms
print(f"e^{x} ≈ {maclaurin_exp(x, n)}")
