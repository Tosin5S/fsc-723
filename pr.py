qty = float(input("Enter the quantity: "))
price = float(input("Enter the price: "))

grossPay = qty * price

if (qty >= 21):
    discount = grossPay * 0.08
elif (qty >= 11 and qty <= 20):
    discount = grossPay * 0.06
elif (qty >= 6 and qty <= 10):
    discount = grossPay * 0.04
elif (qty >= 1 and qty <= 5):
    discount = grossPay * 0.02
else:
    print("Invalid value")

netPay = grossPay - discount

print("The gross pay without discount is ", grossPay)
print("The discount is ", discount)
print("The netPay is ", netPay)