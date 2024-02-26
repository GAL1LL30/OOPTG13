# Sockets

## Grundeinstellungen

### Port

Um einen Client mit eienm Server zu verbinden, muss zunächst die gleiche Port-Nummer bei beiden eingestellt werden, um sicher zu stellen, dass sich auch beide finden können. Im Beispiel wird hierzu der Port '9876' genutzt.

#### Beispiel 1
````java
// Im SocketSerer
private static int port = 9876;
server = new ServerSocket(port);

// Im SocketClient
socket = new Socket(/*Ip-Adresse Server*/, 9876);
````

### IP-Adresse

Wie im oberen Code schon zu sehen ist, muss der Client die IP-Adresse des Servers kenn um ihm so im Inter- oder Intranet anfragen schicken zu könen. heirzu nutzt man in der Client-Klasse die Methode:
````java
host.getHostName();
```` 
Diese Methode ermittelt die IP-Adresse des Servers, welcher auf dem gleichen Port kommuniziert und nutzt diese dann an der Stelle 'IP-Adresse Server' im obigen Beispiel 1. So wird daraus:
````java
socket = new Socket(host.getHostName(), 9876);
````
### Server 
Der Server erstellt bei jeder Anfrage einen neuen Socket, über welchen der Client und der Server kommuniziernen. Hierzu wird in der Klasse SocketServer, in der Main-Methode, zunächst ein Socket erstellt, in welchem der Port für die Kommunikation festgelegt wird, und im Anschluss in einer while(ture)-Schleife stetig einer neuer Socket erstellt, für jede Anfrage, welche der Server erhält, wodurch der Server dem Client dann auch antworten kann.

#### Beispiel 2
````java
server = new ServerSocket(port);
//...

while(true){
    //...    
    Socket socket = server.accept();
    //...
}    
```` 

## Kommunikation Server-Client

Um eine Kommunikation zwischen Server und Client zu realisieren, muss zunächt der Server gestartet werden, da sonst der Client keine Verbindung zum Server aufbauen kann und im Programm somit eine Exception geworfen wird. Nach dem Start des Servers wartet dieser dann


















//eigener Interpreter