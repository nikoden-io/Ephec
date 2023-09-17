from termcolor import colored


def horner_method(number: str, number_base: int) -> int:
    print(colored("Starting Horner's Method for conversion to base 10.", "yellow"))
    v = int(number[0])
    print(colored(f"Initialization: v = {v}", "light_blue"))

    for c in number[1:]:
        c = int(c)
        print(colored(f"Next digit: {c}", "blue"))
        v = v * number_base + c
        print(colored(f"New value of v: {v}", "light_blue"))

    print(
        colored(f"The number {number} in base {number_base} is {v} in base 10.", "cyan")
    )
    return v


def base_10_to_other(number: int, number_base: int) -> str:
    print(colored("Starting conversion from base 10 to another base.", "yellow"))
    q = number
    result = []
    print(colored(f"Initialization: q = {q}", "light_blue"))

    while q > 0:
        r = q % number_base
        print(colored(f"Remainder: {r}", "blue"))
        q = q // number_base
        print(colored(f"New value of q: {q}", "light_blue"))
        result.insert(0, str(r))

    print(
        colored(
            f"The number {number} in base 10 is {''.join(result)} in base {number_base}.",
            "cyan",
        )
    )
    return "".join(result)


if __name__ == "__main__":
    print(
        colored(
            "Choose conversion type\n1: Other to Base 10\n2: Base 10 to Other",
            "cyan",
        )
    )
    choice = input(
        colored(
            "Your choice: ",
            "green",
        )
    )

    if choice == "1":
        nb = input(colored("Enter the number to convert: ", "light_magenta"))
        base = int(input(colored("Enter the base of the number: ", "light_magenta")))
        horner_method(nb, base)
    elif choice == "2":
        n = int(input(colored("Enter the number to convert: ", "light_magenta")))
        base = int(input(colored("Enter the base to convert to: ", "light_magenta")))
        base_10_to_other(n, base)
    else:
        print(colored("Invalid choice.", "red"))
