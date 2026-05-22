Personagens = []

def newPersonagem(nome, classe, level, xp):
    personagem = {
        "Nome": nome,
        "Classe": classe,
        "Level": level,
        "Xp": xp,
        "Inventario": {}
    }

    Personagens.append(personagem)
def getAllPersonagens():
    for p in Personagens:
        print(
            f'Nome: {p["Nome"]} |',
            f'Classe: {p["Classe"]} |',
            f'Level: {p["Level"]} |',
            f'XP: {p["Xp"]}',
            f'Inventário: {p["Inventario"]}'
        )

def addItem(nome, item, qtditem):
    for p in Personagens:
        if not (p["Nome"].upper() == nome.upper()):
            print("Personagem não encontrado!")
        else:
            p["Inventario"]["Item"] = item
            p["Inventario"]["Quantidade"] = qtditem


newPersonagem("Will", "Guerreiro(a)", 1, 0)
newPersonagem("Livia", "Guerreiro(a)", 10, 0)

addItem("Will", "Espada", 1)
addItem("Livia", "Livro", 1)

getAllPersonagens()