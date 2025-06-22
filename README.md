# MULTITHREADED-CHAT-APPLICATION

COMPANY : CODTECH IT SOLUTION

NAME : MANSI RAJESHWAR PAWAR

INTERN ID : CITSOD604

DOMAIN : JAVA PROGRAMMING INTERN

DURATION : 4 WEEKS

MENTOR : NEELA SANTOSH

DESCRIPTION : A Multithreaded Chat Application in Java is a client-server based communication system that allows multiple users to chat with each other in real-time. It uses Java Sockets for network communication and Multithreading to handle multiple clients concurrently without blocking the server.Purpose is the primary aim of this application is to build a scalable chat system where:
A server listens for incoming connections.
Multiple clients can connect to the server and send/receive messages.
Each client is handled in a separate thread, allowing simultaneous conversations.
1. Server Side:
The server uses ServerSocket to listen on a port.
When a client connects, the server spawns a new thread to handle that client using a Socket.
The thread listens for messages from the client and broadcasts them to all connected clients.
2. Client Side:
The client connects to the server using a Socket.
It has two threads: one for sending messages and one for receiving messages, allowing full-duplex communication.

OUTPUT : 

