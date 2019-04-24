#setup
import as Maven project
run zookeeper and kafka
Create two topics "menu-in" and "menu-out" 
Run App as spring boot(use port 8080)

#Web controller
 USE INTERNET EXPLORER( CHROME HAS ISSUES WITH WEBSOCKET)

#TO PUSH MENU IN BACK, USE:
http://localhost:8080/menu

#TO REQUEST USER INPUT, USE:
http://localhost:8080/order?foodItem=coffee&available=60&quantity=2&price=2.45

#TO SEE REAL TIME UPDATE , ENTER THE FOLLOWING:
http://localhost:8080

#ISSUES I FOUND
Real time updates working every other click
