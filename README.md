# Vetture
creare un file di testo, vetture.txt per cui ogni riga del file è composta da
  targa|marca|nome_proprietario
  usare il simbolo | come separatore.
  
  Il programma attraverso delle funzioni di utilità deve essere in grado di
  - creare vetture in modo randomico
    - creare randomicamente le targhe (del tipo XC45FR, quindi 2 caratteri maiuscoli, seguiti da 2 cifre da 0 a 9 e altri 2 caratteri maiuscoli.
    - le targhe devono essere univoche (eseguire un controllo prima di scrivere su file, in caso di collisione lanciare una eccezione custom, VehicleDuplicationException
    - la marca deve essere presa, randomicamente da un enum FIAT, ALFA_ROMEO, TOYOTA, FERRARI, FORD, BMW
    - i nominativi devono essere presi da un array statico definito da qualche parte, che contiene le stringhe (nome e cognome in un unico attributo). (creare 30 persone, vanno bene anche supereroi, minny e paperino)

  - creare 30 vetture, ogni proprietario possiede una sola vettura.
  - creare il file con la struttura prevista.
  - se il programma viene eseguito più volte, verificare la presenza del file precedente, cancellarlo e sostituirlo.

  Se trovate buchi di analisi vedetele come libertà implementative, sfruttatele per creare un programma utilizzando le strutture che più preferite, ma portate a casa il risultato.
  Il file si dovrà trovare in un percorso su disco specifico, che indicherete voi.