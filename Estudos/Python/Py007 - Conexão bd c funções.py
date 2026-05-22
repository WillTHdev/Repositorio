import psycopg2

def connectDatabase():
    connection = psycopg2.connect(
        host="localhost",
        port=5433,
        dbname="connecPython",
        user="postgres",
        password="minha_senha"
    )
    return connection

def createTable(conn: psycopg2.extensions.connection, command):
    cursor = conn.cursor()
    cursor.execute(command)
    conn.commit()

if __name__ == '__main__':
    try:
        conn = connectDatabase()

        command = ''' 
                    CREATE TABLE bdestudos.usuarios2(
                        userid int GENERATED ALWAYS AS IDENTITY,
                        username varchar(90) NOT NULL,
                        useremail varchar(90) NOT NULL UNIQUE,
                        CONSTRAINT pk_iduser PRIMARY KEY (userid)
                    )
                  '''
        createTable(conn, command)

    except psycopg2.DatabaseError as erro:
        print("[SERVER]:", erro)

    finally:
        if conn:
            conn.close()