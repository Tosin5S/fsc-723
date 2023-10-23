output = "S/N itemName Qty UnitPrice GrossPay Discount Netpay \n"
# Initialize the totals
Tgp = 0
Td = 0
Tnp = 0

print("Number of items bought?")
n = int(input())
for i in range(1, n + 1):
    print("Item Name?")
    itemName = input()
    print("Unit price?")
    p = float(input())
    print("Quantity bought?")
    q = int(input())
    gp = p * q  # Gross pay
    Tgp += gp  # Increment Total gross pay
    d = 0
    if q >= 11:
        d = 0.1 * gp
    elif q >= 6:
        d = 0.06 * gp
    elif q >= 1:
        d = 0.03 * gp
    else:
        d = 0
    Td += d  # Increment total discount
    np = gp - d  # Net pay
    Tnp += np  # Increment net pay
    output += f"{i} \t \t {itemName} \t \t {q} \t \t {p} \t \t {gp} \t \t \t {d} \t \t \t {np} \n"

# Printing the outputs
print(output)
print("Total Grosspay = " + str(Tgp))
print("Total Discount given = " + str(Td))
print("Total NetPay = " + str(Tnp))
print("Thanks for your patronage = ")
