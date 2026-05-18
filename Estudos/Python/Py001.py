num1 = int(input("Digite um número: "))
num2 = int(input("Digite outro número: "))
opt = input("Oque deseja utilizar? [+] [-] [*] [/]")

match opt:
    case "+":
        result = num1 + num2
    case "-":
        result = num1 - num2
    case "*":
        result = num1 * num2
    case "/":
        result = num1 / num2

print(f"Resultado: {result}")