print("Enter A: ")
A = int(input())

print("Enter B: ")
B = int(input())

for i in range(1, 6):
    if A > B:
        result = A + B
        print("Sum:", result)
    else:
        result = A * B
        print("Product:", result)

