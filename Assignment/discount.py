price = int(input('Enter the price of the goods bought: '))
discount = 0  # Initialize discount variable

try:
    goods_number = int(input('Enter the number of goods bought: '))
     
    if goods_number >= 21:
        discount = float((8/100) * (price * goods_number))
    elif goods_number >= 11:
        discount = float((6/100) * (price * goods_number))
    elif goods_number >= 6:
        discount = float((4/100) * (price * goods_number))
    elif goods_number > 0:
        discount = float((2/100) * (price * goods_number))
    else:
        print("invalid goods number")

    gross_pay = float(price) * goods_number
    payable_amount = gross_pay - discount
    print(f'The amount to pay before discount is {gross_pay}\nThe discount for this price is {discount}\nThe price to pay after discount is {payable_amount}')

except ValueError:
    print('Invalid input for the number of goods bought. Please enter a valid integer.')
