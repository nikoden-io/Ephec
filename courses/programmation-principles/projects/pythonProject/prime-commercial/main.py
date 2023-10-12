def get_commission(sale_amount: float):
    if sale_amount <= 0:
        return "Le montant d'une vente ne peut être nul ou négatif"

    if sale_amount <= 5000:
        commission_calculation = sale_amount * 0.05
        commission_rate = 5

    elif 5000 < sale_amount <= 10000:
        commission_calculation = sale_amount * 0.1
        commission_rate = 10
    else:
        commission_calculation = sale_amount * 0.15
        commission_rate = 15

    return f"La commission est de {commission_calculation}€\nLe pourcentage de la commission est de {commission_rate}%"


if __name__ == '__main__':
    sale = input("Enter sale amount : ")
    print(get_commission(float(sale)))
