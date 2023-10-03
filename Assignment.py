price = int(input('Enter the price of the goods bought:: '))
goods_number = int(input('Enter the number of goods bought:: '))

gross_pay = float(price) * goods_number
# Validating Code
if goods_number <= 0:
    print('Your input should be greater than 0')
# Taking the lower limit in descending order
elif goods_number >= 21:
    discount = float((8/100) * int(gross_pay))
elif goods_number >= 11:
    discount = float((6/100) * int(gross_pay))
elif goods_number >= 6:
    discount = float((4/100) * int(gross_pay))
else:
    discount = float((2/100) * int(gross_pay))

payable_amount = gross_pay - discount
print(f'The amount to pay before discount is {gross_pay}\nThe discount for this price is {discount}\nThe price to pay after discount is {payable_amount}')