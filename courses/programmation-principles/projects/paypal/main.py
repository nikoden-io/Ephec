def get_commission(sale_amount: float):
    if sale_amount <= 0:
        return "Le montant d'une vente ne peut être nul ou négatif"

    commission_calculation = sale_amount * 0.034 + 0.35

    if commission_calculation > sale_amount:
        return 'Le montant de la commission est supérieur au montant de la vente'

    rate = commission_calculation / sale_amount

    return (f"La commission est de {commission_calculation}€\n"
            f"Le vendeur recevra {sale_amount - commission_calculation} €\n"
            f"Le taux est de {rate * 100}%")


if __name__ == '__main__':
    sale = input("Enter sale amount : ")
    print(get_commission(float(sale)))
