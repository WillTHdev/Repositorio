import psycopg2

connection = psycopg2.connect(
        host="localhost",
        port=5433,
        dbname="connecPython",
        user="postgres",
        password="minha_senha"
    )

cursor = connection.cursor()

try:
    comando = "INSERT INTO bdestudos.usuarios (username, useremail) VALUES ('Will', 'will@gmail.com') ON CONFLICT (useremail) DO NOTHING"

    cursor.execute(comando)
    connection.commit()

except psycopg2.DatabaseError as erro:
    print(erro)

finally:
    if connection:
        cursor.close()
        connection.close()