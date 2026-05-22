Alunos = [
    "WILL",
    "LIVIA"
]

User = input("Digite o nome de cadastro: ").upper()
if (User in Alunos):
    print("Já existe esse usuário")
else:
    print("Aluno cadastrado com sucesso!")
    Alunos.append(User)

print("Alunos cadastrados: ", Alunos)