# Idea for project
Idea is to make a GUI from PySide6, and connect with a Java CLI which parses
and updates the records made for it.

# Application logic
The records will be stored on a JSON file, which will store the following:
- People who are buying items for bunking together
- Which item was bought
- By who was the last item bought by
- How many times was an item bought
- How much did the bought item cost 

The **java** program will parse the items with the following logic:
- An Item has a Name, description, cost-range, number of times bought
- An User has a Name, Total number of items bought, total expenditure
- An objectX has a  
- An objectX has a  

The **python** program will call a bash script which will call the Java
program and return an output to the GUI. 

The GUI will:
- Show the records of every user

