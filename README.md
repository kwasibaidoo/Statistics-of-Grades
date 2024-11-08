# Statistics of Grades
Write a program that reads the grades of  N students in a class on an assignment and stores them in an array scores of size N.

### 1. Search for and display:

1. The maximum grade of the class.
2. The minimum grade of the class.
3. The average grade of the class.

### 2. From the students' scores, establish an array stats of size 5 which is composed as follows:

* Stats[4] contains the number of grades above 80
* Stats[3] contains the number of grades from 61 to 80
* Stats[2] contains the number of grades from 41 to 60
* Stats[1] contains the number of grades from 21 to 40
* Stats[0] contains the number of grades from 0 to 20

Create a bar graph representing the scores array. Use the symbols ####### for bar representation and display the grade range below the graph.

Sample input: (The student's grades vary from 0 to 100)

```
2 20 21 22 23 30 48 49 50 55 60 65 72 63 76 80 68 90 85 98
```

Expected output in the console:

Values:

The maximum grade is 98

The minimum grade is 2

The average grade is 53.850000

Graph:
```

   6  >                                 #######
   5  >                       #######   #######
   4  >             #######   #######   #######
   3  >             #######   #######   #######   #######
   2  >   #######   #######   #######   #######   #######
   1  >   #######   #######   #######   #######   #######
      +-----------+---------+---------+---------+---------+
      I    0-20   I  21-40  I  41-60  I  61-80  I  81-100 I
```